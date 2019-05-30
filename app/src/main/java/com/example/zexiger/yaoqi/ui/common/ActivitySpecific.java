package com.example.zexiger.yaoqi.ui.common;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanSpecific_combine;
import com.example.zexiger.yaoqi.bean.BeanSpecific_dynamic;
import com.example.zexiger.yaoqi.bean.Status;
import com.example.zexiger.yaoqi.component.ApplicationComponent;
import com.example.zexiger.yaoqi.component.DaggerHttpComponent;
import com.example.zexiger.yaoqi.database.LoadClass;
import com.example.zexiger.yaoqi.ui.adapter.Adapter_Specific;
import com.example.zexiger.yaoqi.ui.base.BaseActivity;
import com.example.zexiger.yaoqi.ui.common.contract.ContractBeanSpecific;
import com.example.zexiger.yaoqi.ui.common.presenter.PresenterSpecific;
import com.orhanobut.logger.Logger;
import com.qmuiteam.qmui.util.QMUIStatusBarHelper;

import org.litepal.crud.DataSupport;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class ActivitySpecific extends BaseActivity<PresenterSpecific>
        implements ContractBeanSpecific.View {

    /*
    * 以下两个启动活动的函数，是为了间接实现函数赋默认值，
    * 在书架过来的赋 1
    * 在其他地方过来的赋 0
    * */
    public static void startActivity(Context context,String comicid_,boolean isFavorite_){
        comicid=comicid_;
        isFavorite=isFavorite_;
        Intent intent=new Intent(context,ActivitySpecific.class);
        context.startActivity(intent);
    }
    public static void startActivity(Context context,String comicid_){
        comicid=comicid_;
        isFavorite=false;
        Intent intent=new Intent(context,ActivitySpecific.class);
        context.startActivity(intent);
    }

    private static String comicid;
    private List<BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean>lists=new ArrayList<>();//多个页面都是用这一个list
    private List<BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean>lists_2=new ArrayList<>();//本页面使用的list
    private List<BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean>temp=new ArrayList<>();//临时使用的
    private Adapter_Specific adapter_specific;
    public static int FLAG=0;
    private static boolean isFavorite;
    private static BeanSpecific_combine beanSpecificCombine;

    @BindView(R.id.image_specific_1)ImageView imageView_1;
    @BindView(R.id.image_specific_2)ImageView imageView_2;
    @BindView(R.id.text_specific_1)TextView textView_1;
    @BindView(R.id.text_specific_2)TextView textView_2;
    @BindView(R.id.text_specific_3)TextView textView_3;
    @BindView(R.id.text_specific_4)TextView textView_4;
    @BindView(R.id.image_specific_3)ImageView imageView_3;
    @BindView(R.id.text_specific_5)TextView textView_5;
    @BindView(R.id.text_specific_6)TextView textView_6;
    @BindView(R.id.text_specific_7)TextView textView_7;
    @BindView(R.id.rv_specific_1)RecyclerView recyclerView;
    @BindView(R.id.bt_specific_4)TextView textView_8;
    @BindView(R.id.bt_shunxv)Button button;

    @Override
    public int getContentLayout() {
        return R.layout.activity_specific;
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
       QMUIStatusBarHelper.translucent(this);
    }

    @Override
    public void initData() {
        mPresenter.getData(comicid);
        mPresenter.getData_2(comicid);
    }

    @Override
    public void loadData(BeanSpecific_combine beanSpecific_combine_) {
        beanSpecificCombine = beanSpecific_combine_;
        BeanSpecific_combine.DataBean.ReturnDataBean.ComicBean comicBean= beanSpecificCombine.getData().getReturnData().getComic();
        //开数据库获取下载的信息
        List<LoadClass>loadClassList=DataSupport.where("comic_id = ?",comicBean.getComic_id()).find(LoadClass.class);
        for(int i = 0; i< beanSpecificCombine.getData().getReturnData().getChapter_list().size(); i++){
            BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean obj= beanSpecificCombine.getData().getReturnData().getChapter_list().get(i);
            obj.setItemType(1);
            //二重循环，一下子慢了几十倍。。。
            for(int j=0;j<loadClassList.size();j++){
                if(loadClassList.get(j).getChapter_id().equals(obj.getChapter_id())){
                    obj.setLoad(true);
                }else{
                    obj.setLoad(false);
                }
            }
            lists.add(obj);
        }
        Glide.with(MyApp.getContext()).load(comicBean.getWideCover())
                .into(imageView_1);
        Glide.with(MyApp.getContext()).load(comicBean.getWideCover())
                .into(imageView_2);
        textView_1.setText(comicBean.getName());
        textView_2.setText(comicBean.getAuthor().getName());
        Glide.with(MyApp.getContext()).load(comicBean.getCover()).into(imageView_3);
        textView_5.setText(comicBean.getDescription());
        textView_6.setText(comicBean.getTicket_desc());
        textView_7.setText(comicBean.getTagList().get(1)+"(更新至"+lists.size()+"话)");

        if(isFavorite){
            textView_8.setText("已收藏");
        }

        for(int i=0;i<7;i++){
            lists_2.add(lists.get(i));
        }
        adapter_specific=new Adapter_Specific(lists_2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter_specific.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                if(lists_2.get(position).getType()==0){
                    ActivitySpecificContent.startActicity(MyApp.getContext(),lists_2,position);
                }else{
                    T("该章节仅限VIP阅读");
                }
            }
        });
        recyclerView.setAdapter(adapter_specific);
    }

    @Override
    public void loadData_2(BeanSpecific_dynamic beanSpecific_dynamic) {
        BeanSpecific_dynamic.DataBean.ReturnDataBean.ComicBean obj= beanSpecific_dynamic.getData().getReturnData().getComic();
        textView_3.setText("热度值("+obj.getTotal_click()+")");
        textView_4.setText("本月月票"+obj.getMonth_ticket());
    }

    @Override
    public void loadData_3(Status status) {
        if(isFavorite){
            //取消收藏
            isFavorite=false;
            textView_8.setText("收藏");
            T("取消收藏成功");
        }else{
            //收藏
            isFavorite=true;
            textView_8.setText("已收藏");
            T("收藏成功");
        }
    }


    //返回
    @OnClick(R.id.bt_specific_1)void func_1(){

    }
    //更多
    @OnClick(R.id.bt_specific_2)void func_2(){

    }
    //下载
    @OnClick(R.id.bt_specific_3)void func_3(){
        ActivityLoad.startActivity(lists,comicid);
    }
    @OnClick(R.id.bt_shunxv)void func_5(){
        if(FLAG==0){
            button.setText("顺序");
            FLAG=1;
        }else{
            button.setText("逆序");
            FLAG=0;
        }
        temp.clear();
        for(int i=0;i<lists.size();i++){
            temp.add(lists.get(i));
        }
        lists.clear();
        for(int i=temp.size()-1;i>=0;i--){
            lists.add(temp.get(i));
        }
        lists_2.clear();
        for(int i=0;i<7;i++){
            lists_2.add(lists.get(i));
        }
        adapter_specific.notifyDataSetChanged();
    }
    @OnClick(R.id.button_kai)void func_6(){
        Fragment_specific_1.startFragment(lists,getSupportFragmentManager());
    }

    @OnClick(R.id.bt_specific_4)void func_7(){
        String comic_id= beanSpecificCombine.getData().getReturnData().getComic().getComic_id();
        if(isFavorite){
            //提交服务器取消收藏
            long last_update_time=(long)System.currentTimeMillis()/1000;
            String data_=getBase64(comic_id+"|delete|"+last_update_time+"|1^");
            Logger.d(data_);
            mPresenter.favorite_3(data_+"\n",1);
        }else{
            //提交服务器，收藏
            long last_update_time=(long)System.currentTimeMillis()/1000;
            String data_=getBase64(comic_id+"|add|"+last_update_time+"|1^");
            Logger.d(data_);
            mPresenter.favorite_3(data_+"\n",1);
        }
    }

    /*
     * md5加密代码
     * */
    public static String getBase64(String str){
        String result = "";
        if (str != null) {
            try {
                result = new String(Base64.encode(str.getBytes("utf-8"), Base64.NO_WRAP), "utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public void func_8(){
        if(FLAG==0){
            button.setText("逆序");
        }else{
            button.setText("顺序");
        }

        lists_2.clear();
        for(int i=0;i<7;i++){
            lists_2.add(lists.get(i));
        }
        adapter_specific.notifyDataSetChanged();
    }
}
