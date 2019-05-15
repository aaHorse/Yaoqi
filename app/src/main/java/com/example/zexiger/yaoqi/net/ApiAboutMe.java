package com.example.zexiger.yaoqi.net;

import com.example.zexiger.yaoqi.bean.BeanAboutMe;

import io.reactivex.Observable;

public class ApiAboutMe {
    public static ApiAboutMe apiAboutMe;
    private ApiAboutMeService apiAboutMeService;
    public ApiAboutMe(ApiAboutMeService apiAboutMeService){
        this.apiAboutMeService=apiAboutMeService;
    }
    public static ApiAboutMe getInstance(ApiAboutMeService apiAboutMeService){
        if(apiAboutMe==null){
            apiAboutMe=new ApiAboutMe(apiAboutMeService);
        }
        return apiAboutMe;
    }

    public Observable<BeanAboutMe> getData(){
        return apiAboutMeService.getData(API.key);
    }
}
