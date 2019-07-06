package com.example.zexiger.yaoqi.ui.bookrack.presenter;

import com.example.zexiger.yaoqi.bean.BeanSearch;
import com.example.zexiger.yaoqi.bean.BeanSearchDefault;
import com.example.zexiger.yaoqi.bean.BeanSearch2;
import com.example.zexiger.yaoqi.net.ApiSearch;
import com.example.zexiger.yaoqi.net.RxSchedulers;
import com.example.zexiger.yaoqi.ui.base.BasePresenter;
import com.example.zexiger.yaoqi.ui.bookrack.contract.ContractSearch;
import com.orhanobut.logger.Logger;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public class PresenterSearch
        extends BasePresenter<ContractSearch.View> implements ContractSearch.Presenter{

    ApiSearch api;

    @Inject
    public PresenterSearch(ApiSearch api){
        this.api=api;
    }

    @Override
    public void getData_0() {
        api.getData_0()
                .compose(RxSchedulers.<BeanSearchDefault>applySchedulers())
                .compose(mView.<BeanSearchDefault>bindToLife())
                .subscribe(new Observer<BeanSearchDefault>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull BeanSearchDefault beanSearchDefault) {
                        mView.loadData_0(beanSearchDefault);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        Logger.d(e.getMessage());
                        mView.showFaild();
                    }

                    @Override
                    public void onComplete() {
                    }
                });
    }

    @Override
    public void getData(String str) {
        api.getData(str)
                .compose(RxSchedulers.<BeanSearch>applySchedulers())
                .compose(mView.<BeanSearch>bindToLife())
                .subscribe(new Observer<BeanSearch>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull BeanSearch bookrack) {
                        mView.loadData(bookrack);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        Logger.d(e.getMessage());
                        mView.showFaild();
                    }

                    @Override
                    public void onComplete() {
                    }
                });
    }

    @Override
    public void getData_2(String str) {
        api.getData_2(str)
                .compose(RxSchedulers.<BeanSearch2>applySchedulers())
                .compose(mView.<BeanSearch2>bindToLife())
                .subscribe(new Observer<BeanSearch2>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull BeanSearch2 beanSearch_2) {
                        mView.loadData_2(beanSearch_2);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        Logger.d(e.getMessage());
                        mView.showFaild();
                    }

                    @Override
                    public void onComplete() {
                    }
                });
    }
}
