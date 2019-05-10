package com.example.zexiger.yaoqi.net;

import com.example.zexiger.yaoqi.bean.BeanDiscover;

import io.reactivex.Observable;

public class ApiDiscover {
    public static ApiDiscover apiDiscover;
    private ApiDiscoverService apiDiscoverService;
    public ApiDiscover(ApiDiscoverService apiDiscoverService){
        this.apiDiscoverService=apiDiscoverService;
    }
    public static ApiDiscover newInstance(ApiDiscoverService apiDiscoverService){
        if(apiDiscover==null){
        apiDiscover=new ApiDiscover(apiDiscoverService);
        }
        return apiDiscover;
    }

    public Observable<BeanDiscover> getDiscover(){
        return apiDiscoverService.getUpdate();
    }
}
