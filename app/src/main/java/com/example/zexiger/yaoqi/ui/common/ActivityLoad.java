package com.example.zexiger.yaoqi.ui.common;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanSpecific;
import com.example.zexiger.yaoqi.ui.adapter.Adapter_Load_1;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityLoad extends AppCompatActivity {
    public static void startActivity(List<BeanSpecific.DataBean.ReturnDataBean.ChapterListBean> lists_, int flag_){
        lists=lists_;
        flag=flag_;
        Intent intent=new Intent(MyApp.getContext(),ActivityLoad.class);
        MyApp.getContext().startActivity(intent);
    }

    private static List<BeanSpecific.DataBean.ReturnDataBean.ChapterListBean>lists;//正序
    private static List<BeanSpecific.DataBean.ReturnDataBean.ChapterListBean>lists_2=new ArrayList<>();//adapter使用的
    private static int flag;//正序或逆序
    @BindView(R.id.rv_load_1_1)RecyclerView recyclerView;
    private Adapter_Load_1 adapter;
    @BindView(R.id.tv_load_1_1)TextView textView;
    @BindView(R.id.bt_load_1_1)Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);
        ButterKnife.bind(this);


        textView.setText("共"+lists.size()+"话");
        func_4(flag);
        StaggeredGridLayoutManager manager=new StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        adapter=new Adapter_Load_1(lists_2);
        recyclerView.setAdapter(adapter);

    }

    /*
    * 正序或倒序按钮
    * */
    @OnClick(R.id.bt_load_1_1)void func_3(){
        if(flag==0){
            flag=1;
        }else{
            flag=0;
        }
        func_4(flag);
    }

    /*
    * 获取对应顺序的list_2
    * */
    private void func_4(int sequence){
        if(sequence==0){
            //正序
            lists_2.clear();
            for(int i=0;i<lists.size();i++){
                lists_2.add(lists.get(i));
            }
            button.setText("逆序");
        }else{
            //逆序
            lists_2.clear();
            for(int i=lists.size()-1;i>=0;i--){
                lists_2.add(lists.get(i));
            }
            button.setText("正序");
        }
    }
}
