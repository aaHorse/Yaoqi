package com.example.zexiger.yaoqi.bean;

import java.util.List;

public class BeanSearchDefault {

    /**
     * code : 1
     * data : {"stateCode":1,"message":"成功","returnData":{"hotItems":[{"comic_id":"181558","name":"无氧之爱","bgColor":"#D8577340"},{"comic_id":"68471","name":"鬼刀","bgColor":"#D8138D7E"},{"comic_id":"3166","name":"镇魂街","bgColor":"#D85DA446"},{"comic_id":"121836","name":"驭灵师","bgColor":"#D800A652"},{"comic_id":"71064","name":"斗罗大陆","bgColor":"#D8F5702D"},{"comic_id":"99679","name":"崩坏3rd","bgColor":"#D8AF8B6B"},{"comic_id":"120003","name":"非人哉","bgColor":"#D8F8A032"},{"comic_id":"125833","name":"没白活","bgColor":"#D89DA23E"},{"comic_id":"195","name":"雏蜂","bgColor":"#D8784B8E"},{"comic_id":"99874","name":"妖神记（全彩）","bgColor":"#D8527FC2"}],"defaultSearch":"鬼刀"}}
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
         * message : 成功
         * returnData : {"hotItems":[{"comic_id":"181558","name":"无氧之爱","bgColor":"#D8577340"},{"comic_id":"68471","name":"鬼刀","bgColor":"#D8138D7E"},{"comic_id":"3166","name":"镇魂街","bgColor":"#D85DA446"},{"comic_id":"121836","name":"驭灵师","bgColor":"#D800A652"},{"comic_id":"71064","name":"斗罗大陆","bgColor":"#D8F5702D"},{"comic_id":"99679","name":"崩坏3rd","bgColor":"#D8AF8B6B"},{"comic_id":"120003","name":"非人哉","bgColor":"#D8F8A032"},{"comic_id":"125833","name":"没白活","bgColor":"#D89DA23E"},{"comic_id":"195","name":"雏蜂","bgColor":"#D8784B8E"},{"comic_id":"99874","name":"妖神记（全彩）","bgColor":"#D8527FC2"}],"defaultSearch":"鬼刀"}
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
             * hotItems : [{"comic_id":"181558","name":"无氧之爱","bgColor":"#D8577340"},{"comic_id":"68471","name":"鬼刀","bgColor":"#D8138D7E"},{"comic_id":"3166","name":"镇魂街","bgColor":"#D85DA446"},{"comic_id":"121836","name":"驭灵师","bgColor":"#D800A652"},{"comic_id":"71064","name":"斗罗大陆","bgColor":"#D8F5702D"},{"comic_id":"99679","name":"崩坏3rd","bgColor":"#D8AF8B6B"},{"comic_id":"120003","name":"非人哉","bgColor":"#D8F8A032"},{"comic_id":"125833","name":"没白活","bgColor":"#D89DA23E"},{"comic_id":"195","name":"雏蜂","bgColor":"#D8784B8E"},{"comic_id":"99874","name":"妖神记（全彩）","bgColor":"#D8527FC2"}]
             * defaultSearch : 鬼刀
             */

            private String defaultSearch;
            private List<HotItemsBean> hotItems;

            public String getDefaultSearch() {
                return defaultSearch;
            }

            public void setDefaultSearch(String defaultSearch) {
                this.defaultSearch = defaultSearch;
            }

            public List<HotItemsBean> getHotItems() {
                return hotItems;
            }

            public void setHotItems(List<HotItemsBean> hotItems) {
                this.hotItems = hotItems;
            }

            public static class HotItemsBean {
                /**
                 * comic_id : 181558
                 * name : 无氧之爱
                 * bgColor : #D8577340
                 */

                private String comic_id;
                private String name;
                private String bgColor;

                public String getComic_id() {
                    return comic_id;
                }

                public void setComic_id(String comic_id) {
                    this.comic_id = comic_id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getBgColor() {
                    return bgColor;
                }

                public void setBgColor(String bgColor) {
                    this.bgColor = bgColor;
                }
            }
        }
    }
}
