package com.example.zexiger.yaoqi.ui.base;

public class BasePresenter<T extends BaseContract.BaseView> implements BaseContract.BasePresenter<T> {

    protected T mView;

    /*
    * 绑定view
    * */
    @Override
    public void attachView(T view) {
        this.mView = view;
    }

    /*
    * 和view解绑
    * */
    @Override
    public void detachView() {
        if (mView != null) {
            mView = null;
        }
    }
}