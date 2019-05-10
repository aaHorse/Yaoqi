package com.example.zexiger.yaoqi.module;



import com.example.zexiger.yaoqi.MyApp;
import com.example.zexiger.yaoqi.net.API;
import com.example.zexiger.yaoqi.net.ApiBookrack;
import com.example.zexiger.yaoqi.net.ApiBookrackService;
import com.example.zexiger.yaoqi.net.ApiDiscover;
import com.example.zexiger.yaoqi.net.ApiDiscoverService;
import com.example.zexiger.yaoqi.net.ApiUpdateContent;
import com.example.zexiger.yaoqi.net.ApiUpdateContentService;
import com.example.zexiger.yaoqi.net.RetrofitConfig;

import java.io.File;
import java.util.concurrent.TimeUnit;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


@Module
public class HttpModule {

    @Provides
    OkHttpClient.Builder provideOkHttpClient() {
        // 指定缓存路径,缓存大小100Mb
        Cache cache = new Cache(new File(MyApp.getContext().getCacheDir(), "HttpCache"),
                1024 * 1024 * 100);
        return new OkHttpClient().newBuilder().cache(cache)
                .retryOnConnectionFailure(true)
                .addInterceptor(RetrofitConfig.sLoggingInterceptor)
                .addInterceptor(RetrofitConfig.sRewriteCacheControlInterceptor)
                .addNetworkInterceptor(RetrofitConfig.sRewriteCacheControlInterceptor)
                .connectTimeout(10, TimeUnit.SECONDS);
    }

    @Provides
    ApiBookrack provideApiBookrack(OkHttpClient.Builder builder) {
        builder.addInterceptor(RetrofitConfig.sQueryParameterInterceptor);

        Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(builder.build());

        return ApiBookrack.getInstance(retrofitBuilder
                .baseUrl(API.BASE)
                .build().create(ApiBookrackService.class));
    }

    @Provides
    ApiUpdateContent providesApiUpdateContent(OkHttpClient.Builder builder) {
        builder.addInterceptor(RetrofitConfig.sQueryParameterInterceptor);

        Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(builder.build());

        return ApiUpdateContent.getInstance(retrofitBuilder
                .baseUrl(API.BASE)
                .build().create(ApiUpdateContentService.class));
    }

    @Provides
    ApiDiscover providesApiDiscover(OkHttpClient.Builder builder){
        builder.addInterceptor(RetrofitConfig.sQueryParameterInterceptor);

        Retrofit.Builder builder1=new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(builder.build());

        return ApiDiscover.newInstance(builder1.baseUrl(API.BASE).build().create(ApiDiscoverService.class));
    }
}
