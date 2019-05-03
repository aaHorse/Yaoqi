package com.example.zexiger.yaoqi.ui.base;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.utils.T;
import com.trello.rxlifecycle2.LifecycleTransformer;;

import javax.inject.Inject;


public abstract class BaseFragment<T1 extends BaseContract.BasePresenter>
        extends SupportFragment implements IBase, BaseContract.BaseView {

    protected Context mContext;
    protected View mRootView;

    @Nullable
    @Inject
    protected T1 mPresenter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (mRootView != null) {
            ViewGroup parent = (ViewGroup) mRootView.getParent();
            if (parent != null) {
                parent.removeView(mRootView);
            }
        } else {
            mRootView = createView(inflater, container, savedInstanceState);
        }

        mContext = mRootView.getContext();
        return mRootView;
    }

    @Override
    public View createView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(getContentLayout(), container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initInjector(MyApp.getInstance().getApplicationComponent());
        attachView();
        bindView(view, savedInstanceState);
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        initData();
    }

    @Override
    public void onSupportVisible() {
        super.onSupportVisible();
    }

    @Nullable
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
    public void onRetry() {

    }


    protected void showLoadingDialog() {
/*        if (mLoadingDialog != null)
            mLoadingDialog.show();*/
    }

    protected void showLoadingDialog(String str) {
/*        if (mLoadingDialog != null) {
            TextView tv = (TextView) mLoadingDialog.findViewById(R.id.tv_load_dialog);
            tv.setText(str);
            mLoadingDialog.show();
        }*/
    }

    protected void hideLoadingDialog() {
/*        if (mLoadingDialog != null && mLoadingDialog.isShowing())
            mLoadingDialog.dismiss();*/
    }


    private void initStateView() {
/*        if (mSimpleMultiStateView == null) return;
        mSimpleMultiStateView.setEmptyResource(R.layout.view_empty)
                .setRetryResource(R.layout.view_retry)
                .setLoadingResource(R.layout.view_loading)
                .setNoNetResource(R.layout.view_nonet)
                .build()
                .setonReLoadlistener(new MultiStateView.onReLoadlistener() {
                    @Override
                    public void onReload() {
                        onRetry();
                    }
                });*/
    }

    @Override
    public void showLoading() {
/*        if (mSimpleMultiStateView != null) {
            mSimpleMultiStateView.showLoadingView();
        }*/
    }

    @Override
    public void showSuccess() {
/*        hideLoadingDialog();
        if (mSimpleMultiStateView != null) {
            mSimpleMultiStateView.showContent();
        }*/
    }

    @Override
    public void showFaild() {
/*        if (mSimpleMultiStateView != null) {
            mSimpleMultiStateView.showErrorView();
        }*/
    }

    @Override
    public void showNoNet() {
/*        if (mSimpleMultiStateView != null) {
            mSimpleMultiStateView.showNoNetView();
        }*/
    }

    protected void T(String string) {
        T.showShort(MyApp.getContext(), string);
    }

    @Override
    public <T> LifecycleTransformer<T> bindToLife() {
        return this.<T>bindToLifecycle();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }
}
