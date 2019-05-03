package com.example.zexiger.yaoqi;


import android.app.Application;
import android.content.Context;

import com.example.zexiger.yaoqi.component.ApplicationComponent;
import com.example.zexiger.yaoqi.component.DaggerApplicationComponent;
import com.example.zexiger.yaoqi.module.ApplicationModule;
import com.example.zexiger.yaoqi.module.HttpModule;
import com.orhanobut.logger.Logger;


public class MyApp extends Application {

    private ApplicationComponent mApplicationComponent;

    private static MyApp mMyApp;
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mMyApp = this;
        mContext = getApplicationContext();
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .httpModule(new HttpModule())
                .build();
    }

    public static Context getContext() {
        if (mContext == null) {
            Logger.d("获取Context错误");
        }
        return mContext;
    }

    public static MyApp getInstance() {
        return mMyApp;
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }

}
