package com.example.zexiger.yaoqi.utils;

import com.example.zexiger.yaoqi.bean.BeanBookrack;
import com.example.zexiger.yaoqi.net.API;
import com.example.zexiger.yaoqi.net.ApiBookrackService;
import com.orhanobut.logger.Logger;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class Update {
    private static Disposable mDisposable;
    public Update(){
        /*
         * 每15分钟查看一次，用户第一次登录时，key会为空，没有做检查，因为15分钟后才会第一次发送，
         * 这个时间足够用户进行登录获取key了
         * */
        RxTimerUtil.interval(1000*60*15, new IRxNext() {
            @Override
            public void doNext(long number) {
                Logger.d("在这里");
                func();
            }
        });
    }

    private void func(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(API.BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        ApiBookrackService bookrackService = retrofit.create(ApiBookrackService.class);

        bookrackService.getBookrack(API.key)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BeanBookrack>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(BeanBookrack bookrack) {
                        //
                        Logger.d(bookrack.getCode());
                    }

                    @Override
                    public void onError(Throwable e) {
                        //请求失败的情况
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    static class RxTimerUtil {
        public static void interval(long milliseconds,final IRxNext next){
            Observable.interval(milliseconds, TimeUnit.MILLISECONDS)
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<Long>() {
                        @Override
                        public void onSubscribe(@NonNull Disposable disposable) {
                            mDisposable=disposable;
                        }

                        @Override
                        public void onNext(@NonNull Long number) {
                            if(next!=null){
                                next.doNext(number);
                            }
                        }

                        @Override
                        public void onError(@NonNull Throwable e) {

                        }

                        @Override
                        public void onComplete() {

                        }
                    });
        }
    }

    interface IRxNext{
        void doNext(long number);
    }
}
