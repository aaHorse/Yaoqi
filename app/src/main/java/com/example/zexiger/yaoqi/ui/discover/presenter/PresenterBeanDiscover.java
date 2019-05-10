package com.example.zexiger.yaoqi.ui.discover.presenter;

import android.support.annotation.NonNull;

import com.example.zexiger.yaoqi.bean.BeanDiscover;
import com.example.zexiger.yaoqi.net.ApiDiscover;
import com.example.zexiger.yaoqi.net.RxSchedulers;
import com.example.zexiger.yaoqi.ui.base.BaseContract;
import com.example.zexiger.yaoqi.ui.base.BasePresenter;
import com.example.zexiger.yaoqi.ui.discover.contract.ContractBeanDiscover;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class PresenterBeanDiscover extends BasePresenter<ContractBeanDiscover.View>
        implements ContractBeanDiscover.Presenter {

    ApiDiscover apiDiscover;

    @Inject
    public PresenterBeanDiscover(ApiDiscover apiDiscover){
        this.apiDiscover=apiDiscover;
    }

    @Override
    public void getData() {
        apiDiscover.getDiscover()
                .compose(RxSchedulers.<BeanDiscover>applySchedulers())
                .compose(mView.<BeanDiscover>bindToLife())
                .subscribe(new Observer<BeanDiscover>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull BeanDiscover beanDiscover) {
                        mView.loadData(beanDiscover);
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
