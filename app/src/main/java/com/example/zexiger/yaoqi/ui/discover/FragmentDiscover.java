package com.example.zexiger.yaoqi.ui.discover;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanDiscover;
import com.example.zexiger.yaoqi.component.ApplicationComponent;
import com.example.zexiger.yaoqi.component.DaggerHttpComponent;
import com.example.zexiger.yaoqi.ui.base.BaseFragment;
import com.example.zexiger.yaoqi.ui.discover.contract.ContractBeanDiscover;
import com.example.zexiger.yaoqi.ui.discover.presenter.PresenterBeanDiscover;
import com.orhanobut.logger.Logger;

import butterknife.BindView;

import static com.example.zexiger.yaoqi.MainActivity.isLogin;

public class FragmentDiscover extends BaseFragment<PresenterBeanDiscover>
        implements ContractBeanDiscover.View {

    public static FragmentDiscover newInstance(){
        Bundle bundle=new Bundle();
        FragmentDiscover fragment_discover=new FragmentDiscover();
        fragment_discover.setArguments(bundle);
        return fragment_discover;
    }

    @BindView(R.id.text_discover)TextView textView;

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
        if(isLogin){
            mPresenter.getData();
        }
    }

    @Override
    public void loadData(BeanDiscover beanDiscover) {
        if(beanDiscover!=null){
            textView.setText(beanDiscover.getData().getMessage());
        }else{
            Logger.d("这里出错啦");
        }
    }
}
