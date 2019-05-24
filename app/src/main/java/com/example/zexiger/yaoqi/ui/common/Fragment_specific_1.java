package com.example.zexiger.yaoqi.ui.common;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanSpecific;
import com.example.zexiger.yaoqi.ui.adapter.Adapter_Specific;
import com.example.zexiger.yaoqi.utils.T;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class Fragment_specific_1 extends Fragment {
    public static void startFragment(List<BeanSpecific.DataBean.ReturnDataBean.ChapterListBean> lists_,
                                     FragmentManager fragmentManager_,int flag_){
        lists=lists_;
        flag=flag_;
        fragmentManager=fragmentManager_;
        FragmentTransaction transaction=fragmentManager_.beginTransaction();
        fragment=new Fragment_specific_1();
        transaction.replace(R.id.fl_specific,fragment);
        transaction.commit();
    }

    private static FragmentManager fragmentManager;
    private static Fragment_specific_1 fragment;
    private static List<BeanSpecific.DataBean.ReturnDataBean.ChapterListBean>lists;//正序
    private static List<BeanSpecific.DataBean.ReturnDataBean.ChapterListBean>lists_2;//adapter使用的
    private static int flag;//正序或逆序
    @BindView(R.id.rv_specific_2)RecyclerView recyclerView;
    Adapter_Specific adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_specific_1,container,false);
        ButterKnife.bind(this,view);
        lists_2=new ArrayList<>();
        reversal();
        if(flag==0){
            zhengxv();
        }else{
            reversal();
        }
        adapter=new Adapter_Specific(lists_2);
        recyclerView.setLayoutManager(new LinearLayoutManager(MyApp.getContext()));
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                if(lists_2.get(position).getType()==0){
                    ActivitySpecificContent.startActicity(MyApp.getContext(),lists,position);
                }else{
                    T.showShort(MyApp.getContext(),"该章节仅限VIP阅读");
                }
            }
        });
        return view;
    }

    //正序
    private void zhengxv(){
        lists_2.clear();
        for(int i=0;i<lists.size();i++){
            lists_2.add(lists.get(i));
        }
    }

    //倒序
    private void reversal(){
        lists_2.clear();
        for(int i=lists.size()-1;i>=0;i--){
            lists_2.add(lists.get(i));
        }
    }

    @OnClick(R.id.button_load_specific)void func_1(){

    }
    @OnClick(R.id.button_zhengxv_2)void func_2(){
        if(flag==0){
            //
        }else{
            flag=0;
            zhengxv();
            adapter.notifyDataSetChanged();
        }
    }
    @OnClick(R.id.button_daoxv_2)void func_3(){
        if(flag==1){
            //
        }else {
            flag=1;
            reversal();
            adapter.notifyDataSetChanged();
        }
    }
    @OnClick(R.id.button_shou)void func_4(){
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.remove(fragment);
        transaction.commit();
    }
}
