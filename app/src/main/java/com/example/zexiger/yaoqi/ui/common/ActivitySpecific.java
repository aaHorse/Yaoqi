package com.example.zexiger.yaoqi.ui.common;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.zexiger.yaoqi.MainActivity;
import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanSpecific;
import com.example.zexiger.yaoqi.component.ApplicationComponent;
import com.example.zexiger.yaoqi.component.DaggerHttpComponent;
import com.example.zexiger.yaoqi.net.ApiSpecific;
import com.example.zexiger.yaoqi.ui.adapter.Adapter_Specific;
import com.example.zexiger.yaoqi.ui.base.BaseActivity;
import com.example.zexiger.yaoqi.ui.common.contract.ContractBeanSpecific;
import com.example.zexiger.yaoqi.ui.common.presenter.PresenterSpecific;
import com.orhanobut.logger.Logger;
import com.qmuiteam.qmui.util.QMUIStatusBarHelper;
import com.qmuiteam.qmui.widget.QMUICollapsingTopBarLayout;
import com.qmuiteam.qmui.widget.QMUITopBar;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class ActivitySpecific extends BaseActivity<PresenterSpecific>
        implements ContractBeanSpecific.View {

    public static void startActivity(Context context,String comicid_){
        comicid=comicid_;
        Intent intent=new Intent(context,ActivitySpecific.class);
        context.startActivity(intent);
    }

    private static String comicid;
    private List<BeanSpecific.DataBean.ReturnDataBean.ChapterListBean>lists;
    private List<BeanSpecific.DataBean.ReturnDataBean.ChapterListBean>lists_2;
    private Adapter_Specific adapter_specific;
    private int flag=0;

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
        /*
        * 一行代码，设置沉浸式状态栏，没有做机型检查
        * */
       QMUIStatusBarHelper.translucent(this);
    }

    @Override
    public void initData() {
        mPresenter.getData(comicid);
    }

    @Override
    public void loadData(BeanSpecific beanSpecific) {
        BeanSpecific.DataBean.ReturnDataBean.ComicBean comicBean=beanSpecific.getData().getReturnData().getComic();
        lists=new ArrayList<>();
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
        //热度值，没有找到数据
        //月票，没有找到数据
        Glide.with(MyApp.getContext()).load(comicBean.getCover()).into(imageView_3);
        textView_5.setText(comicBean.getDescription());
        textView_6.setText(comicBean.getTicket_desc());
        textView_7.setText(comicBean.getTagList().get(1)+"(更新至"+lists.size()+"话)");


        lists_2=new ArrayList<>();
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
        recyclerView.setAdapter(adapter_specific);
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
            if(lists.get(i)!=null){
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
            if(lists.get(i)!=null){
                lists_2.add(lists.get(i));
                n++;
                if(n==5){
                    break;
                }
            }
        }
        adapter_specific.notifyDataSetChanged();
    }
    @OnClick(R.id.button_kai)void func_6(){
        Fragment_specific_1.startFragment(lists,getSupportFragmentManager(),flag);
    }
}
