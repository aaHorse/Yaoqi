package com.example.zexiger.yaoqi.ui.update.presenter;

import android.support.annotation.NonNull;

import com.example.zexiger.yaoqi.bean.BeanUpdate;
import com.example.zexiger.yaoqi.net.ApiUpdateContent;
import com.example.zexiger.yaoqi.net.RxSchedulers;
import com.example.zexiger.yaoqi.ui.base.BasePresenter;
import com.example.zexiger.yaoqi.ui.update.contract.ContractUpdateContent;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class PresenterBeanUpdateContent extends BasePresenter<ContractUpdateContent.View>
        implements ContractUpdateContent.Presenter{
    ApiUpdateContent apiUpdate;
    @Inject
    public PresenterBeanUpdateContent(ApiUpdateContent apiUpdate){
        this.apiUpdate=apiUpdate;
    }
    @Override
    public void getData() {
        apiUpdate.getUpdate()
                .compose(RxSchedulers.<BeanUpdate>applySchedulers())
                .compose(mView.<BeanUpdate>bindToLife())
                .subscribe(new Observer<BeanUpdate>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull BeanUpdate beanUpdate) {
                        mView.loadData(beanUpdate);
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
