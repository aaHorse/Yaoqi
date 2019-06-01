package com.example.zexiger.yaoqi.ui.bookrack;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.zexiger.yaoqi.MainActivity;
import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanBookrack;
import com.example.zexiger.yaoqi.component.ApplicationComponent;

import com.example.zexiger.yaoqi.component.DaggerHttpComponent;
import com.example.zexiger.yaoqi.ui.adapter.Adapter_Bookrack;
import com.example.zexiger.yaoqi.ui.base.BaseFragment;
import com.example.zexiger.yaoqi.ui.bookrack.contract.ContractBeanBookrack;
import com.example.zexiger.yaoqi.ui.bookrack.presenter.PresenterBeanBookrack;
import com.example.zexiger.yaoqi.ui.common.ActivitySpecific;
import com.orhanobut.logger.Logger;
import com.qmuiteam.qmui.widget.pullRefreshLayout.QMUIPullRefreshLayout;

import org.simple.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

import static com.example.zexiger.yaoqi.MainActivity.isLogin;

public class FragmentBookrack extends BaseFragment<PresenterBeanBookrack>
        implements ContractBeanBookrack.View {

    @BindView(R.id.mRecyclerView_f_bookrack) RecyclerView  mRecyclerView;
    private Adapter_Bookrack adapter_bookrack;
    private List<BeanBookrack.DataBean.ReturnDataBean.FavListBean>lists=new ArrayList<>();
    @BindView(R.id.pull_to_refresh) QMUIPullRefreshLayout mPullRefreshLayout;

    public static FragmentBookrack newInstance() {
        Bundle args = new Bundle();
        FragmentBookrack fragment = new FragmentBookrack();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getContentLayout() {
        return R.layout.fragment_bookrack;
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
        EventBus.getDefault().register(this);

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
                        mPresenter.getData();
                    }
                }, 2000);
            }
        });
    }

    @Override
    public void initData() {
        if(isLogin){
            mPresenter.getData();
        }
    }

    @Override
    public void loadData(BeanBookrack bookrack) {
        //获取到数据后，将数据显示到界面
        lists.clear();
        for(BeanBookrack.DataBean.ReturnDataBean.FavListBean item:bookrack.getData().getReturnData().getFavList()){
            //默认是样式 1
            item.setItemType(1);
            lists.add(item);
        }
        //填加尾布局的，不会用这个对象里面的东西，所以里面的东西没有赋值
        BeanBookrack.DataBean.ReturnDataBean.FavListBean obj=new BeanBookrack.DataBean.ReturnDataBean.FavListBean();
        obj.setItemType(2);
        lists.add(obj);

        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL));
        adapter_bookrack=new Adapter_Bookrack(lists);
        mRecyclerView.setAdapter(adapter_bookrack);
        adapter_bookrack.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                if(position==adapter.getItemCount()-1){
                    MainActivity.func();
                    Logger.d("在这里");
                }else{
                    ActivitySpecific.startActivity(MyApp.getContext(),lists.get(position).getComic_id()+"",true);
                }
            }
        });
        //
        mPullRefreshLayout.finishRefresh();
    }

    @Override
    public void onDestroyView() {
        EventBus.getDefault().unregister(this);
        super.onDestroyView();
    }
}
