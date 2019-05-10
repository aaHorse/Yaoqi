package com.example.zexiger.yaoqi.net;

import com.example.zexiger.yaoqi.bean.BeanDiscover;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiDiscoverService {
    @GET(API.url_3)
    Observable<BeanDiscover> getUpdate();
}
