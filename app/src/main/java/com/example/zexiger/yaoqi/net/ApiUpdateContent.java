package com.example.zexiger.yaoqi.net;

import com.example.zexiger.yaoqi.bean.BeanUpdate;

import io.reactivex.Observable;

public class ApiUpdateContent {
    public static ApiUpdateContent apiUpdateContent;
    private ApiUpdateContentService apiUpdateContentService;
    public ApiUpdateContent(ApiUpdateContentService apiUpdateContentService){
        this.apiUpdateContentService=apiUpdateContentService;
    }

    public static ApiUpdateContent getInstance(ApiUpdateContentService apiUpdateContentService){
        if(apiUpdateContent==null){
            apiUpdateContent=new ApiUpdateContent(apiUpdateContentService);
        }
        return apiUpdateContent;
    }

    public Observable<BeanUpdate>getUpdate(String day){
        return apiUpdateContentService.getUpdate(day);
    }
}
