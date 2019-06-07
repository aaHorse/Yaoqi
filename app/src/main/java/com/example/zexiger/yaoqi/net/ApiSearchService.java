package com.example.zexiger.yaoqi.net;

import com.example.zexiger.yaoqi.bean.BeanSearch;
import com.example.zexiger.yaoqi.bean.BeanSearchDefault;
import com.example.zexiger.yaoqi.bean.BeanSearch_2;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiSearchService {
    @GET(API.url_12)
    Observable<BeanSearchDefault>getData_0();

    @GET(API.url_10)
    Observable<BeanSearch> getDate(@Query("inputText")String string);

    @GET(API.url_11)
    Observable<BeanSearch_2> getDate_2(@Query("q")String string);
}
