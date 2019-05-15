package com.example.zexiger.yaoqi.net;

import com.example.zexiger.yaoqi.bean.BeanAboutMe;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiAboutMeService {
    @GET(API.url_0)
    Observable<BeanAboutMe> getData(@Query("key")String key);
}
