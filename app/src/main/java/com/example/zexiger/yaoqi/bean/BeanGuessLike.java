package com.example.zexiger.yaoqi.bean;

import java.util.List;

//http://app.u17.com//v3/appV3_3/android/phone/comic/guessLike?comic_id=8805&come_from=lenovo&serialNumber=3089dfb0&device_id=861305033180705&v=4500102&model=ZUK+Z2121&android_id=8e8c4ff5b6235ce9%20HTTP/1.1
public class BeanGuessLike {

    /**
     * code : 1
     * data : {"stateCode":1,"message":"操作成功","returnData":{"comics":[{"comic_id":181558,"name":"无氧之爱","cover":"http://cover.u17i.com/2019/01/3901473_1547905251_T0rqqr61Kk1q.sbig.jpg","short_description":"深海谈一场无氧之爱"},{"comic_id":3166,"name":"镇魂街","cover":"http://cover.u17i.com/2010/11/2786_1290484999_44z22704KDLT.sbig.jpg","short_description":"镇守恶灵之街的青年"},{"comic_id":13707,"name":"端脑","cover":"http://cover.u17i.com/2014/10/12647_1413948764_xeZ2KC11sccR.sbig.jpg","short_description":"极致大脑游戏解谜"}],"defaultMessage":"猜你喜欢"}}
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
         * message : 操作成功
         * returnData : {"comics":[{"comic_id":181558,"name":"无氧之爱","cover":"http://cover.u17i.com/2019/01/3901473_1547905251_T0rqqr61Kk1q.sbig.jpg","short_description":"深海谈一场无氧之爱"},{"comic_id":3166,"name":"镇魂街","cover":"http://cover.u17i.com/2010/11/2786_1290484999_44z22704KDLT.sbig.jpg","short_description":"镇守恶灵之街的青年"},{"comic_id":13707,"name":"端脑","cover":"http://cover.u17i.com/2014/10/12647_1413948764_xeZ2KC11sccR.sbig.jpg","short_description":"极致大脑游戏解谜"}],"defaultMessage":"猜你喜欢"}
         */

        private int stateCode;
        private String message;
        private ReturnDataBean returnData;

        public int getStateCode() {
            return stateCode;
        }

        public void setStateCode(int stateCode) {
            this.stateCode = stateCode;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public ReturnDataBean getReturnData() {
            return returnData;
        }

        public void setReturnData(ReturnDataBean returnData) {
            this.returnData = returnData;
        }

        public static class ReturnDataBean {
            /**
             * comics : [{"comic_id":181558,"name":"无氧之爱","cover":"http://cover.u17i.com/2019/01/3901473_1547905251_T0rqqr61Kk1q.sbig.jpg","short_description":"深海谈一场无氧之爱"},{"comic_id":3166,"name":"镇魂街","cover":"http://cover.u17i.com/2010/11/2786_1290484999_44z22704KDLT.sbig.jpg","short_description":"镇守恶灵之街的青年"},{"comic_id":13707,"name":"端脑","cover":"http://cover.u17i.com/2014/10/12647_1413948764_xeZ2KC11sccR.sbig.jpg","short_description":"极致大脑游戏解谜"}]
             * defaultMessage : 猜你喜欢
             */

            private String defaultMessage;
            private List<ComicsBean> comics;

            public String getDefaultMessage() {
                return defaultMessage;
            }

            public void setDefaultMessage(String defaultMessage) {
                this.defaultMessage = defaultMessage;
            }

            public List<ComicsBean> getComics() {
                return comics;
            }

            public void setComics(List<ComicsBean> comics) {
                this.comics = comics;
            }

            public static class ComicsBean {
                /**
                 * comic_id : 181558
                 * name : 无氧之爱
                 * cover : http://cover.u17i.com/2019/01/3901473_1547905251_T0rqqr61Kk1q.sbig.jpg
                 * short_description : 深海谈一场无氧之爱
                 */

                private int comic_id;
                private String name;
                private String cover;
                private String short_description;

                public int getComic_id() {
                    return comic_id;
                }

                public void setComic_id(int comic_id) {
                    this.comic_id = comic_id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getCover() {
                    return cover;
                }

                public void setCover(String cover) {
                    this.cover = cover;
                }

                public String getShort_description() {
                    return short_description;
                }

                public void setShort_description(String short_description) {
                    this.short_description = short_description;
                }
            }
        }
    }
}
