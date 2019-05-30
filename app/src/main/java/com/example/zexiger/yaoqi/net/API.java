package com.example.zexiger.yaoqi.net;

import android.os.Environment;

public class API {
    public final static String BASE="http://app.u17.com/";
    public static String key="";

    public final static String v="4500102";

    //账号登录  待调用
    public final static String url_0="v3/appV3_3/android/phone/member/autologin";

    //获取书架
    public final static String url_1 ="v3/appV3_3/android/phone/fav/index";

    //获取更新
    public final static String url_2="v3/appV3_3/android/phone/list/todayRecommendList";

    //获取发现
    public final static String url_3="v3/appV3_3/android/phone/comic/getDetectListV4_5";

    //单个漫画的详情,  comicid=8805
    public final static String url_4="v3/appV3_3/android/phone/comic/detail_static_new";
    //获取月票等数据,comicid,key
    public final static String url_5="v3/appV3_3/android/phone/comic/detail_realtime";

    //具体的漫画图片
    public final static String url_6="v3/appV3_3/android/phone/comic/chapterNew";

    //上传手机号，发送验证码
    public final static String url_7="v3/appV3_3/android/phone/member/getMobileMessage";

    //上传手机号，短信号，进行登录
    public final static String url_8="v3/appV3_3/android/phone/member/openLogin";

    //收藏漫画，将信息上传服务器
    public final static String url_9="v3/appV3_3/android/phone/fav/index";

}
