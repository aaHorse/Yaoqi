package com.example.zexiger.yaoqi.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.List;

public class BeanSearch {

    /**
     * code : 1
     * data : {"stateCode":1,"message":"成功","returnData":[{"comic_id":"45807","name":"鬼"},{"comic_id":"165083","name":"萌鬼到"},{"comic_id":"68471","name":"鬼刀"},{"comic_id":"72159","name":"沉溺的鬼与神兽"},{"comic_id":"6451","name":"鬼僧谈"},{"comic_id":"59753","name":"鬼录"},{"comic_id":"73060","name":"EVELYN鬼妻"},{"comic_id":"89122","name":"百鬼笙歌"},{"comic_id":"75935","name":"鬼笙"},{"comic_id":"80561","name":"百鬼之酒"}]}
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
         * returnData : [{"comic_id":"45807","name":"鬼"},{"comic_id":"165083","name":"萌鬼到"},{"comic_id":"68471","name":"鬼刀"},{"comic_id":"72159","name":"沉溺的鬼与神兽"},{"comic_id":"6451","name":"鬼僧谈"},{"comic_id":"59753","name":"鬼录"},{"comic_id":"73060","name":"EVELYN鬼妻"},{"comic_id":"89122","name":"百鬼笙歌"},{"comic_id":"75935","name":"鬼笙"},{"comic_id":"80561","name":"百鬼之酒"}]
         */

        private int stateCode;
        private String message;
        private List<ReturnDataBean> returnData;

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

        public List<ReturnDataBean> getReturnData() {
            return returnData;
        }

        public void setReturnData(List<ReturnDataBean> returnData) {
            this.returnData = returnData;
        }

        public static class ReturnDataBean implements MultiItemEntity {
            //
            private int itemType=1;
            //样式 1
            public static final int TYPE_1= 1;

            @Override
            public int getItemType() {
                return itemType;
            }

            public void setItemType(int itemType) {
                this.itemType = itemType;
            }
            /**
             * comic_id : 45807
             * name : 鬼
             */

            private String comic_id;
            private String name;

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
        }
    }
}
