package com.example.zexiger.yaoqi.ui.bookrack;

import android.os.Bundle;
import android.view.View;

import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanBookrack;
import com.example.zexiger.yaoqi.component.ApplicationComponent;

import com.example.zexiger.yaoqi.component.DaggerHttpComponent;
import com.example.zexiger.yaoqi.net.API;
import com.example.zexiger.yaoqi.ui.base.BaseFragment;
import com.example.zexiger.yaoqi.ui.bookrack.contract.ContractBeanBookrack;
import com.example.zexiger.yaoqi.ui.bookrack.presenter.PresenterBeanBookrack;
import com.orhanobut.logger.Logger;

import org.simple.eventbus.EventBus;

public class FragmentBookrack extends BaseFragment<PresenterBeanBookrack> implements ContractBeanBookrack.View {

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
        //可以在这里设置监听事件
    }

    @Override
    public void initData() {
        //访问网络获取数据
        mPresenter.getData();
    }

    @Override
    public void loadData(BeanBookrack bookrack) {
        //获取到数据后，对界面进行刷新
        Logger.d(bookrack);
    }

    @Override
    public void onDestroyView() {
        EventBus.getDefault().unregister(this);
        super.onDestroyView();
    }
}
