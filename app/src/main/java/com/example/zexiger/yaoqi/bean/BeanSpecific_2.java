package com.example.zexiger.yaoqi.bean;

import java.util.List;

//http://app.u17.com//v3/appV3_3/android/phone/comic/detail_realtime?come_from=lenovo&comicid=8805&serialNumber=3089dfb0&t=1557624742&v=4500102&model=ZUK+Z2121&android_id=8e8c4ff5b6235ce9%20HTTP/1.1
public class BeanSpecific_2 {

    /*
    * 获取月票等数据
    * */

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

            private ComicBean comic;

            public ComicBean getComic() {
                return comic;
            }

            public void setComic(ComicBean comic) {
                this.comic = comic;
            }


            public static class ComicBean {
                /**
                 * comic_id : 8805
                 * status : 2
                 * user_id : 190368
                 * total_click : 945987081
                 * favorite_total : 1546582
                 * total_ticket : 483496
                 * monthly_ticket : 3069
                 * month_ticket : 3069
                 * total_tucao : 325898
                 * gift_total : 371
                 * vip_discount : 0.92
                 * year_vip_discount : 0.87
                 * is_free : 0
                 * is_vip_free : false
                 * is_vip_buy : false
                 * is_buy_action : 0
                 * is_auto_buy : 0
                 */

                private String comic_id;
                private String status;
                private String user_id;
                private int total_click;
                private int favorite_total;
                private int total_ticket;
                private int monthly_ticket;
                private String month_ticket;
                private int total_tucao;
                private int gift_total;
                private double vip_discount;
                private double year_vip_discount;
                private int is_free;
                private boolean is_vip_free;
                private boolean is_vip_buy;
                private int is_buy_action;
                private int is_auto_buy;

                public String getComic_id() {
                    return comic_id;
                }

                public void setComic_id(String comic_id) {
                    this.comic_id = comic_id;
                }

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public String getUser_id() {
                    return user_id;
                }

                public void setUser_id(String user_id) {
                    this.user_id = user_id;
                }

                public int getTotal_click() {
                    return total_click;
                }

                public void setTotal_click(int total_click) {
                    this.total_click = total_click;
                }

                public int getFavorite_total() {
                    return favorite_total;
                }

                public void setFavorite_total(int favorite_total) {
                    this.favorite_total = favorite_total;
                }

                public int getTotal_ticket() {
                    return total_ticket;
                }

                public void setTotal_ticket(int total_ticket) {
                    this.total_ticket = total_ticket;
                }

                public int getMonthly_ticket() {
                    return monthly_ticket;
                }

                public void setMonthly_ticket(int monthly_ticket) {
                    this.monthly_ticket = monthly_ticket;
                }

                public String getMonth_ticket() {
                    return month_ticket;
                }

                public void setMonth_ticket(String month_ticket) {
                    this.month_ticket = month_ticket;
                }

                public int getTotal_tucao() {
                    return total_tucao;
                }

                public void setTotal_tucao(int total_tucao) {
                    this.total_tucao = total_tucao;
                }

                public int getGift_total() {
                    return gift_total;
                }

                public void setGift_total(int gift_total) {
                    this.gift_total = gift_total;
                }

                public double getVip_discount() {
                    return vip_discount;
                }

                public void setVip_discount(double vip_discount) {
                    this.vip_discount = vip_discount;
                }

                public double getYear_vip_discount() {
                    return year_vip_discount;
                }

                public void setYear_vip_discount(double year_vip_discount) {
                    this.year_vip_discount = year_vip_discount;
                }

                public int getIs_free() {
                    return is_free;
                }

                public void setIs_free(int is_free) {
                    this.is_free = is_free;
                }

                public boolean isIs_vip_free() {
                    return is_vip_free;
                }

                public void setIs_vip_free(boolean is_vip_free) {
                    this.is_vip_free = is_vip_free;
                }

                public boolean isIs_vip_buy() {
                    return is_vip_buy;
                }

                public void setIs_vip_buy(boolean is_vip_buy) {
                    this.is_vip_buy = is_vip_buy;
                }

                public int getIs_buy_action() {
                    return is_buy_action;
                }

                public void setIs_buy_action(int is_buy_action) {
                    this.is_buy_action = is_buy_action;
                }

                public int getIs_auto_buy() {
                    return is_auto_buy;
                }

                public void setIs_auto_buy(int is_auto_buy) {
                    this.is_auto_buy = is_auto_buy;
                }
            }

        }
    }
}
