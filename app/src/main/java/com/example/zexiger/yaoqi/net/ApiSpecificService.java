package com.example.zexiger.yaoqi.net;

import com.example.zexiger.yaoqi.bean.BeanSpecific;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiSpecificService {
    @GET(API.url_4)
    Observable<BeanSpecific> getUpdate(@Query("comicid")String comicid);
}
