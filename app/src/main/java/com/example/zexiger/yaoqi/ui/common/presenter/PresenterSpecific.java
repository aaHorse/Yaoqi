package com.example.zexiger.yaoqi.ui.common.presenter;

import com.example.zexiger.yaoqi.bean.BeanSpecific;
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
}
