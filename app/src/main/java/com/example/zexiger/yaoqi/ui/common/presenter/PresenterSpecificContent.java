package com.example.zexiger.yaoqi.ui.common.presenter;

import com.example.zexiger.yaoqi.bean.BeanSpecificContent;
import com.example.zexiger.yaoqi.net.ApiSpecificContent;
import com.example.zexiger.yaoqi.net.RxSchedulers;
import com.example.zexiger.yaoqi.ui.base.BasePresenter;
import com.example.zexiger.yaoqi.ui.common.contract.ContractBeanSpecificContent;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public class PresenterSpecificContent extends BasePresenter<ContractBeanSpecificContent.View>
        implements ContractBeanSpecificContent.Presenter{
    ApiSpecificContent apiSpecificContent;
    @Inject
    public PresenterSpecificContent(ApiSpecificContent apiSpecificContent){
        this.apiSpecificContent=apiSpecificContent;
    }

    @Override
    public void getData(String chapter_id) {
        apiSpecificContent.getDate(chapter_id)
                .compose(RxSchedulers.<BeanSpecificContent>applySchedulers())
                .compose(mView.<BeanSpecificContent>bindToLife())
                .subscribe(new Observer<BeanSpecificContent>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull BeanSpecificContent beanSpecificContent) {
                        mView.loadData(beanSpecificContent);
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
