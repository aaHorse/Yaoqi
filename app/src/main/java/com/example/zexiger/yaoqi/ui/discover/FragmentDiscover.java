package com.example.zexiger.yaoqi.ui.discover;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanDiscover;
import com.example.zexiger.yaoqi.bean.BeanSearch2;
import com.example.zexiger.yaoqi.component.ApplicationComponent;
import com.example.zexiger.yaoqi.component.DaggerHttpComponent;
import com.example.zexiger.yaoqi.database.LoadClass_0;
import com.example.zexiger.yaoqi.ui.adapter.AdapterSearch2;
import com.example.zexiger.yaoqi.ui.base.BaseFragment;
import com.example.zexiger.yaoqi.ui.discover.contract.ContractBeanDiscover;
import com.example.zexiger.yaoqi.ui.discover.presenter.PresenterBeanDiscover;
import com.example.zexiger.yaoqi.utils.LoadDB;
import com.orhanobut.logger.Logger;
import com.qmuiteam.qmui.widget.pullRefreshLayout.QMUIPullRefreshLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

import static com.example.zexiger.yaoqi.MainActivity.isLogin;

/*
* 将发现对应的窗口该为了离线下载的显示了，之前写的一些关于发现功能的方法弃用，但是没有删除
* */
public class FragmentDiscover extends BaseFragment<PresenterBeanDiscover>
        implements ContractBeanDiscover.View {

    public static FragmentDiscover newInstance(){
        Bundle bundle=new Bundle();
        FragmentDiscover fragment_discover=new FragmentDiscover();
        fragment_discover.setArguments(bundle);
        return fragment_discover;
    }

    @BindView(R.id.rv_discover)RecyclerView recyclerView;
    AdapterSearch2 adapter_search_2;//借用搜索里面的adapter
    private List<BeanSearch2.DataBean.ReturnDataBean.ComicsBean>lists=new ArrayList<>();
    @BindView(R.id.pull_to_refresh) QMUIPullRefreshLayout mPullRefreshLayout;

    @Override
    public int getContentLayout() {
        return R.layout.fragment_discover;
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
        func_2();
        adapter_search_2=new AdapterSearch2(lists);
        recyclerView.setLayoutManager(new LinearLayoutManager(MyApp.getContext()));
        recyclerView.setAdapter(adapter_search_2);
        func_1();
    }

    private void func_1(){
        mPullRefreshLayout.setOnPullListener(new QMUIPullRefreshLayout.OnPullListener() {
            @Override
            public void onMoveTarget(int offset) {

            }

            @Override
            public void onMoveRefreshView(int offset) {

            }

            @Override
            public void onRefresh() {
                mPullRefreshLayout.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        func_2();
                        adapter_search_2.notifyDataSetChanged();
                        mPullRefreshLayout.finishRefresh();
                    }
                }, 2000);
            }
        });


        adapter_search_2.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                ActivityOffLine.startActivity(lists.get(position));
            }
        });
    }

    private void func_2(){
        List<LoadClass_0>lists_=LoadDB.query();
        lists.clear();
        for(int i=0;i<lists_.size();i++){
            BeanSearch2.DataBean.ReturnDataBean.ComicsBean obj=new BeanSearch2.DataBean.ReturnDataBean.ComicsBean();
            obj.setItemType(1);
            Logger.d(lists_.get(i).getComic_id());
            obj.setComicId(Integer.parseInt(lists_.get(i).getComic_id()));
            obj.setName(lists_.get(i).getName());
            obj.setAuthor(lists_.get(i).getAuthor());
            obj.setCover(lists_.get(i).getCover_address());
            lists.add(obj);
        }
    }

    @Override
    public void initData() {
        if(isLogin){
            //mPresenter.getData();
        }
    }

    @Override
    public void loadData(BeanDiscover beanDiscover) {
        if(beanDiscover!=null){
            //
        }else{
            Logger.d("这里出错啦");
        }
    }
}
