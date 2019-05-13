package com.example.zexiger.yaoqi.net;

import com.example.zexiger.yaoqi.bean.BeanSpecificContent;

import io.reactivex.Observable;

public class ApiSpecificContent {
    public static ApiSpecificContent apiSpecificContent;
    private ApiSpecificContentService apiSpecificContentService;
    public ApiSpecificContent(ApiSpecificContentService apiSpecificContentService){
        this.apiSpecificContentService=apiSpecificContentService;
    }
    public static ApiSpecificContent getInstance(ApiSpecificContentService apiSpecificContentService){
        if(apiSpecificContent==null){
            apiSpecificContent=new ApiSpecificContent(apiSpecificContentService);
        }
        return apiSpecificContent;
    }
    public Observable<BeanSpecificContent>getDate(String chapter_id){
        return apiSpecificContentService.getDate(chapter_id);
    }
}
