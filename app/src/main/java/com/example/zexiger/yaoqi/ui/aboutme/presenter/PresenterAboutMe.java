package com.example.zexiger.yaoqi.ui.aboutme.presenter;

import com.example.zexiger.yaoqi.bean.BeanAboutMe;
import com.example.zexiger.yaoqi.net.ApiAboutMe;
import com.example.zexiger.yaoqi.net.RxSchedulers;
import com.example.zexiger.yaoqi.ui.aboutme.contract.ContractAboutMe;
import com.example.zexiger.yaoqi.ui.base.BasePresenter;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public class PresenterAboutMe
        extends BasePresenter<ContractAboutMe.View> implements ContractAboutMe.Presenter{
    ApiAboutMe apiAboutMe;
    @Inject
    public PresenterAboutMe(ApiAboutMe apiAboutMe){
        this.apiAboutMe=apiAboutMe;
    }

    @Override
    public void getData() {
        apiAboutMe.getData()
                .compose(RxSchedulers.<BeanAboutMe>applySchedulers())
                .compose(mView.<BeanAboutMe>bindToLife())
                .subscribe(new Observer<BeanAboutMe>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull BeanAboutMe aboutMe) {
                        mView.loadData(aboutMe);
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
