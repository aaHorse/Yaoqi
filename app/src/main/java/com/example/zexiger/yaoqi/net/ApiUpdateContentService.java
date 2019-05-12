package com.example.zexiger.yaoqi.net;

import com.example.zexiger.yaoqi.bean.BeanUpdate;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiUpdateContentService {

    @GET(API.url_2)
    Observable<BeanUpdate> getUpdate(@Query("day")String day,@Query("page")int page);
}
