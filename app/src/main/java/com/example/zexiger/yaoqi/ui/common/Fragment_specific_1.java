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
import android.widget.Button;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanSpecific_combine;
import com.example.zexiger.yaoqi.ui.adapter.Adapter_Specific;
import com.example.zexiger.yaoqi.utils.T;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.example.zexiger.yaoqi.ui.common.ActivitySpecific.FLAG;


public class Fragment_specific_1 extends Fragment {
    public static void startFragment(List<BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean> lists_,
                                     FragmentManager fragmentManager_){
        lists=lists_;
        fragmentManager=fragmentManager_;
        FragmentTransaction transaction=fragmentManager_.beginTransaction();
        fragment=new Fragment_specific_1();
        transaction.replace(R.id.fl_specific,fragment);
        transaction.commit();
    }

    private static FragmentManager fragmentManager;
    private static Fragment_specific_1 fragment;
    private static List<BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean>lists;
    private static List<BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean>temp=new ArrayList<>();//临时使用
    @BindView(R.id.rv_specific_2)RecyclerView recyclerView;
    Adapter_Specific adapter;
    @BindView(R.id.bt_shunxv)Button button;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_specific_1,container,false);
        ButterKnife.bind(this,view);
        if(FLAG==0){
            button.setText("逆序");
        }else{
            button.setText("顺序");
        }
        adapter=new Adapter_Specific(lists);
        recyclerView.setLayoutManager(new LinearLayoutManager(MyApp.getContext()));
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                if(lists.get(position).getType()==0){
                    ActivitySpecificContent.startActicity(MyApp.getContext(),lists,position);
                }else{
                    T.showShort(MyApp.getContext(),"该章节仅限VIP阅读");
                }
            }
        });
        return view;
    }

    @OnClick(R.id.button_load_specific)void func_1(){

    }
    @OnClick(R.id.bt_shunxv)void func_3(){
        if(FLAG==0){
            FLAG=1;
            button.setText("顺序");
        }else {
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
    @OnClick(R.id.button_shou)void func_4(){
        ActivitySpecific activitySpecific=(ActivitySpecific)getActivity();
        activitySpecific.func_8();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.remove(fragment);
        transaction.commit();
    }
}
