package com.example.zexiger.yaoqi.ui.common.presenter;

import com.example.zexiger.yaoqi.bean.BeanSpecific_combine;
import com.example.zexiger.yaoqi.bean.BeanSpecific_dynamic;
import com.example.zexiger.yaoqi.bean.Status;
import com.example.zexiger.yaoqi.net.ApiSpecific;
import com.example.zexiger.yaoqi.net.RxSchedulers;
import com.example.zexiger.yaoqi.ui.base.BasePresenter;
import com.example.zexiger.yaoqi.ui.common.contract.ContractBeanSpecific;
import com.orhanobut.logger.Logger;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public class PresenterSpecific extends BasePresenter<ContractBeanSpecific.View>
        implements ContractBeanSpecific.Presenter{
    ApiSpecific apiSpecific;
    @Inject
    public PresenterSpecific(ApiSpecific apiSpecific){
        this.apiSpecific=apiSpecific;
    }


    @Override
    public void getData(String comicid) {
        apiSpecific.getSpecific(comicid)
                .compose(RxSchedulers.<BeanSpecific_combine>applySchedulers())
                .compose(mView.<BeanSpecific_combine>bindToLife())
                .subscribe(new Observer<BeanSpecific_combine>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull BeanSpecific_combine specific) {
                        mView.loadData(specific);
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
    public void getData_2(String comicid) {
        apiSpecific.getSpecific_2(comicid)
                .compose(RxSchedulers.<BeanSpecific_dynamic>applySchedulers())
                .compose(mView.<BeanSpecific_dynamic>bindToLife())
                .subscribe(new Observer<BeanSpecific_dynamic>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull BeanSpecific_dynamic specific) {
                        mView.loadData_2(specific);
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
    public void favorite_3(String data_,int query) {
        apiSpecific.favorite(data_,query)
                .compose(RxSchedulers.<Status>applySchedulers())
                .compose(mView.<Status>bindToLife())
                .subscribe(new Observer<Status>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull Status status) {
                        mView.loadData_3(status);
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
