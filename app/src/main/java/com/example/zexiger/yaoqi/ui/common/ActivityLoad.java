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
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanSpecificContent;
import com.example.zexiger.yaoqi.bean.BeanSpecific_combine;
import com.example.zexiger.yaoqi.bean.PrepareClass;
import com.example.zexiger.yaoqi.component.ApplicationComponent;
import com.example.zexiger.yaoqi.component.DaggerHttpComponent;
import com.example.zexiger.yaoqi.database.LoadClass;
import com.example.zexiger.yaoqi.ui.adapter.AdapterLoad;
import com.example.zexiger.yaoqi.ui.base.BaseActivity;
import com.example.zexiger.yaoqi.ui.common.contract.ContractLoad;
import com.example.zexiger.yaoqi.ui.common.presenter.PresenterLoad;
import com.example.zexiger.yaoqi.utils.T;
import com.orhanobut.logger.Logger;
import com.qmuiteam.qmui.util.QMUIStatusBarHelper;
import com.qmuiteam.qmui.widget.QMUITopBarLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
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
    private static List<BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean>lists_checked=new ArrayList<>();//被选中的
    @BindView(R.id.rv_load_1_1)RecyclerView recyclerView;
    private AdapterLoad adapter;
    @BindView(R.id.tv_load_1_1)TextView textView;
    @BindView(R.id.bt_load_1_1)Button button;
    @BindView(R.id.topbar) QMUITopBarLayout mTopBar;
    private LocalBroadcastManager mLocalBroadcastManager;
    private MyBroadcastReceiver mBroadcastReceiver;
    public final static String FROM_Thread = "FROM_Thread";
    public final static String FROM_tongzhilan = "FROM_tongzhilan";
    public final static String DONE="DONE";
    private DownLoadService.MyBinder binder;
    private List<PrepareClass> prepareClassList=new ArrayList<>();//下载前，在本类完成链接等资源的准备
    private int task;//用于按顺序下载信息
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
        if(FLAG==0){
            //正序
            for(int i=0;i<lists.size();i++){
                if(lists.get(i).isChecked()){
                    lists_checked.add(lists.get(i));
                }
            }
        }else{
            //逆序
            for(int i=lists.size()-1;i>=0;i--){
                if(lists.get(i).isChecked()){
                    lists_checked.add(lists.get(i));
                }
            }
        }
        if(lists_checked.size()==0){
            T.showDefultToast(MyApp.getContext(),"还没有选择下载内容");
        }else{
            if(binder==null){
                return;
            }else{
                load();
            }
        }
    }

    /*
    *下载
    * */
    private void load(){

        prepareClassList.clear();
        task=1;
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<lists_checked.size();i++){
                    while(true){
                        if(task==1){
                            mPresenter.getData(lists_checked.get(i).getChapter_id());
                            task=0;
                            break;
                        }
                    }
                }
            }
        }).start();
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
        adapter=new AdapterLoad(lists);
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
    public void loadData(BeanSpecificContent beanSpecificContent_, String chapter_id) {
        beanSpecificContent=beanSpecificContent_;
        String path= Environment.getExternalStorageDirectory().getAbsolutePath()+ "/youyaoqi/"+comicid+"/"
                +beanSpecificContent.getData().getReturnData().getChapter_id()+".zip";
        PrepareClass obj=new PrepareClass();
        obj.setChapter_id(chapter_id);
        obj.setPath(path);
        obj.setZip_file_high(beanSpecificContent.getData().getReturnData().getZip_file_high());
        prepareClassList.add(obj);

        task=1;
        func_10(chapter_id);
        if(prepareClassList.size()==lists_checked.size()){
            binder.startDownLoad(prepareClassList);
        }
    }

    /*
    * 本地接收器
    * */
    private class MyBroadcastReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            switch (intent.getAction()) {
                case FROM_Thread:
                    String progress=intent.getStringExtra("progress")+"%";
                    String chapter_id=intent.getIntExtra("load_n",-1)+"";
                    for(int i=0;i<lists_checked.size();i++){
                        if(chapter_id.equals(lists_checked.get(i).getChapter_id())){
                            func_9(chapter_id,progress);
                        }
                    }
                    break;
                case FROM_tongzhilan:
                    //暂停或继续
                    Logger.d("AL通知栏发来了信息"+intent.getStringExtra("progress"));
                    break;
                case DONE:
                    String chapter_id_2=intent.getIntExtra("load_n",-1)+"";
                    func_7(chapter_id_2);
                    break;
                default:
                    Logger.d("在这里");
            }
        }
    }

    /*
    * 某一个下载完成后，修改当前的list
    * */
    private void func_7(String chapter_id){
        for(int i=0;i<lists.size();i++){
            if(chapter_id.equals(lists.get(i).getChapter_id())){
                lists.get(i).setChecked(false);
                lists.get(i).setLoad(true);
                if(FLAG==0){
                    //正序
                    lists.get(i).setIndex((i+1)+"");
                }else{
                    //逆序
                    lists.get(i).setIndex((lists.size()-i)+"");
                }
                adapter.notifyItemChanged(i);
                break;
            }
        }
    }

    private String func_8(){
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
        Logger.d(str);
        return str;
    }

    /*
    * 显示进度条的信息
    * */
    private void func_9(String chaterid,String progress){
        for(int i=0;i<lists.size();i++){
            if(lists.get(i).getChapter_id().equals(chaterid)){
                lists.get(i).setIndex(progress);
                break;
            }
        }
        adapter.notifyDataSetChanged();
    }

    /*
    * 将缓存信息写进数据库
    * */
    private void func_10(String chapter_id){
        for(int i=0;i<lists_checked.size();i++){
            if(chapter_id.equals(lists_checked.get(i).getChapter_id())){
                String str=lists_checked.get(i).getChapter_id();
                String name=lists_checked.get(i).getName();
                LoadClass loadClass=new LoadClass();
                loadClass.setComic_id(comicid);
                loadClass.setChapter_id(str);
                loadClass.setName(name);
                loadClass.setAddress(func_8());
                loadClass.setFlag(-1);
                loadClass.save();
            }
        }
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
