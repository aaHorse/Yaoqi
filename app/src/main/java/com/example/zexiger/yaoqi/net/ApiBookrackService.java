package com.example.zexiger.yaoqi.net;

import com.example.zexiger.yaoqi.bean.BeanBookrack;


import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiBookrackService {

    @GET(API.url_1)
    Observable<BeanBookrack> getBookrack();

}
