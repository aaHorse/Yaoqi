package com.example.zexiger.yaoqi.ui.base;

import com.trello.rxlifecycle2.LifecycleTransformer;

public interface BaseContract {

    interface BasePresenter<T extends BaseContract.BaseView> {
        void attachView(T view);
        void detachView();
    }

    interface BaseView {
        void showFaild();
        //重试
        void onRetry();

        /**
         * 绑定生命周期
         */
        <T> LifecycleTransformer<T> bindToLife();
    }
}
