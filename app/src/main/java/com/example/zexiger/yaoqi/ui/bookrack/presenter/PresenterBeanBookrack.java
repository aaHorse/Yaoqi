package com.example.zexiger.yaoqi.ui.bookrack.presenter;

import android.support.annotation.NonNull;

import com.example.zexiger.yaoqi.bean.BeanBookrack;
import com.example.zexiger.yaoqi.net.ApiBookrack;
import com.example.zexiger.yaoqi.net.RxSchedulers;
import com.example.zexiger.yaoqi.ui.base.BaseContract;
import com.example.zexiger.yaoqi.ui.base.BasePresenter;
import com.example.zexiger.yaoqi.ui.bookrack.contract.ContractBeanBookrack;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class PresenterBeanBookrack extends BasePresenter<ContractBeanBookrack.View> implements ContractBeanBookrack.Presenter{

    ApiBookrack api;

    @Inject
    public PresenterBeanBookrack(ApiBookrack api){
        this.api=api;
    }

    @Override
    public void getData() {
        api.getBookrack()
                .compose(RxSchedulers.<BeanBookrack>applySchedulers())
                .compose(mView.<BeanBookrack>bindToLife())
                .subscribe(new Observer<BeanBookrack>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull BeanBookrack bookrack) {
                        mView.loadData(bookrack);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        mView.showFaild();
                    }

                    @Override
                    public void onComplete() {
                    }
                });
    }
}
