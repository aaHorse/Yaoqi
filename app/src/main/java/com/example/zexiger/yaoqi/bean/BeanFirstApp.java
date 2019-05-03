package com.example.zexiger.yaoqi.bean;

import java.util.List;

//http://app.u17.com/v3/appV3_3/android/phone/ad/launcher?come_from=lenovo&model=ZUK+Z2121&serialNumber=3089dfb0&android_id=8e8c4ff5b6235ce9&v=4500102HTTP/1.1
public class BeanFirstApp {

    /**
     * code : 1
     * data : {"stateCode":1,"returnData":{"out_ad_open":false,"startAd":{"linkType":3,"title":"妙手仙丹","content":"","ext":[{"key":"comicId","val":130521}],"image_width":"720","image_height":"1036","show_time":3000,"image_url":"http://static.u17i.com/app/default_screen_comic/android/open_screen_ad_comic_130521.jpg","image_id":1258,"receive_time":"201905031445"},"favAd":[{"linkType":9,"cover":"http://image.mylife.u17t.com/2019/04/25/1556189693_Wbnd4wvVuFbu.jpg","id":1340,"title":"限时活动","content":"阅读券免费领","ext":[],"over_time":1556985600}]}}
     */

    private int code;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * stateCode : 1
         * returnData : {"out_ad_open":false,"startAd":{"linkType":3,"title":"妙手仙丹","content":"","ext":[{"key":"comicId","val":130521}],"image_width":"720","image_height":"1036","show_time":3000,"image_url":"http://static.u17i.com/app/default_screen_comic/android/open_screen_ad_comic_130521.jpg","image_id":1258,"receive_time":"201905031445"},"favAd":[{"linkType":9,"cover":"http://image.mylife.u17t.com/2019/04/25/1556189693_Wbnd4wvVuFbu.jpg","id":1340,"title":"限时活动","content":"阅读券免费领","ext":[],"over_time":1556985600}]}
         */

        private int stateCode;
        private ReturnDataBean returnData;

        public int getStateCode() {
            return stateCode;
        }

        public void setStateCode(int stateCode) {
            this.stateCode = stateCode;
        }

        public ReturnDataBean getReturnData() {
            return returnData;
        }

        public void setReturnData(ReturnDataBean returnData) {
            this.returnData = returnData;
        }

        public static class ReturnDataBean {
            /**
             * out_ad_open : false
             * startAd : {"linkType":3,"title":"妙手仙丹","content":"","ext":[{"key":"comicId","val":130521}],"image_width":"720","image_height":"1036","show_time":3000,"image_url":"http://static.u17i.com/app/default_screen_comic/android/open_screen_ad_comic_130521.jpg","image_id":1258,"receive_time":"201905031445"}
             * favAd : [{"linkType":9,"cover":"http://image.mylife.u17t.com/2019/04/25/1556189693_Wbnd4wvVuFbu.jpg","id":1340,"title":"限时活动","content":"阅读券免费领","ext":[],"over_time":1556985600}]
             */

            private boolean out_ad_open;
            private StartAdBean startAd;
            private List<FavAdBean> favAd;

            public boolean isOut_ad_open() {
                return out_ad_open;
            }

            public void setOut_ad_open(boolean out_ad_open) {
                this.out_ad_open = out_ad_open;
            }

            public StartAdBean getStartAd() {
                return startAd;
            }

            public void setStartAd(StartAdBean startAd) {
                this.startAd = startAd;
            }

            public List<FavAdBean> getFavAd() {
                return favAd;
            }

            public void setFavAd(List<FavAdBean> favAd) {
                this.favAd = favAd;
            }

            public static class StartAdBean {
                /**
                 * linkType : 3
                 * title : 妙手仙丹
                 * content :
                 * ext : [{"key":"comicId","val":130521}]
                 * image_width : 720
                 * image_height : 1036
                 * show_time : 3000
                 * image_url : http://static.u17i.com/app/default_screen_comic/android/open_screen_ad_comic_130521.jpg
                 * image_id : 1258
                 * receive_time : 201905031445
                 */

                private int linkType;
                private String title;
                private String content;
                private String image_width;
                private String image_height;
                private int show_time;
                private String image_url;
                private int image_id;
                private String receive_time;
                private List<ExtBean> ext;

                public int getLinkType() {
                    return linkType;
                }

                public void setLinkType(int linkType) {
                    this.linkType = linkType;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }

                public String getImage_width() {
                    return image_width;
                }

                public void setImage_width(String image_width) {
                    this.image_width = image_width;
                }

                public String getImage_height() {
                    return image_height;
                }

                public void setImage_height(String image_height) {
                    this.image_height = image_height;
                }

                public int getShow_time() {
                    return show_time;
                }

                public void setShow_time(int show_time) {
                    this.show_time = show_time;
                }

                public String getImage_url() {
                    return image_url;
                }

                public void setImage_url(String image_url) {
                    this.image_url = image_url;
                }

                public int getImage_id() {
                    return image_id;
                }

                public void setImage_id(int image_id) {
                    this.image_id = image_id;
                }

                public String getReceive_time() {
                    return receive_time;
                }

                public void setReceive_time(String receive_time) {
                    this.receive_time = receive_time;
                }

                public List<ExtBean> getExt() {
                    return ext;
                }

                public void setExt(List<ExtBean> ext) {
                    this.ext = ext;
                }

                public static class ExtBean {
                    /**
                     * key : comicId
                     * val : 130521
                     */

                    private String key;
                    private int val;

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    public int getVal() {
                        return val;
                    }

                    public void setVal(int val) {
                        this.val = val;
                    }
                }
            }

            public static class FavAdBean {
                /**
                 * linkType : 9
                 * cover : http://image.mylife.u17t.com/2019/04/25/1556189693_Wbnd4wvVuFbu.jpg
                 * id : 1340
                 * title : 限时活动
                 * content : 阅读券免费领
                 * ext : []
                 * over_time : 1556985600
                 */

                private int linkType;
                private String cover;
                private int id;
                private String title;
                private String content;
                private int over_time;
                private List<?> ext;

                public int getLinkType() {
                    return linkType;
                }

                public void setLinkType(int linkType) {
                    this.linkType = linkType;
                }

                public String getCover() {
                    return cover;
                }

                public void setCover(String cover) {
                    this.cover = cover;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }

                public int getOver_time() {
                    return over_time;
                }

                public void setOver_time(int over_time) {
                    this.over_time = over_time;
                }

                public List<?> getExt() {
                    return ext;
                }

                public void setExt(List<?> ext) {
                    this.ext = ext;
                }
            }
        }
    }
}
