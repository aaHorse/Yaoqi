package com.example.zexiger.yaoqi.net;

public class API {
    public final static String BASE="http://app.u17.com/";
    public final static String key="75b7512b09942f9b0edd41599df6aadf23169bca202c3176166537aa1fa36caf7ebc841c1255127edf1f6bc0632de6e866a9cc42f0b904cd8df9a6d79473a5cd618ced6af029cfc21802189fbf9e561" +
            "9faa563bc279002f29603313eecbbbbb0f66e17cb138fc8383f06a48180df0f43f8a635cdf13e682c%253A%253A%253Aopen";
    public final static String v="4500102";

    //账号登录
    public final static String url_0="v3/appV3_3/android/phone/member/autologin";

    //获取书架
    public final static String url_1 ="v3/appV3_3/android/phone/comic/favRecommend";

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

}
