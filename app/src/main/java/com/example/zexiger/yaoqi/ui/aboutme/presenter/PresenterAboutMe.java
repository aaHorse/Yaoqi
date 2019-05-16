package com.example.zexiger.yaoqi.ui.aboutme.presenter;

import com.example.zexiger.yaoqi.bean.BeanAboutMe;
import com.example.zexiger.yaoqi.bean.Status;
import com.example.zexiger.yaoqi.net.ApiAboutMe;
import com.example.zexiger.yaoqi.net.RxSchedulers;
import com.example.zexiger.yaoqi.ui.aboutme.contract.ContractAboutMe;
import com.example.zexiger.yaoqi.ui.base.BasePresenter;
import com.orhanobut.logger.Logger;

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
    public void submit(String num) {
        apiAboutMe.submit(num)
                .compose(RxSchedulers.<Status>applySchedulers())
                .compose(mView.<Status>bindToLife())
                .subscribe(new Observer<Status>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull Status status) {
                        if(status.getData().getStateCode()!=1){
                            mView.showError(status.getData().getMessage());
                        }
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        mView.showError("事件队列异常");
                    }

                    @Override
                    public void onComplete() {
                    }
                });
    }

    @Override
    public void submit_2(String num, String num_2,String android_id,String site_mark) {
        apiAboutMe.submit_2(num,num_2,android_id,site_mark)
                .compose(RxSchedulers.<BeanAboutMe>applySchedulers())
                .compose(mView.<BeanAboutMe>bindToLife())
                .subscribe(new Observer<BeanAboutMe>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull BeanAboutMe beanAboutMe) {
                        if(beanAboutMe.getData().getStateCode()!=1){
                            mView.showError(beanAboutMe.getData().getMessage());
                        }else{
                            mView.loadData(beanAboutMe);
                        }
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        mView.showError("事件队列异常");
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void submit_3(String open_id,String access_token,String android_id,String site_mark) {
        apiAboutMe.submit_3(open_id,access_token,android_id,site_mark)
                .compose(RxSchedulers.<BeanAboutMe>applySchedulers())
                .compose(mView.<BeanAboutMe>bindToLife())
                .subscribe(new Observer<BeanAboutMe>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull BeanAboutMe beanAboutMe) {
                        if(beanAboutMe.getData().getStateCode()!=1){
                            mView.showError(beanAboutMe.getData().getMessage());
                        }else{
                            mView.loadData(beanAboutMe);
                        }
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        mView.showError("事件队列异常");
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
