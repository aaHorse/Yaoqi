package com.example.zexiger.yaoqi.net;

import com.example.zexiger.yaoqi.bean.BeanSpecificContent;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiLoadService {
    @GET(API.url_6)
    Observable<BeanSpecificContent> getDate(@Query("chapter_id")String chapter_id);
}
