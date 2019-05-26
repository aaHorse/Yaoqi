package com.example.zexiger.yaoqi.bean;

import java.util.List;

//http://app.u17.com//v3/appV3_3/android/phone/comic/detail_realtime?come_from=lenovo&comicid=8805&serialNumber=3089dfb0&t=1557624742&v=4500102&model=ZUK+Z2121&android_id=8e8c4ff5b6235ce9%20HTTP/1.1
public class BeanSpecific_dynamic {

    //漫画的信息，含月票
    //动态

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
            private CommentBean comment;
            private LastReadBean last_read;
            private List<ChapterListBean> chapter_list;

            public ComicBean getComic() {
                return comic;
            }

            public void setComic(ComicBean comic) {
                this.comic = comic;
            }

            public CommentBean getComment() {
                return comment;
            }

            public void setComment(CommentBean comment) {
                this.comment = comment;
            }

            public LastReadBean getLast_read() {
                return last_read;
            }

            public void setLast_read(LastReadBean last_read) {
                this.last_read = last_read;
            }

            public List<ChapterListBean> getChapter_list() {
                return chapter_list;
            }

            public void setChapter_list(List<ChapterListBean> chapter_list) {
                this.chapter_list = chapter_list;
            }

            public static class ComicBean {
                /**
                 * comic_id : 8805
                 * user_id : 190368
                 * status : 2
                 * total_ticket : 485286
                 * total_tucao : 326177
                 * month_ticket : 4859
                 * favorite_total : 1570439
                 * gift_total : 374
                 * total_click : 947872406
                 * monthly_ticket : 4859
                 * vip_discount : 0.92
                 * year_vip_discount : 0.87
                 * is_vip_free : false
                 * is_free : 0
                 * is_vip_buy : false
                 * is_buy_action : 0
                 * is_auto_buy : 0
                 * vip_voucher_count : 0
                 */

                private String comic_id;
                private String user_id;
                private String status;
                private int total_ticket;
                private int total_tucao;
                private String month_ticket;
                private int favorite_total;
                private int gift_total;
                private int total_click;
                private int monthly_ticket;
                private double vip_discount;
                private double year_vip_discount;
                private boolean is_vip_free;
                private int is_free;
                private boolean is_vip_buy;
                private int is_buy_action;
                private int is_auto_buy;
                private String vip_voucher_count;

                public String getComic_id() {
                    return comic_id;
                }

                public void setComic_id(String comic_id) {
                    this.comic_id = comic_id;
                }

                public String getUser_id() {
                    return user_id;
                }

                public void setUser_id(String user_id) {
                    this.user_id = user_id;
                }

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public int getTotal_ticket() {
                    return total_ticket;
                }

                public void setTotal_ticket(int total_ticket) {
                    this.total_ticket = total_ticket;
                }

                public int getTotal_tucao() {
                    return total_tucao;
                }

                public void setTotal_tucao(int total_tucao) {
                    this.total_tucao = total_tucao;
                }

                public String getMonth_ticket() {
                    return month_ticket;
                }

                public void setMonth_ticket(String month_ticket) {
                    this.month_ticket = month_ticket;
                }

                public int getFavorite_total() {
                    return favorite_total;
                }

                public void setFavorite_total(int favorite_total) {
                    this.favorite_total = favorite_total;
                }

                public int getGift_total() {
                    return gift_total;
                }

                public void setGift_total(int gift_total) {
                    this.gift_total = gift_total;
                }

                public int getTotal_click() {
                    return total_click;
                }

                public void setTotal_click(int total_click) {
                    this.total_click = total_click;
                }

                public int getMonthly_ticket() {
                    return monthly_ticket;
                }

