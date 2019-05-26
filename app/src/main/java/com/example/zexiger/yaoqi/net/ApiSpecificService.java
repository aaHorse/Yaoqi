package com.example.zexiger.yaoqi.net;

import com.example.zexiger.yaoqi.bean.BeanSpecific_combine;
import com.example.zexiger.yaoqi.bean.BeanSpecific_dynamic;
import com.example.zexiger.yaoqi.bean.Status;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiSpecificService {
    @GET(API.url_4)
    Observable<BeanSpecific_combine> getUpdate(@Query("comicid")String comicid, @Query("key")String key, @Query("v")String v);

    @GET(API.url_5)
    Observable<BeanSpecific_dynamic> getUpdate_2(@Query("comicid")String comicid, @Query("key")String key);

    @FormUrlEncoded
    @POST(API.url_9)
    Observable<Status>favorite(@Query("key")String key, @Field("data")String data_, @Field("query")int query);
}
