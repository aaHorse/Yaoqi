package com.example.zexiger.yaoqi.base;

import android.app.Application;
import android.content.Context;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;

public class MyApplication extends Application {
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        init_Logger();
    }
    public static Context getContext(){
        return context;
    }

    private void init_Logger(){
        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                .tag("ttttt")
                .build();
        Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy));
    }
}
