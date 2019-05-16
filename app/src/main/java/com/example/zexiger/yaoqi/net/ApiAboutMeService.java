package com.example.zexiger.yaoqi.net;

import com.example.zexiger.yaoqi.bean.BeanAboutMe;
import com.example.zexiger.yaoqi.bean.Status;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiAboutMeService {
    @GET(API.url_0)
    Observable<BeanAboutMe> getData(@Query("key")String key);

    @GET(API.url_7)
    Observable<Status> submit(@Query("mobile")String mobile);

    @GET(API.url_8)
    Observable<BeanAboutMe> submit_2(@Query("mobile")String mobile,
                                     @Query("phonecheckcode")String phonecheckcode,
                                     @Query("android_id")String android_id,
                                     @Query("site_mark")String site_mark
                                     );

    @GET(API.url_8)
    Observable<BeanAboutMe> submit_3(@Query("open_id")String open_id,
                                     @Query("access_token")String access_token,
                                     @Query("android_id")String android_id,
                                     @Query("site_mark")String site_mark
                                     );

}
