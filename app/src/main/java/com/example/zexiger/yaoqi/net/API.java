package com.example.zexiger.yaoqi.net;

public class API {
    public final static String BASE="http://app.u17.com/";

    //获取书架
    public final static String url_1 ="v3/appV3_3/android/phone/comic/" +
            "favRecommend?come_from=lenovo&model=ZUK+Z2121" +
            "&serialNumber=3089dfb0&android_id=8e8c4ff5b6235ce9&v=4500102HTTP/1.1";

    //获取更新
    //这里需要修改日期，day=5
    public final static String url_2="v3/appV3_3/android/phone/list/" +
            "todayRecommendList?page=1&come_from=lenovo" +
            "&serialNumber=3089dfb0&v=4500102&model=ZUK+Z2121&android_id=8e8c4ff5b6235ce9HTTP/1.1";

    //获取发现
    public final static String url_3="v3/appV3_3/android/phone/comic/" +
            "getDetectListV4_5?come_from=lenovo&serialNumber=3089dfb0&v=4500102" +
            "&model=ZUK+Z2121&android_id=8e8c4ff5b6235ce9HTTP/1.1";

}
