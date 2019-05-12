package com.example.zexiger.yaoqi.net;

import com.example.zexiger.yaoqi.bean.BeanSpecific;
import com.example.zexiger.yaoqi.bean.BeanSpecific_2;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiSpecificService {
    @GET(API.url_4)
    Observable<BeanSpecific> getUpdate(@Query("comicid")String comicid,@Query("key")String key,@Query("v")String v);

    @GET(API.url_5)
    Observable<BeanSpecific_2> getUpdate_2(@Query("comicid")String comicid, @Query("key")String key);
}
