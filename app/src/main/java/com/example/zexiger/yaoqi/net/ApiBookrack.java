package com.example.zexiger.yaoqi.net;


import com.example.zexiger.yaoqi.bean.BeanBookrack;

import io.reactivex.Observable;

public class ApiBookrack {
    public static ApiBookrack sApiBookrack;
    private ApiBookrackService mApiBookrackService;

    public ApiBookrack(ApiBookrackService apiBookrackService){
        this.mApiBookrackService=apiBookrackService;
    }

    /*
    * 单一实例
    * */
    public static ApiBookrack getInstance(ApiBookrackService apiBookrackService){
        if (sApiBookrack==null){
            sApiBookrack=new ApiBookrack(apiBookrackService);
        }
        return  sApiBookrack;
    }

    /*
    * 获取默认推荐的书架列表
    * */
    public Observable<BeanBookrack> getBookrack(){
        return mApiBookrackService.getBookrack();
    }
}
