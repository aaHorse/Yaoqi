package com.example.zexiger.yaoqi.net;

import com.example.zexiger.yaoqi.bean.BeanUpdate;

import io.reactivex.Observable;

public class ApiUpdate {
    public static ApiUpdate sApiUpdate;
    private ApiUpdateService mApiUpdateService;
    public ApiUpdate(ApiUpdateService mApiUpdateService){
        this.mApiUpdateService=mApiUpdateService;
    }

    public static ApiUpdate getInstance(ApiUpdateService mApiUpdateService){
        if(sApiUpdate==null){
            sApiUpdate=new ApiUpdate(mApiUpdateService);
        }
        return sApiUpdate;
    }

    /*
     * 获取默认推荐的书架列表
     * */
    public Observable<BeanUpdate> getUpdate(){
        return mApiUpdateService.getUpdate();
    }
}
