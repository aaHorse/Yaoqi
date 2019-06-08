package com.example.zexiger.yaoqi.net;

import com.example.zexiger.yaoqi.bean.BeanSpecificContent;

import io.reactivex.Observable;

public class ApiLoad {
    public static ApiLoad apiLoad;
    private ApiLoadService apiLoadService;
    public ApiLoad(ApiLoadService apiLoadService){
        this.apiLoadService=apiLoadService;
    }
    public static ApiLoad getInstance(ApiLoadService apiLoadService){
        if(apiLoad==null){
            apiLoad=new ApiLoad(apiLoadService);
        }
        return apiLoad;
    }
    public Observable<BeanSpecificContent> getDate(String chapter_id){
        return apiLoadService.getDate(chapter_id);
    }
}