                public void setMonthly_ticket(int monthly_ticket) {
                    this.monthly_ticket = monthly_ticket;
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

                public boolean isIs_vip_free() {
                    return is_vip_free;
                }

                public void setIs_vip_free(boolean is_vip_free) {
                    this.is_vip_free = is_vip_free;
                }

                public int getIs_free() {
                    return is_free;
                }

                public void setIs_free(int is_free) {
                    this.is_free = is_free;
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

                public String getVip_voucher_count() {
                    return vip_voucher_count;
                }

                public void setVip_voucher_count(String vip_voucher_count) {
                    this.vip_voucher_count = vip_voucher_count;
                }
            }

            public static class CommentBean {
                /**
                 * commentCount : 54311
                 * commentList : [{"cate":"5","color":null,"is_lock":"0","comment_from":"u17","ip":"183.240.200.*","comment_id":"8618899","user_id":"26701","content":"从刚毕业，再到各地奔波，再到结婚生子，从网上搜乱七八糟的会员号，到一不小心一买又是一整年的VIP，是剧情吸引了我。有时候真的把作者按在地下问：你这家伙怎么就把进度拖得这么慢！！！有时也会想想，作者工作室不知道花了几十个小时才更新一集漫画，而我们也就花了两三分钟细味其一二，总而言之，新款啦！也没忘丢三张月票，想想都三十有多都支持你！生活共勉吧！开心就好！","create_time":"1541920801","floor":"45492","is_delete":"0","is_up":"1","total_reply":"5","content_filter":"从刚毕业，再到各地奔波，再到结婚生子，从网上搜乱七八糟的会员号，到一不小心一买又是一整年的VIP，是剧情吸引了我。有时候真的把作者按在地下问：你这家伙怎么就把进度拖得这么慢！！！有时也会想想，作者工作室不知道花了几十个小时才更新一集漫画，而我们也就花了两三分钟细味其一二，总而言之，新款啦！也没忘丢三张月票，想想都三十有多都支持你！生活共勉吧！开心就好！","imageList":[],"vip_exp":"10670","face_type":"0","title":"0","nickname":"BIBU","group_user":"1","group_admin":"0","group_author":"0","face":"http://k.avatar.u17i.com/2010/0406/26701_90a73d2023d4cbf8ed7f19b0e2b9a40f_1270525420.big.gif","sex":"男","exp":"2246.00","online_time":"530594","group_custom":null,"id":"26701","level":{"level":5,"min_exp":6000,"max":10799,"exp_speed":1.7,"album_size":700,"favorite_num":80,"wage":500,"ticket":15},"create_time_str":"6月前","likeState":0,"likeCount":0,"reply":[{"parent_id":"8618899","color":null,"is_lock":"0","comment_from":"u17","ip":"106.61.15.*","comment_id":"8928638","user_id":"14432766","content":"<a href=\"http://i.u17.com/29022913\" target=\"_blank\">@漫友85127428<\/a>&nbsp;:&nbsp;","create_time":"1557810105","floor":"5","is_delete":"0","content_filter":" : ","imageList":[],"vip_exp":"0","face_type":"0","title":"0","nickname":"漫友86281646","group_user":"0","group_admin":"0","group_author":"0","face":"http://k.avatar.u17i.com/2016/0424/14432766_8af6d556161f6e7ca34ff1a3c06d2ac2_1461450405.big.jpg","sex":"男","exp":"0.00","online_time":"0","group_custom":"","id":"14432766","level":{"level":1,"min_exp":0,"max":599,"exp_speed":1.1,"album_size":50,"favorite_num":30,"wage":200,"ticket":13},"create_time_str":"1周前","likeState":0,"likeCount":0},{"parent_id":"8618899","color":null,"is_lock":"0","comment_from":"u17","ip":"106.61.15.*","comment_id":"8928637","user_id":"14432766","content":"<a href=\"http://i.u17.com/28949933\" target=\"_blank\">@有几个在用<\/a>&nbsp;:&nbsp;","create_time":"1557810087","floor":"4","is_delete":"0","content_filter":" : ","imageList":[],"vip_exp":"0","face_type":"0","title":"0","nickname":"漫友86281646","group_user":"0","group_admin":"0","group_author":"0","face":"http://k.avatar.u17i.com/2016/0424/14432766_8af6d556161f6e7ca34ff1a3c06d2ac2_1461450405.big.jpg","sex":"男","exp":"0.00","online_time":"0","group_custom":"","id":"14432766","level":{"level":1,"min_exp":0,"max":599,"exp_speed":1.1,"album_size":50,"favorite_num":30,"wage":200,"ticket":13},"create_time_str":"1周前","likeState":0,"likeCount":0}]},{"cate":"0","color":"0000FF","is_lock":"1","comment_from":"u17","ip":"14.208.248.*","comment_id":"3624853","user_id":"190368","content":"读者群（500人大群）&nbsp;123122117<br />\n<br />\n【入群申请：请说出作品中最喜欢的角色名称】","create_time":"1403434856","floor":"16808","is_delete":"0","is_up":"1","total_reply":"1","content_filter":"读者群（500人大群） 123122117\n\n【入群申请：请说出作品中最喜欢的角色名称】","imageList":[],"vip_exp":"0","face_type":"0","title":"0","nickname":"黄晓达","group_user":"99","group_admin":"0","group_author":"1","face":"http://k.avatar.u17i.com/2013/0331/190368_613e84c72944dee9979f780f6c4cfd8b_1364694763.big.png","sex":"男","exp":"8650.50","online_time":"16854696","group_custom":null,"id":"190368","level":{"level":1,"min_exp":0,"max":599,"exp_speed":1.1,"album_size":50,"favorite_num":30,"wage":200,"ticket":13},"create_time_str":"无更新","likeState":0,"likeCount":0,"reply":[{"parent_id":"3624853","color":"6600FF","is_lock":"0","comment_from":"u17","ip":"124.202.228.*","comment_id":"3630330","user_id":"1137","content":"以下是读者建特殊群（腐），选喜欢滴cp加入哦~<br />\n36798588&nbsp;虎鹤<br />\n86394818&nbsp;鹤虎<br />\n<br />\n【入群申请：请说出作品中最喜欢的角色名称】<br />\n<br />\n[f293]<br />\n<br />\n","create_time":"1403677109","floor":"1","is_delete":"0","content_filter":"以下是读者建特殊群（腐），选喜欢滴cp加入哦~\n36798588 虎鹤\n86394818 鹤虎\n\n【入群申请：请说出作品中最喜欢的角色名称】\n\n[f293]\n\n","imageList":[],"vip_exp":"39218","face_type":"9","title":"26","nickname":"川雅也","group_user":"1","group_admin":"2","group_author":"0","face":"http://k.avatar.u17i.com/2011/0706/1137_5694a574f12da2c8227230c16f05b085_1309949649.big.jpg","sex":"女","exp":"38390.30","online_time":"45296210","group_custom":null,"id":"1137","level":{"level":6,"min_exp":10800,"max":9999999,"exp_speed":2,"album_size":1024,"favorite_num":100,"wage":600,"ticket":15},"create_time_str":"无更新","likeState":0,"likeCount":0}]},{"cate":"3","color":null,"is_lock":"0","comment_from":"u17","ip":"116.4.26.*","comment_id":"8935547","user_id":"227817","content":"这三张投给蛇精一样的调查团","create_time":"1558582344","floor":"51218","is_delete":"0","is_up":"0","total_reply":"0","content_filter":"这三张投给蛇精一样的调查团","imageList":[],"vip_exp":"1310","face_type":"0","title":"0","nickname":"流萤月光","group_user":"1","group_admin":"0","group_author":"0","face":"http://static.u17i.com/common/images/face/default.big.png","sex":"男","exp":"2271.00","online_time":"660849","group_custom":null,"id":"227817","level":{"level":2,"min_exp":600,"max":1799,"exp_speed":1.2,"album_size":100,"favorite_num":40,"wage":250,"ticket":13},"create_time_str":"3小时前","likeState":0,"likeCount":0,"reply":[]},{"cate":"5","color":null,"is_lock":"0","comment_from":"u17","ip":"61.183.142.*","comment_id":"8935526","user_id":"11998327","content":"这个调查团\u2026\u2026\u2026\u2026已经让人无力吐槽了\u2026\u2026","create_time":"1558579164","floor":"51217","is_delete":"0","is_up":"0","total_reply":"0","content_filter":"这个调查团\u2026\u2026\u2026\u2026已经让人无力吐槽了\u2026\u2026","imageList":[],"vip_exp":"14450","face_type":"0","title":"0","nickname":"长颈鹿不吃草1","group_user":"1","group_admin":"0","group_author":"0","face":"http://k.avatar.u17i.com/2015/0820/11998327_c1a8b8309bdbd2fe89d5aec9be7ab00a_1440074470.big.jpg","sex":"男","exp":"9113.60","online_time":"1848853","group_custom":"","id":"11998327","level":{"level":6,"min_exp":10800,"max":9999999,"exp_speed":2,"album_size":1024,"favorite_num":100,"wage":600,"ticket":15},"create_time_str":"3小时前","likeState":0,"likeCount":0,"reply":[]},{"cate":"5","color":null,"is_lock":"0","comment_from":"u17","ip":"117.136.79.*","comment_id":"8935485","user_id":"4131290","content":"票票代表我的爱~大大加油！","create_time":"1558575710","floor":"51216","is_delete":"0","is_up":"0","total_reply":"0","content_filter":"票票代表我的爱~大大加油！","imageList":[],"vip_exp":"18900","face_type":"0","title":"0","nickname":"大宝蛋","group_user":"1","group_admin":"0","group_author":"0","face":"http://static.u17i.com/common/images/face/default.big.png","sex":"男","exp":"12343.70","online_time":"6351320","group_custom":null,"id":"4131290","level":{"level":6,"min_exp":10800,"max":9999999,"exp_speed":2,"album_size":1024,"favorite_num":100,"wage":600,"ticket":15},"create_time_str":"4小时前","likeState":0,"likeCount":0,"reply":[]},{"cate":"5","color":null,"is_lock":"0","comment_from":"u17","ip":"223.104.5.*","comment_id":"8935452","user_id":"10732480","content":"票票代表我的爱~大大加油！","create_time":"1558571471","floor":"51215","is_delete":"0","is_up":"0","total_reply":"0","content_filter":"票票代表我的爱~大大加油！","imageList":[],"vip_exp":"12220","face_type":"0","title":"0","nickname":"漫友44077246","group_user":"1","group_admin":"0","group_author":"0","face":"http://k.avatar.u17i.com/2017/0924/10732480_e11c1ce8babb45083b84506e3996b94b_1506234247.big.jpg","sex":"男","exp":"1073.20","online_time":"0","group_custom":"","id":"10732480","level":{"level":6,"min_exp":10800,"max":9999999,"exp_speed":2,"album_size":1024,"favorite_num":100,"wage":600,"ticket":15},"create_time_str":"6小时前","likeState":0,"likeCount":0,"reply":[]},{"cate":"3","color":null,"is_lock":"0","comment_from":"u17","ip":"113.246.60.*","comment_id":"8935374","user_id":"1019082","content":"票票代表我的爱~大大加油！","create_time":"1558543757","floor":"51213","is_delete":"0","is_up":"0","total_reply":"0","content_filter":"票票代表我的爱~大大加油！","imageList":[],"vip_exp":"13700","face_type":"0","title":"0","nickname":"liangT","group_user":"1","group_admin":"0","group_author":"0","face":"http://static.u17i.com/common/images/face/default.big.png","sex":"男","exp":"2626.90","online_time":"1246892","group_custom":null,"id":"1019082","level":{"level":6,"min_exp":10800,"max":9999999,"exp_speed":2,"album_size":1024,"favorite_num":100,"wage":600,"ticket":15},"create_time_str":"13小时前","likeState":0,"likeCount":0,"reply":[]},{"cate":"5","color":null,"is_lock":"0","comment_from":"u17","ip":"119.128.146.*","comment_id":"8935360","user_id":"17329783","content":"哇，真的猜你不到，调查团居然是这样的。","create_time":"1558542453","floor":"51212","is_delete":"0","is_up":"0","total_reply":"0","content_filter":"哇，真的猜你不到，调查团居然是这样的。","imageList":[],"vip_exp":"4280","face_type":"0","title":"0","nickname":"The Moment","group_user":"1","group_admin":"0","group_author":"0","face":"http://k.avatar.u17i.com/2018/0618/17329783_ed1f16ae4704b749da73938e8e34df26_1529336403.big.jpg","sex":"男","exp":"0.00","online_time":"0","group_custom":"","id":"17329783","level":{"level":4,"min_exp":3600,"max":5999,"exp_speed":1.5,"album_size":400,"favorite_num":60,"wage":400,"ticket":14},"create_time_str":"14小时前","likeState":0,"likeCount":0,"reply":[]},{"cate":"0","color":null,"is_lock":"0","comment_from":"u17","ip":"36.106.67.*","comment_id":"8935309","user_id":"21895698","content":"3张月票已投，只求更新速度快点","create_time":"1558538020","floor":"51211","is_delete":"0","is_up":"0","total_reply":"0","content_filter":"3张月票已投，只求更新速度快点","imageList":[],"vip_exp":"5360","face_type":"0","title":"0","nickname":"漫友92649632","group_user":"1","group_admin":"0","group_author":"0","face":"http://static.u17i.com/common/images/face/default.big.png","sex":"保密","exp":"0.00","online_time":"0","group_custom":"","id":"21895698","level":{"level":4,"min_exp":3600,"max":5999,"exp_speed":1.5,"album_size":400,"favorite_num":60,"wage":400,"ticket":14},"create_time_str":"15小时前","likeState":0,"likeCount":0,"reply":[]},{"cate":"5","color":null,"is_lock":"0","comment_from":"u17","ip":"221.238.56.*","comment_id":"8935293","user_id":"3361536","content":"[f427]","create_time":"1558536819","floor":"51210","is_delete":"0","is_up":"0","total_reply":"0","content_filter":"[f427]","imageList":[],"vip_exp":"14170","face_type":"0","title":"28","nickname":"咲苏打","group_user":"1","group_admin":"0","group_author":"0","face":"http://k.avatar.u17i.com/2016/1209/3361536_77ade62d74cd06e9c95881a5aa95c390_1481255166.big.jpg","sex":"男","exp":"7757.00","online_time":"1598406","group_custom":null,"id":"3361536","level":{"level":6,"min_exp":10800,"max":9999999,"exp_speed":2,"album_size":1024,"favorite_num":100,"wage":600,"ticket":15},"create_time_str":"15小时前","likeState":0,"likeCount":0,"reply":[]}]
                 */

                private String commentCount;
                private List<CommentListBean> commentList;

                public String getCommentCount() {
                    return commentCount;
                }

                public void setCommentCount(String commentCount) {
                    this.commentCount = commentCount;
                }

                public List<CommentListBean> getCommentList() {
                    return commentList;
                }

                public void setCommentList(List<CommentListBean> commentList) {
                    this.commentList = commentList;
                }

                public static class CommentListBean {
                    /**
                     * cate : 5
                     * color : null
                     * is_lock : 0
                     * comment_from : u17
                     * ip : 183.240.200.*
                     * comment_id : 8618899
                     * user_id : 26701
                     * content : 从刚毕业，再到各地奔波，再到结婚生子，从网上搜乱七八糟的会员号，到一不小心一买又是一整年的VIP，是剧情吸引了我。有时候真的把作者按在地下问：你这家伙怎么就把进度拖得这么慢！！！有时也会想想，作者工作室不知道花了几十个小时才更新一集漫画，而我们也就花了两三分钟细味其一二，总而言之，新款啦！也没忘丢三张月票，想想都三十有多都支持你！生活共勉吧！开心就好！
                     * create_time : 1541920801
                     * floor : 45492
                     * is_delete : 0
                     * is_up : 1
                     * total_reply : 5
                     * content_filter : 从刚毕业，再到各地奔波，再到结婚生子，从网上搜乱七八糟的会员号，到一不小心一买又是一整年的VIP，是剧情吸引了我。有时候真的把作者按在地下问：你这家伙怎么就把进度拖得这么慢！！！有时也会想想，作者工作室不知道花了几十个小时才更新一集漫画，而我们也就花了两三分钟细味其一二，总而言之，新款啦！也没忘丢三张月票，想想都三十有多都支持你！生活共勉吧！开心就好！
                     * imageList : []
                     * vip_exp : 10670
                     * face_type : 0
                     * title : 0
                     * nickname : BIBU
                     * group_user : 1
                     * group_admin : 0
                     * group_author : 0
                     * face : http://k.avatar.u17i.com/2010/0406/26701_90a73d2023d4cbf8ed7f19b0e2b9a40f_1270525420.big.gif
                     * sex : 男
                     * exp : 2246.00
                     * online_time : 530594
                     * group_custom : null
                     * id : 26701
                     * level : {"level":5,"min_exp":6000,"max":10799,"exp_speed":1.7,"album_size":700,"favorite_num":80,"wage":500,"ticket":15}
                     * create_time_str : 6月前
                     * likeState : 0
                     * likeCount : 0
                     * reply : [{"parent_id":"8618899","color":null,"is_lock":"0","comment_from":"u17","ip":"106.61.15.*","comment_id":"8928638","user_id":"14432766","content":"<a href=\"http://i.u17.com/29022913\" target=\"_blank\">@漫友85127428<\/a>&nbsp;:&nbsp;","create_time":"1557810105","floor":"5","is_delete":"0","content_filter":" : ","imageList":[],"vip_exp":"0","face_type":"0","title":"0","nickname":"漫友86281646","group_user":"0","group_admin":"0","group_author":"0","face":"http://k.avatar.u17i.com/2016/0424/14432766_8af6d556161f6e7ca34ff1a3c06d2ac2_1461450405.big.jpg","sex":"男","exp":"0.00","online_time":"0","group_custom":"","id":"14432766","level":{"level":1,"min_exp":0,"max":599,"exp_speed":1.1,"album_size":50,"favorite_num":30,"wage":200,"ticket":13},"create_time_str":"1周前","likeState":0,"likeCount":0},{"parent_id":"8618899","color":null,"is_lock":"0","comment_from":"u17","ip":"106.61.15.*","comment_id":"8928637","user_id":"14432766","content":"<a href=\"http://i.u17.com/28949933\" target=\"_blank\">@有几个在用<\/a>&nbsp;:&nbsp;","create_time":"1557810087","floor":"4","is_delete":"0","content_filter":" : ","imageList":[],"vip_exp":"0","face_type":"0","title":"0","nickname":"漫友86281646","group_user":"0","group_admin":"0","group_author":"0","face":"http://k.avatar.u17i.com/2016/0424/14432766_8af6d556161f6e7ca34ff1a3c06d2ac2_1461450405.big.jpg","sex":"男","exp":"0.00","online_time":"0","group_custom":"","id":"14432766","level":{"level":1,"min_exp":0,"max":599,"exp_speed":1.1,"album_size":50,"favorite_num":30,"wage":200,"ticket":13},"create_time_str":"1周前","likeState":0,"likeCount":0}]
                     */

                    private String cate;
                    private Object color;
                    private String is_lock;
                    private String comment_from;
                    private String ip;
                    private String comment_id;
                    private String user_id;
                    private String content;
                    private String create_time;
                    private String floor;
                    private String is_delete;
                    private String is_up;
                    private String total_reply;
                    private String content_filter;
                    private String vip_exp;
                    private String face_type;
                    private String title;
                    private String nickname;
                    private String group_user;
                    private String group_admin;
                    private String group_author;
                    private String face;
                    private String sex;
                    private String exp;
                    private String online_time;
                    private Object group_custom;
                    private String id;
                    private LevelBean level;
                    private String create_time_str;
                    private int likeState;
                    private int likeCount;
                    private List<?> imageList;
                    private List<ReplyBean> reply;

                    public String getCate() {
                        return cate;
                    }

                    public void setCate(String cate) {
                        this.cate = cate;
                    }

                    public Object getColor() {
                        return color;
                    }

                    public void setColor(Object color) {
                        this.color = color;
                    }

                    public String getIs_lock() {
                        return is_lock;
                    }

                    public void setIs_lock(String is_lock) {
                        this.is_lock = is_lock;
                    }

                    public String getComment_from() {
                        return comment_from;
                    }

                    public void setComment_from(String comment_from) {
                        this.comment_from = comment_from;
                    }

                    public String getIp() {
                        return ip;
                    }

                    public void setIp(String ip) {
                        this.ip = ip;
                    }

                    public String getComment_id() {
                        return comment_id;
                    }

                    public void setComment_id(String comment_id) {
                        this.comment_id = comment_id;
                    }

                    public String getUser_id() {
                        return user_id;
                    }

                    public void setUser_id(String user_id) {
                        this.user_id = user_id;
                    }

                    public String getContent() {
                        return content;
                    }

                    public void setContent(String content) {
                        this.content = content;
                    }

                    public String getCreate_time() {
                        return create_time;
                    }

                    public void setCreate_time(String create_time) {
                        this.create_time = create_time;
                    }

                    public String getFloor() {
                        return floor;
                    }

                    public void setFloor(String floor) {
                        this.floor = floor;
                    }

                    public String getIs_delete() {
                        return is_delete;
                    }

                    public void setIs_delete(String is_delete) {
                        this.is_delete = is_delete;
                    }

                    public String getIs_up() {
                        return is_up;
                    }

                    public void setIs_up(String is_up) {
                        this.is_up = is_up;
                    }

                    public String getTotal_reply() {
                        return total_reply;
                    }

                    public void setTotal_reply(String total_reply) {
                        this.total_reply = total_reply;
                    }

                    public String getContent_filter() {
                        return content_filter;
                    }

                    public void setContent_filter(String content_filter) {
                        this.content_filter = content_filter;
                    }

                    public String getVip_exp() {
                        return vip_exp;
                    }

                    public void setVip_exp(String vip_exp) {
                        this.vip_exp = vip_exp;
                    }

                    public String getFace_type() {
                        return face_type;
                    }

                    public void setFace_type(String face_type) {
                        this.face_type = face_type;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getNickname() {
                        return nickname;
                    }

                    public void setNickname(String nickname) {
                        this.nickname = nickname;
                    }

                    public String getGroup_user() {
                        return group_user;
                    }

                    public void setGroup_user(String group_user) {
                        this.group_user = group_user;
                    }

                    public String getGroup_admin() {
                        return group_admin;
                    }

                    public void setGroup_admin(String group_admin) {
                        this.group_admin = group_admin;
                    }

                    public String getGroup_author() {
                        return group_author;
                    }

                    public void setGroup_author(String group_author) {
                        this.group_author = group_author;
                    }

                    public String getFace() {
                        return face;
                    }

                    public void setFace(String face) {
                        this.face = face;
                    }

                    public String getSex() {
                        return sex;
                    }

                    public void setSex(String sex) {
                        this.sex = sex;
                    }

                    public String getExp() {
                        return exp;
                    }

                    public void setExp(String exp) {
                        this.exp = exp;
                    }

                    public String getOnline_time() {
                        return online_time;
                    }

                    public void setOnline_time(String online_time) {
                        this.online_time = online_time;
                    }

                    public Object getGroup_custom() {
                        return group_custom;
                    }

                    public void setGroup_custom(Object group_custom) {
                        this.group_custom = group_custom;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public LevelBean getLevel() {
                        return level;
                    }

                    public void setLevel(LevelBean level) {
                        this.level = level;
                    }

                    public String getCreate_time_str() {
                        return create_time_str;
                    }

                    public void setCreate_time_str(String create_time_str) {
                        this.create_time_str = create_time_str;
                    }

                    public int getLikeState() {
                        return likeState;
                    }

                    public void setLikeState(int likeState) {
                        this.likeState = likeState;
                    }

                    public int getLikeCount() {
                        return likeCount;
                    }

                    public void setLikeCount(int likeCount) {
                        this.likeCount = likeCount;
                    }

                    public List<?> getImageList() {
                        return imageList;
                    }

                    public void setImageList(List<?> imageList) {
                        this.imageList = imageList;
                    }

                    public List<ReplyBean> getReply() {
                        return reply;
                    }

                    public void setReply(List<ReplyBean> reply) {
                        this.reply = reply;
                    }

                    public static class LevelBean {
                        /**
                         * level : 5
                         * min_exp : 6000
                         * max : 10799
                         * exp_speed : 1.7
                         * album_size : 700
                         * favorite_num : 80
                         * wage : 500
                         * ticket : 15
                         */

                        private int level;
                        private int min_exp;
                        private int max;
                        private double exp_speed;
                        private int album_size;
                        private int favorite_num;
                        private int wage;
                        private int ticket;

                        public int getLevel() {
                            return level;
                        }

                        public void setLevel(int level) {
                            this.level = level;
                        }

                        public int getMin_exp() {
                            return min_exp;
                        }

                        public void setMin_exp(int min_exp) {
                            this.min_exp = min_exp;
                        }

                        public int getMax() {
                            return max;
                        }

                        public void setMax(int max) {
                            this.max = max;
                        }

                        public double getExp_speed() {
                            return exp_speed;
                        }

                        public void setExp_speed(double exp_speed) {
                            this.exp_speed = exp_speed;
                        }

                        public int getAlbum_size() {
                            return album_size;
                        }

                        public void setAlbum_size(int album_size) {
                            this.album_size = album_size;
                        }

                        public int getFavorite_num() {
                            return favorite_num;
                        }

                        public void setFavorite_num(int favorite_num) {
                            this.favorite_num = favorite_num;
                        }

                        public int getWage() {
                            return wage;
                        }

                        public void setWage(int wage) {
                            this.wage = wage;
                        }

                        public int getTicket() {
                            return ticket;
                        }

                        public void setTicket(int ticket) {
                            this.ticket = ticket;
                        }
                    }

                    public static class ReplyBean {
                        /**
                         * parent_id : 8618899
                         * color : null
                         * is_lock : 0
                         * comment_from : u17
                         * ip : 106.61.15.*
                         * comment_id : 8928638
                         * user_id : 14432766
                         * content : <a href="http://i.u17.com/29022913" target="_blank">@漫友85127428</a>&nbsp;:&nbsp;
                         * create_time : 1557810105
                         * floor : 5
                         * is_delete : 0
                         * content_filter :  :
                         * imageList : []
                         * vip_exp : 0
                         * face_type : 0
                         * title : 0
                         * nickname : 漫友86281646
                         * group_user : 0
                         * group_admin : 0
                         * group_author : 0
                         * face : http://k.avatar.u17i.com/2016/0424/14432766_8af6d556161f6e7ca34ff1a3c06d2ac2_1461450405.big.jpg
                         * sex : 男
                         * exp : 0.00
                         * online_time : 0
                         * group_custom :
                         * id : 14432766
                         * level : {"level":1,"min_exp":0,"max":599,"exp_speed":1.1,"album_size":50,"favorite_num":30,"wage":200,"ticket":13}
                         * create_time_str : 1周前
                         * likeState : 0
                         * likeCount : 0
                         */

                        private String parent_id;
                        private Object color;
                        private String is_lock;
                        private String comment_from;
                        private String ip;
                        private String comment_id;
                        private String user_id;
                        private String content;
                        private String create_time;
                        private String floor;
                        private String is_delete;
                        private String content_filter;
                        private String vip_exp;
                        private String face_type;
                        private String title;
                        private String nickname;
                        private String group_user;
                        private String group_admin;
                        private String group_author;
                        private String face;
                        private String sex;
                        private String exp;
                        private String online_time;
                        private String group_custom;
                        private String id;
                        private LevelBeanX level;
                        private String create_time_str;
                        private int likeState;
                        private int likeCount;
                        private List<?> imageList;

                        public String getParent_id() {
                            return parent_id;
                        }

                        public void setParent_id(String parent_id) {
                            this.parent_id = parent_id;
                        }

                        public Object getColor() {
                            return color;
                        }

                        public void setColor(Object color) {
                            this.color = color;
                        }

                        public String getIs_lock() {
                            return is_lock;
                        }

                        public void setIs_lock(String is_lock) {
                            this.is_lock = is_lock;
                        }

                        public String getComment_from() {
                            return comment_from;
                        }

                        public void setComment_from(String comment_from) {
                            this.comment_from = comment_from;
                        }

                        public String getIp() {
                            return ip;
                        }

                        public void setIp(String ip) {
                            this.ip = ip;
                        }

                        public String getComment_id() {
                            return comment_id;
                        }

                        public void setComment_id(String comment_id) {
                            this.comment_id = comment_id;
                        }

                        public String getUser_id() {
                            return user_id;
                        }

                        public void setUser_id(String user_id) {
                            this.user_id = user_id;
                        }

                        public String getContent() {
                            return content;
                        }

                        public void setContent(String content) {
                            this.content = content;
                        }

                        public String getCreate_time() {
                            return create_time;
                        }

                        public void setCreate_time(String create_time) {
                            this.create_time = create_time;
                        }

                        public String getFloor() {
                            return floor;
                        }

                        public void setFloor(String floor) {
                            this.floor = floor;
                        }

                        public String getIs_delete() {
                            return is_delete;
                        }

                        public void setIs_delete(String is_delete) {
                            this.is_delete = is_delete;
                        }

                        public String getContent_filter() {
                            return content_filter;
                        }

                        public void setContent_filter(String content_filter) {
                            this.content_filter = content_filter;
                        }

                        public String getVip_exp() {
                            return vip_exp;
                        }

                        public void setVip_exp(String vip_exp) {
                            this.vip_exp = vip_exp;
                        }

                        public String getFace_type() {
                            return face_type;
                        }

                        public void setFace_type(String face_type) {
                            this.face_type = face_type;
                        }

                        public String getTitle() {
                            return title;
                        }

                        public void setTitle(String title) {
                            this.title = title;
                        }

                        public String getNickname() {
                            return nickname;
                        }

                        public void setNickname(String nickname) {
                            this.nickname = nickname;
                        }

                        public String getGroup_user() {
                            return group_user;
                        }

                        public void setGroup_user(String group_user) {
                            this.group_user = group_user;
                        }

                        public String getGroup_admin() {
                            return group_admin;
                        }

                        public void setGroup_admin(String group_admin) {
                            this.group_admin = group_admin;
                        }

                        public String getGroup_author() {
                            return group_author;
                        }

                        public void setGroup_author(String group_author) {
                            this.group_author = group_author;
                        }

                        public String getFace() {
                            return face;
                        }

                        public void setFace(String face) {
                            this.face = face;
                        }

                        public String getSex() {
                            return sex;
                        }

                        public void setSex(String sex) {
                            this.sex = sex;
                        }

                        public String getExp() {
                            return exp;
                        }

                        public void setExp(String exp) {
                            this.exp = exp;
                        }

                        public String getOnline_time() {
                            return online_time;
                        }

                        public void setOnline_time(String online_time) {
                            this.online_time = online_time;
                        }

                        public String getGroup_custom() {
                            return group_custom;
                        }

                        public void setGroup_custom(String group_custom) {
                            this.group_custom = group_custom;
                        }

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }

                        public LevelBeanX getLevel() {
                            return level;
                        }

                        public void setLevel(LevelBeanX level) {
                            this.level = level;
                        }

                        public String getCreate_time_str() {
                            return create_time_str;
                        }

                        public void setCreate_time_str(String create_time_str) {
                            this.create_time_str = create_time_str;
                        }

                        public int getLikeState() {
                            return likeState;
                        }

                        public void setLikeState(int likeState) {
                            this.likeState = likeState;
                        }

                        public int getLikeCount() {
                            return likeCount;
                        }

                        public void setLikeCount(int likeCount) {
                            this.likeCount = likeCount;
                        }

                        public List<?> getImageList() {
                            return imageList;
                        }

                        public void setImageList(List<?> imageList) {
                            this.imageList = imageList;
                        }

                        public static class LevelBeanX {
                            /**
                             * level : 1
                             * min_exp : 0
                             * max : 599
                             * exp_speed : 1.1
                             * album_size : 50
                             * favorite_num : 30
                             * wage : 200
                             * ticket : 13
                             */

                            private int level;
                            private int min_exp;
                            private int max;
                            private double exp_speed;
                            private int album_size;
                            private int favorite_num;
                            private int wage;
                            private int ticket;

                            public int getLevel() {
                                return level;
                            }

                            public void setLevel(int level) {
                                this.level = level;
                            }

                            public int getMin_exp() {
                                return min_exp;
                            }

                            public void setMin_exp(int min_exp) {
                                this.min_exp = min_exp;
                            }

                            public int getMax() {
                                return max;
                            }

                            public void setMax(int max) {
                                this.max = max;
                            }

                            public double getExp_speed() {
                                return exp_speed;
                            }

                            public void setExp_speed(double exp_speed) {
                                this.exp_speed = exp_speed;
                            }

                            public int getAlbum_size() {
                                return album_size;
                            }

                            public void setAlbum_size(int album_size) {
                                this.album_size = album_size;
                            }

                            public int getFavorite_num() {
                                return favorite_num;
                            }

                            public void setFavorite_num(int favorite_num) {
                                this.favorite_num = favorite_num;
                            }

                            public int getWage() {
                                return wage;
                            }

                            public void setWage(int wage) {
                                this.wage = wage;
                            }

                            public int getTicket() {
                                return ticket;
                            }

                            public void setTicket(int ticket) {
                                this.ticket = ticket;
                            }
                        }
                    }
                }
            }

            public static class LastReadBean {
                /**
                 * page : 0
                 * chapter_id : 31066
                 * update_time : 1557756835
                 * create_time : 1557628548
                 */

                private int page;
                private String chapter_id;
                private String update_time;
                private String create_time;

                public int getPage() {
                    return page;
                }

                public void setPage(int page) {
                    this.page = page;
                }

                public String getChapter_id() {
                    return chapter_id;
                }

                public void setChapter_id(String chapter_id) {
                    this.chapter_id = chapter_id;
                }

                public String getUpdate_time() {
                    return update_time;
                }

                public void setUpdate_time(String update_time) {
                    this.update_time = update_time;
                }

                public String getCreate_time() {
                    return create_time;
                }

                public void setCreate_time(String create_time) {
                    this.create_time = create_time;
                }
            }

            public static class ChapterListBean {
                /**
                 * vip_images : 0
                 * chapter_id : 31066
                 * is_view : 1
                 * buyed : 0
                 * buy_price : 0
                 * is_download : 1
                 * read_state : 1
                 */

                private String vip_images;
                private String chapter_id;
                private int is_view;
                private String buyed;
                private String buy_price;
                private int is_download;
                private int read_state;

                public String getVip_images() {
                    return vip_images;
                }

                public void setVip_images(String vip_images) {
                    this.vip_images = vip_images;
                }

                public String getChapter_id() {
                    return chapter_id;
                }

                public void setChapter_id(String chapter_id) {
                    this.chapter_id = chapter_id;
                }

                public int getIs_view() {
                    return is_view;
                }

                public void setIs_view(int is_view) {
                    this.is_view = is_view;
                }

                public String getBuyed() {
                    return buyed;
                }

                public void setBuyed(String buyed) {
                    this.buyed = buyed;
                }

                public String getBuy_price() {
                    return buy_price;
                }

                public void setBuy_price(String buy_price) {
                    this.buy_price = buy_price;
                }

                public int getIs_download() {
                    return is_download;
                }

                public void setIs_download(int is_download) {
                    this.is_download = is_download;
                }

                public int getRead_state() {
                    return read_state;
                }

                public void setRead_state(int read_state) {
                    this.read_state = read_state;
                }
            }
        }
    }
}
