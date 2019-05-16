package com.example.zexiger.yaoqi.bean;

/*
* 这一个实体类，主要用于解析一些网络请求的状态信息
* */
public class Status {

    /**
     * code : 1
     * data : {"stateCode":-1307,"message":"当前操作过于频繁，请稍后再试"}
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
         * stateCode : -1307
         * message : 当前操作过于频繁，请稍后再试
         */

        private int stateCode;
        private String message;

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
    }
}
