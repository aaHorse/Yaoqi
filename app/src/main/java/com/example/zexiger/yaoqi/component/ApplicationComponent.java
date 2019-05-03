package com.example.zexiger.yaoqi.component;

import android.content.Context;


import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.module.ApplicationModule;
import com.example.zexiger.yaoqi.module.HttpModule;
import com.example.zexiger.yaoqi.net.ApiBookrack;

import dagger.Component;

@Component(modules = {ApplicationModule.class,HttpModule.class})
public interface ApplicationComponent {

    MyApp getApplication();

    ApiBookrack getApiBookrack();

/*    NewsApi getNetEaseApi();

    JanDanApi getJanDanApi();*/

    Context getContext();

}
