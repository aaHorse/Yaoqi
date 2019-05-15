package com.example.zexiger.yaoqi.component;

import android.content.Context;


import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.module.ApplicationModule;
import com.example.zexiger.yaoqi.module.HttpModule;
import com.example.zexiger.yaoqi.net.ApiAboutMe;
import com.example.zexiger.yaoqi.net.ApiBookrack;
import com.example.zexiger.yaoqi.net.ApiDiscover;
import com.example.zexiger.yaoqi.net.ApiSpecific;
import com.example.zexiger.yaoqi.net.ApiSpecificContent;
import com.example.zexiger.yaoqi.net.ApiUpdateContent;

import dagger.Component;

@Component(modules = {ApplicationModule.class,HttpModule.class})
public interface ApplicationComponent {

    MyApp getApplication();

    ApiBookrack getApiBookrack();

    ApiUpdateContent getApiUpdateContent();

    ApiDiscover getApiDiscover();

    ApiSpecific getApiSpecific();

    ApiSpecificContent getApiSpecificContent();

    ApiAboutMe getApiAboutMe();

    Context getContext();

}
