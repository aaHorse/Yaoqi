package com.example.zexiger.yaoqi.ui.base;

import android.app.Dialog;
import android.os.Bundle;

import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.utils.DialogHelper;
import com.example.zexiger.yaoqi.utils.T;
import com.orhanobut.logger.Logger;
import com.trello.rxlifecycle2.LifecycleTransformer;


import javax.inject.Inject;

import butterknife.ButterKnife;


public abstract class BaseActivity<T1 extends BaseContract.BasePresenter>
        extends SupportActivity implements IBase,BaseContract.BaseView{
    protected View mRootView;
    protected Dialog mLoadingDialog = null;

    @Nullable
    @Inject
    protected T1 mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mRootView = createView(null, null, savedInstanceState);
        setContentView(mRootView);
        bindView(mRootView, savedInstanceState);
        initInjector(MyApp.getInstance().getApplicationComponent());
        attachView();
        initData();
        mLoadingDialog = DialogHelper.getLoadingDialog(this);
    }

    @Override
    public View createView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getLayoutInflater().inflate(getContentLayout(), container);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public View getView() {
        return mRootView;
    }

    private void attachView() {
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
    }

    @Override
    public void showFaild() {
        Logger.d("出错啦");
    }

    @Override
    public void onRetry() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }

    protected void T(String string) {
        T.showShort(MyApp.getContext(), string);
    }

    @Override
    public <T> LifecycleTransformer<T> bindToLife() {
        return this.<T>bindToLifecycle();
    }

}
