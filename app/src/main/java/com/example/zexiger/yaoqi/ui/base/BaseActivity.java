package com.example.zexiger.yaoqi.ui.base;

import android.app.Dialog;
import android.os.Bundle;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.bean.BeanBookrack;
import com.example.zexiger.yaoqi.net.API;
import com.example.zexiger.yaoqi.net.ApiBookrackService;
import com.example.zexiger.yaoqi.utils.DialogHelper;
import com.example.zexiger.yaoqi.utils.T;
import com.example.zexiger.yaoqi.utils.Update;
import com.orhanobut.logger.Logger;
import com.trello.rxlifecycle2.LifecycleTransformer;


import org.litepal.util.LogUtil;

import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import butterknife.ButterKnife;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


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
        new Update();//检查漫画更新
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
