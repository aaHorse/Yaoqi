package com.example.zexiger.yaoqi.ui.common.presenter;

import com.example.zexiger.yaoqi.bean.BeanSpecificContent;
import com.example.zexiger.yaoqi.net.ApiLoad;
import com.example.zexiger.yaoqi.net.RxSchedulers;
import com.example.zexiger.yaoqi.ui.base.BasePresenter;
import com.example.zexiger.yaoqi.ui.common.contract.ContractLoad;
import com.orhanobut.logger.Logger;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public class PresenterLoad extends BasePresenter<ContractLoad.View>
        implements ContractLoad.Presenter{
    ApiLoad apiLoad;
    @Inject
    public PresenterLoad(ApiLoad apiLoad){
        this.apiLoad=apiLoad;
    }

    @Override
    public void getData(final String comicid) {
        apiLoad.getDate(comicid)
                .compose(RxSchedulers.<BeanSpecificContent>applySchedulers())
                .compose(mView.<BeanSpecificContent>bindToLife())
                .subscribe(new Observer<BeanSpecificContent>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull BeanSpecificContent specific) {
                        mView.loadData(specific,comicid);
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



