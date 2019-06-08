package com.example.zexiger.yaoqi.ui.common;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.os.IBinder;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanSpecificContent;
import com.example.zexiger.yaoqi.bean.BeanSpecific_combine;
import com.example.zexiger.yaoqi.component.ApplicationComponent;
import com.example.zexiger.yaoqi.component.DaggerHttpComponent;
import com.example.zexiger.yaoqi.database.LoadClass;
import com.example.zexiger.yaoqi.ui.adapter.Adapter_Load_1;
import com.example.zexiger.yaoqi.ui.base.BaseActivity;
import com.example.zexiger.yaoqi.ui.common.contract.ContractBeanSpecificContent;
import com.example.zexiger.yaoqi.ui.common.contract.ContractLoad;
import com.example.zexiger.yaoqi.ui.common.presenter.PresenterLoad;
import com.example.zexiger.yaoqi.ui.common.presenter.PresenterSpecificContent;
import com.example.zexiger.yaoqi.utils.T;
import com.orhanobut.logger.Logger;
import com.qmuiteam.qmui.util.QMUIStatusBarHelper;
import com.qmuiteam.qmui.widget.QMUITopBarLayout;

import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.example.zexiger.yaoqi.ui.common.ActivitySpecific.FLAG;

public class ActivityLoad
        extends BaseActivity<PresenterLoad> implements ContractLoad.View {
    public static void startActivity(List<BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean> lists_,
                                     String comicid_){
        lists=lists_;
        comicid=comicid_;
        Intent intent=new Intent(MyApp.getContext(),ActivityLoad.class);
        MyApp.getContext().startActivity(intent);
    }

    private static String comicid;
    private BeanSpecificContent beanSpecificContent;
    private static List<BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean>lists;
    private static List<BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean>temp=new ArrayList<>();//临时使用
    List<BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean>lists_checked=new ArrayList<>();//被选中的
    @BindView(R.id.rv_load_1_1)RecyclerView recyclerView;
    private Adapter_Load_1 adapter;
    @BindView(R.id.tv_load_1_1)TextView textView;
    @BindView(R.id.bt_load_1_1)Button button;
    @BindView(R.id.topbar)
    QMUITopBarLayout mTopBar;
    private LocalBroadcastManager mLocalBroadcastManager;
    private MyBroadcastReceiver mBroadcastReceiver;
    public final static String FROM_Thread = "FROM_Thread";
    public final static String FROM_tongzhilan = "FROM_tongzhilan";
    public final static String DONE="DONE";
    private DownLoadService.MyBinder binder;
    private ServiceConnection connection=new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            binder=(DownLoadService.MyBinder)service;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
           //
        }
    };


    /*
    * 正序或倒序按钮
    * */
    @OnClick(R.id.bt_load_1_1)void func_3(){
        if(FLAG==0){
            FLAG=1;
            button.setText("顺序");
        }else{
            FLAG=0;
            button.setText("逆序");
        }
        temp.clear();
        for(int i=0;i<lists.size();i++){
            temp.add(lists.get(i));
        }
        lists.clear();
        for(int i=temp.size()-1;i>=0;i--){
            lists.add(temp.get(i));
        }
        adapter.notifyDataSetChanged();
    }

    /*
    * 设置监听
    * */
    private void func_5(){
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean obj=lists.get(position);
                if(obj.isLoad()){
                    //Toast已经下载了
                    T.showDefultToast(MyApp.getContext(),"该章节已经下载了");
                    return ;
                }
                //
                if(obj.getType()==0){
                    if(obj.isChecked()){
                        obj.setChecked(false);
                    }else{
                        obj.setChecked(true);
                    }
                    adapter.notifyDataSetChanged();
                }else{
                    //Toast,不是免费的
                    T.showDefultToast(MyApp.getContext(),"该章节是收费的，无法下载");
                }
            }
        });
    }

    /*
    * 极速下载
    * */
    @OnClick(R.id.bt_load_1_2)void func_6(){
        lists_checked.clear();
        for(int i=0;i<lists.size();i++){
            if(lists.get(i).isChecked()){
                lists_checked.add(lists.get(i));
            }
        }
        if(lists_checked.size()==0){
            T.showDefultToast(MyApp.getContext(),"还没有选择下载内容");
        }else{
            if(binder==null){
                return;
            }else{
                load(0);
            }
        }
    }

    /*
    *下载
    * */
    private void load(int i){
        mPresenter.getData(lists_checked.get(i).getChapter_id(),i);
    }

    /*
    * 动态申请权限
    * */
    public static void verifyStoragePermissions(Activity activity) {
        int REQUEST_EXTERNAL_STORAGE = 1;
        String[] PERMISSIONS_STORAGE = {
                "android.permission.READ_EXTERNAL_STORAGE",
                "android.permission.WRITE_EXTERNAL_STORAGE" };
        try {
            //检测是否有写的权限
            int permission = ActivityCompat.checkSelfPermission(activity,
                    "android.permission.WRITE_EXTERNAL_STORAGE");
            if (permission != PackageManager.PERMISSION_GRANTED) {
                // 没有写的权限，去申请写的权限，会弹出对话框
                ActivityCompat.requestPermissions(activity, PERMISSIONS_STORAGE,REQUEST_EXTERNAL_STORAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getContentLayout() {
        return R.layout.activity_load;
    }

    @Override
    public void initInjector(ApplicationComponent appComponent) {
        DaggerHttpComponent.builder()
                .applicationComponent(appComponent)
                .build()
                .inject(this);
    }

    @Override
    public void bindView(View view, Bundle savedInstanceState) {
        textView.setText("共"+lists.size()+"话");
        StaggeredGridLayoutManager manager=new StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        adapter=new Adapter_Load_1(lists);
        recyclerView.setAdapter(adapter);
        if(FLAG==0){
            button.setText("逆序");
        }else{
            button.setText("正序");
        }
        initTopBar();
        func_5();
        //动态申请权限
        verifyStoragePermissions(this);
        //注册广播
        mLocalBroadcastManager = LocalBroadcastManager.getInstance(this);
        mBroadcastReceiver = new MyBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(FROM_Thread);
        intentFilter.addAction(FROM_tongzhilan);
        intentFilter.addAction(DONE);
        mLocalBroadcastManager.registerReceiver(mBroadcastReceiver, intentFilter);
        //绑定服务
        Intent intent=new Intent(this,DownLoadService.class);
        startService(intent);
        bindService(intent,connection,BIND_AUTO_CREATE);
    }

    @Override
    public void initData() {
        //
    }

    @Override
    public void loadData(BeanSpecificContent beanSpecificContent_, int load_n) {
        beanSpecificContent=beanSpecificContent_;
        String path= Environment.getExternalStorageDirectory().getAbsolutePath()+ "/youyaoqi/"+comicid+"/"
                +beanSpecificContent.getData().getReturnData().getChapter_id()+".zip";
        binder.startDownLoad(path,beanSpecificContent.getData().getReturnData().getZip_file_high(),load_n);
    }

    /*
    * 本地接收器
    * */
    private class MyBroadcastReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            switch (intent.getAction()) {
                case FROM_Thread:
                    //Logger.d(intent.getStringExtra("progress"));
                    break;
                case FROM_tongzhilan:
                    Logger.d("AL通知栏发来了信息"+intent.getStringExtra("progress"));
                    break;
                case DONE:
                    int load_n=intent.getIntExtra("load_n",-1);
                    if(load_n!=-1){
                        func_7(load_n);
                        load_n++;
                        if(load_n<lists_checked.size()){
                            load(load_n);
                        }
                    }
                    break;
                default:
                    Logger.d("在这里");
            }
        }
    }

    /*
    * 某一个下载完成后，将其写入数据库，以及修改当前的list
    * */
    private void func_7(int load_n){
        String str=lists_checked.get(load_n).getChapter_id();
        String name=lists_checked.get(load_n).getName();
        for(int i=0;i<lists.size();i++){
            if(str.equals(lists.get(i).getChapter_id())){
                lists.get(i).setChecked(false);
                lists.get(i).setLoad(true);
                adapter.notifyItemChanged(i);
                break;
            }
        }
        LoadClass loadClass=new LoadClass();
        loadClass.setComic_id(comicid);
        loadClass.setChapter_id(str);
        loadClass.setName(name);
        loadClass.setAddress(func_8(load_n));
        loadClass.save();
    }

    private String func_8(int load_n){
        String str="";
        List<BeanSpecificContent.DataBean.ReturnDataBean.ImageListBean>listBeans
                =beanSpecificContent.getData().getReturnData().getImage_list();
        /*
        * 注意这里，把压缩包的图片的描述信息转为字符串进行存储
        * */
        for(int i=0;i<listBeans.size();i++){
            BeanSpecificContent.DataBean.ReturnDataBean.ImageListBean bean=listBeans.get(i);
            if(bean.getImages()!=null&&bean.getImages().size()>0){
                str+=bean.getWidth()+","+bean.getHeight()+","+bean.getImages().get(0).getId()+";";
            }
        }
        return str;
    }

    private void initTopBar() {
        QMUIStatusBarHelper.translucent(this);
        mTopBar.addLeftBackImageButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        mTopBar.setTitle("我要下载");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //注销广播
        mLocalBroadcastManager.unregisterReceiver(mBroadcastReceiver);
        unbindService(connection);
    }
}
