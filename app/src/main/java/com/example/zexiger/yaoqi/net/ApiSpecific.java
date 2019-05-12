package com.example.zexiger.yaoqi.net;

import com.example.zexiger.yaoqi.bean.BeanSpecific;
import com.example.zexiger.yaoqi.bean.BeanSpecific_2;

import io.reactivex.Observable;

public class ApiSpecific {
    public static ApiSpecific apiSpecific;
    private ApiSpecificService apiSpecificService;
    public ApiSpecific(ApiSpecificService apiSpecificService){
        this.apiSpecificService=apiSpecificService;
    }
    public static ApiSpecific newInstance(ApiSpecificService apiSpecificService){
        if(apiSpecific==null){
        apiSpecific=new ApiSpecific(apiSpecificService);
        }
        return apiSpecific;
    }

    public Observable<BeanSpecific>getSpecific(String comicid){
        return apiSpecificService.getUpdate(comicid,API.key,API.v);
    }

    public Observable<BeanSpecific_2>getSpecific_2(String comicid){
        return apiSpecificService.getUpdate_2(comicid,API.key);
    }
}
