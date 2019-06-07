package com.example.zexiger.yaoqi.net;

import com.example.zexiger.yaoqi.bean.BeanSearch;
import com.example.zexiger.yaoqi.bean.BeanSearchDefault;
import com.example.zexiger.yaoqi.bean.BeanSearch_2;

import io.reactivex.Observable;

public class ApiSearch {
    public static ApiSearch apiSearch;
    private ApiSearchService apiSearchService;
    public ApiSearch(ApiSearchService apiSearchService){
        this.apiSearchService=apiSearchService;
    }
    public static ApiSearch newInstance(ApiSearchService apiSearchService){
        if(apiSearch==null){
            apiSearch=new ApiSearch(apiSearchService);
        }
        return apiSearch;
    }

    public Observable<BeanSearchDefault>getData_0(){
        return apiSearchService.getData_0();
    }

    public Observable<BeanSearch> getData(String str){
        return apiSearchService.getDate(str);
    }

    public Observable<BeanSearch_2> getData_2(String str){
        return apiSearchService.getDate_2(str);
    }

}
