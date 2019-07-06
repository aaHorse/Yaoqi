package com.example.zexiger.yaoqi.ui.bookrack;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanSearch2;
import com.example.zexiger.yaoqi.component.ApplicationComponent;
import com.example.zexiger.yaoqi.ui.adapter.AdapterSearch2;
import com.example.zexiger.yaoqi.ui.base.BaseActivity;
import com.example.zexiger.yaoqi.ui.common.ActivitySpecific;
import com.qmuiteam.qmui.util.QMUIStatusBarHelper;
import com.qmuiteam.qmui.widget.QMUITopBarLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class ActivitySearch2 extends BaseActivity {
    public static void startActivity(BeanSearch2 beanSearch_2_){
        beanSearch_2=beanSearch_2_;
        Context context=MyApp.getContext();
        Intent intent=new Intent(context,ActivitySearch2.class);
        context.startActivity(intent);
    }

    private static BeanSearch2 beanSearch_2;
    @BindView(R.id.rv_search_1)RecyclerView recyclerView;
    AdapterSearch2 adapter_search_2;
    private List<BeanSearch2.DataBean.ReturnDataBean.ComicsBean>lists=new ArrayList<>();
    @BindView(R.id.topbar) QMUITopBarLayout mTopBar;

    @Override
    public int getContentLayout() {
        return R.layout.activity__search_2;
    }

    @Override
    public void initInjector(ApplicationComponent appComponent) {

    }

    @Override
    public void bindView(View view, Bundle savedInstanceState) {
        QMUIStatusBarHelper.translucent(this);
        initTopBar();
        lists=beanSearch_2.getData().getReturnData().getComics();
        adapter_search_2=new AdapterSearch2(lists);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter_search_2);
        func_1();
    }

    @Override
    public void initData() {

    }

    private void initTopBar() {
        mTopBar.addLeftBackImageButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        mTopBar.setTitle("搜索结果");
    }

    private void func_1(){
        adapter_search_2.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                ActivitySpecific.startActivity(MyApp.getContext(),lists.get(position).getComicId()+"");
            }
        });
    }
}
