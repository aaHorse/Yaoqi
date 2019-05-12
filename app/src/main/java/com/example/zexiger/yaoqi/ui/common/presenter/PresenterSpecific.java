package com.example.zexiger.yaoqi.ui.common.presenter;

import com.example.zexiger.yaoqi.bean.BeanSpecific;
import com.example.zexiger.yaoqi.bean.BeanSpecific_2;
import com.example.zexiger.yaoqi.net.ApiSpecific;
import com.example.zexiger.yaoqi.net.RxSchedulers;
import com.example.zexiger.yaoqi.ui.base.BasePresenter;
import com.example.zexiger.yaoqi.ui.common.contract.ContractBeanSpecific;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public class PresenterSpecific extends BasePresenter<ContractBeanSpecific.View> implements ContractBeanSpecific.Presenter{
    ApiSpecific apiSpecific;
    @Inject
    public PresenterSpecific(ApiSpecific apiSpecific){
        this.apiSpecific=apiSpecific;
    }


    @Override
    public void getData(String comicid) {
        apiSpecific.getSpecific(comicid)
                .compose(RxSchedulers.<BeanSpecific>applySchedulers())
                .compose(mView.<BeanSpecific>bindToLife())
                .subscribe(new Observer<BeanSpecific>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull BeanSpecific specific) {
                        mView.loadData(specific);
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

    @Override
    public void getData_2(String comicid) {
        apiSpecific.getSpecific_2(comicid)
                .compose(RxSchedulers.<BeanSpecific_2>applySchedulers())
                .compose(mView.<BeanSpecific_2>bindToLife())
                .subscribe(new Observer<BeanSpecific_2>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull BeanSpecific_2 specific) {
                        mView.loadData_2(specific);
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
