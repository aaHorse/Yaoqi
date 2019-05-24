package com.example.zexiger.yaoqi.ui.common;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Base64;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanSpecific;
import com.example.zexiger.yaoqi.bean.BeanSpecific_2;
import com.example.zexiger.yaoqi.bean.Status;
import com.example.zexiger.yaoqi.component.ApplicationComponent;
import com.example.zexiger.yaoqi.component.DaggerHttpComponent;
import com.example.zexiger.yaoqi.ui.adapter.Adapter_Specific;
import com.example.zexiger.yaoqi.ui.base.BaseActivity;
import com.example.zexiger.yaoqi.ui.common.contract.ContractBeanSpecific;
import com.example.zexiger.yaoqi.ui.common.presenter.PresenterSpecific;
import com.orhanobut.logger.Logger;
import com.qmuiteam.qmui.util.QMUIStatusBarHelper;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class ActivitySpecific extends BaseActivity<PresenterSpecific>
        implements ContractBeanSpecific.View {

    /*
    * 一下两个启动活动的函数，是为了间接实现函数赋默认值，
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
    private List<BeanSpecific.DataBean.ReturnDataBean.ChapterListBean>lists=new ArrayList<>();
    private List<BeanSpecific.DataBean.ReturnDataBean.ChapterListBean>lists_2=new ArrayList<>();;
    private Adapter_Specific adapter_specific;
    private int flag=0;
    private static boolean isFavorite;
    private static BeanSpecific beanSpecific;

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
    public void loadData(BeanSpecific beanSpecific_) {
        beanSpecific=beanSpecific_;
        BeanSpecific.DataBean.ReturnDataBean.ComicBean comicBean=beanSpecific.getData().getReturnData().getComic();
        for(int i=0;i<beanSpecific.getData().getReturnData().getChapter_list().size();i++){
            BeanSpecific.DataBean.ReturnDataBean.ChapterListBean obj=beanSpecific.getData().getReturnData().getChapter_list().get(i);
            obj.setItemType(1);
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

        for(int i=0;i<lists.size();i++){
            BeanSpecific.DataBean.ReturnDataBean.ChapterListBean obj=lists.get(i);
            if(obj!=null){
                lists_2.add(obj);
                if(i==4){
                    break;
                }
            }
        }
        adapter_specific=new Adapter_Specific(lists_2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter_specific.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                if(lists_2.get(position).getType()==0){
                    ActivitySpecificContent.startActicity(MyApp.getContext(),lists,position);
                }else{
                    T("该章节仅限VIP阅读");
                }
            }
        });
        recyclerView.setAdapter(adapter_specific);
    }

    @Override
    public void loadData_2(BeanSpecific_2 beanSpecific_2) {
        BeanSpecific_2.DataBean.ReturnDataBean.ComicBean obj=beanSpecific_2.getData().getReturnData().getComic();
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


    @OnClick(R.id.bt_specific_1)void func_1(){

    }
    @OnClick(R.id.bt_specific_2)void func_2(){

    }
    @OnClick(R.id.bt_specific_3)void func_3(){

    }
    @OnClick(R.id.button_zhengxv)void func_4(){
        lists_2.clear();
        flag=0;
        for(int i=0;i<5;i++){
            if(lists.size()>i){
                lists_2.add(lists.get(i));
                if(i==4){
                    break;
                }
            }
        }
        adapter_specific.notifyDataSetChanged();
    }
    @OnClick(R.id.button_daoxv)void func_5(){
        flag=1;
        lists_2.clear();
        int n=0;
        for(int i=lists.size()-1;i>=0;i--){
            lists_2.add(lists.get(i));
            n++;
            if(n==5){
                break;
            }
        }
        adapter_specific.notifyDataSetChanged();
    }
    @OnClick(R.id.button_kai)void func_6(){
        Fragment_specific_1.startFragment(lists,getSupportFragmentManager(),flag);
    }

    @OnClick(R.id.bt_specific_4)void func_7(){
        String comic_id=beanSpecific.getData().getReturnData().getComic().getComic_id();
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
}
