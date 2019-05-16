package com.example.zexiger.yaoqi.net;

import com.example.zexiger.yaoqi.bean.BeanAboutMe;
import com.example.zexiger.yaoqi.bean.Status;

import io.reactivex.Observable;

public class ApiAboutMe {
    public static ApiAboutMe apiAboutMe;
    private ApiAboutMeService apiAboutMeService;
    public ApiAboutMe(ApiAboutMeService apiAboutMeService){
        this.apiAboutMeService=apiAboutMeService;
    }
    public static ApiAboutMe getInstance(ApiAboutMeService apiAboutMeService){
        if(apiAboutMe==null){
            apiAboutMe=new ApiAboutMe(apiAboutMeService);
        }
        return apiAboutMe;
    }

    public Observable<BeanAboutMe> getData(){
        return apiAboutMeService.getData(API.key);
    }

    public Observable<Status> submit(String num){
        return apiAboutMeService.submit(num);
    }

    public Observable<BeanAboutMe>submit_2(String num,String num_2,String android_id,String site_mark){
        return apiAboutMeService.submit_2(num,num_2,android_id,site_mark);
    }

    public Observable<BeanAboutMe>submit_3(String open_id,String access_token,String android_id,String site_mark){
        return  apiAboutMeService.submit_3(open_id,access_token,android_id,site_mark);
    }
}
