package com.example.zexiger.yaoqi.ui.common;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.zexiger.yaoqi.MainActivity;
import com.example.zexiger.yaoqi.R;
import com.example.zexiger.yaoqi.bean.BeanSpecific;
import com.example.zexiger.yaoqi.component.ApplicationComponent;
import com.example.zexiger.yaoqi.component.DaggerHttpComponent;
import com.example.zexiger.yaoqi.net.ApiSpecific;
import com.example.zexiger.yaoqi.ui.base.BaseActivity;
import com.example.zexiger.yaoqi.ui.common.contract.ContractBeanSpecific;
import com.example.zexiger.yaoqi.ui.common.presenter.PresenterSpecific;

import butterknife.OnClick;

public class ActivitySpecific extends BaseActivity<PresenterSpecific>
        implements ContractBeanSpecific.View {
    private static String comicid;

    public static void startActivity(Context context,String comicid_){
        comicid=comicid_;
        Intent intent=new Intent(context,ActivitySpecific.class);
        context.startActivity(intent);
    }

    @Override
    public int getContentLayout() {
        return R.layout.activity_specific;
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
        mPresenter.getData(comicid);
    }

    @Override
    public void loadData(BeanSpecific beanSpecific) {

    }

    @OnClick(R.id.button)void func(){
        MainActivity.startActivity(ActivitySpecific.this);
    }
}
