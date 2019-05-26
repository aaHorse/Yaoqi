package com.example.zexiger.yaoqi.ui.common;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanSpecific_combine;
import com.example.zexiger.yaoqi.ui.adapter.Adapter_Load_1;
import com.example.zexiger.yaoqi.utils.T;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.example.zexiger.yaoqi.ui.common.ActivitySpecific.FLAG;

public class ActivityLoad extends AppCompatActivity {
    public static void startActivity(List<BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean> lists_){
        lists=lists_;
        Intent intent=new Intent(MyApp.getContext(),ActivityLoad.class);
        MyApp.getContext().startActivity(intent);
    }

    private static List<BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean>lists;//正序
    private static List<BeanSpecific_combine.DataBean.ReturnDataBean.ChapterListBean>temp=new ArrayList<>();//临时使用
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
        StaggeredGridLayoutManager manager=new StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        adapter=new Adapter_Load_1(lists);
        recyclerView.setAdapter(adapter);
        if(FLAG==0){
            button.setText("逆序");
        }else{
            button.setText("正序");
        }
        func_5();
    }

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
                    ImageView imageView=view.findViewById(R.id.iv_item_load_1_3);
                    if(obj.isChecked()){
                        imageView.setVisibility(View.GONE);
                        obj.setChecked(false);
                    }else{
                        imageView.setVisibility(View.VISIBLE);
                        obj.setChecked(true);
                    }
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
        //开启下载服务
    }
}
