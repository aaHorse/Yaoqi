package com.example.zexiger.yaoqi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.orhanobut.logger.Logger;

import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observable;
import rx.Subscriber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button_1)void button_1(){
        func_1();
    }
    @OnClick(R.id.button_2)void button_2(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                //MyRetrofit.doRequestByRetrofit();
            }
        }).start();
    }
    /*
    *测试RxJava
    * */
    private void func_1(){
        //创建观察者，确定时间出发之后，将有什么样的行为
        Subscriber subscriber =new Subscriber<String>() {
            @Override
            public void onCompleted() {
                Logger.d("onCompleted");
            }

            @Override
            public void onError(Throwable e) {
                Logger.d("onError");
            }

            @Override
            public void onNext(String s) {
                Logger.d(s);
            }

            @Override
            public void onStart() {
                Logger.d("onStart");
            }
        };
        //创建被观察者，它决定触发怎样的事件,这是一种写法，还有更简单的写法
        Observable observable=Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                //即将添加队列
                subscriber.onStart();
                //将事件添加到任务队列中
                subscriber.onNext("111");
                subscriber.onNext("222");
                subscriber.onNext("333");
                //队列添加完成
                subscriber.onCompleted();
            }
        });
        //订阅，被观察者和观察者
        observable.subscribe(subscriber);
    }


}
