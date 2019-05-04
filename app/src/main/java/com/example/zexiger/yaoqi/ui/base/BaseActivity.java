package com.example.zexiger.yaoqi.ui.base;

import android.app.Dialog;
import android.os.Bundle;

import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.utils.T;
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
        attachView();
        initData();
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


    protected void showLoadingDialog() {
        if (mLoadingDialog != null)
            mLoadingDialog.show();
    }

    protected void showLoadingDialog(String str) {
        if (mLoadingDialog != null) {
/*            TextView tv = (TextView) mLoadingDialog.findViewById(R.id.tv_load_dialog);
            tv.setText(str);*/
            mLoadingDialog.show();
        }
    }

    protected void hideLoadingDialog() {
        if (mLoadingDialog != null && mLoadingDialog.isShowing()) {
            mLoadingDialog.dismiss();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }

    @Override
    public void showLoading() {
//        if (mSimpleMultiStateView != null) {
//            mSimpleMultiStateView.showLoadingView();
//        }
    }

    @Override
    public void showSuccess() {
//        if (mSimpleMultiStateView != null) {
//            mSimpleMultiStateView.showContent();
//        }
    }

    @Override
    public void showFaild() {
//        if (mSimpleMultiStateView != null) {
//            mSimpleMultiStateView.showErrorView();
//        }
    }

    @Override
    public void showNoNet() {
//        if (mSimpleMultiStateView != null) {
//            mSimpleMultiStateView.showNoNetView();
//        }
    }

    protected void T(String string) {
        T.showShort(MyApp.getContext(), string);
    }

    @Override
    public <T> LifecycleTransformer<T> bindToLife() {
        return this.<T>bindToLifecycle();
    }

}
