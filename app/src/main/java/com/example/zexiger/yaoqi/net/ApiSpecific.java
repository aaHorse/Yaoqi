package com.example.zexiger.yaoqi.net;

import com.example.zexiger.yaoqi.bean.BeanSpecific_combine;
import com.example.zexiger.yaoqi.bean.BeanSpecific_dynamic;
import com.example.zexiger.yaoqi.bean.Status;

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

    public Observable<BeanSpecific_combine>getSpecific(String comicid){
        return apiSpecificService.getUpdate(comicid,API.key,API.v);
    }

    public Observable<BeanSpecific_dynamic>getSpecific_2(String comicid){
        return apiSpecificService.getUpdate_2(comicid,API.key);
    }

    public Observable<Status>favorite(String data_,int query){
        return apiSpecificService.favorite(API.key,data_,query);
    }
}
