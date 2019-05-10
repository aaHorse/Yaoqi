package com.example.zexiger.yaoqi.ui.discover;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanDiscover;
import com.example.zexiger.yaoqi.component.ApplicationComponent;
import com.example.zexiger.yaoqi.component.DaggerHttpComponent;
import com.example.zexiger.yaoqi.ui.base.BaseFragment;
import com.example.zexiger.yaoqi.ui.base.SupportFragment;
import com.example.zexiger.yaoqi.ui.discover.contract.ContractBeanDiscover;
import com.example.zexiger.yaoqi.ui.discover.presenter.PresenterBeanDiscover;

public class FragmentDiscover extends BaseFragment<PresenterBeanDiscover>
        implements ContractBeanDiscover.View {

    public static FragmentDiscover newInstance(){
        Bundle bundle=new Bundle();
        FragmentDiscover fragment_discover=new FragmentDiscover();
        fragment_discover.setArguments(bundle);
        return fragment_discover;
    }

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

    }

    @Override
    public void initData() {
        mPresenter.getData();
    }

    @Override
    public void loadData(BeanDiscover beanDiscover) {

    }
}
