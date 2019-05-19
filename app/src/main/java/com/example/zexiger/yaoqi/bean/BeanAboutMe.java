package com.example.zexiger.yaoqi.bean;

public class BeanAboutMe {

    /**
     * code : 1
     * data : {"stateCode":1,"message":"登录成功!","returnData":{"key":"75b7512b09942f9b2955f1a9a7e3738034fd66ed95f6967319d1c4efb61752be7b567c263eb85269b6fc8c75c30fbb220f3632f01983b5eaccfab8ee90af8b0afa6fbfdbdb479aa3bec1878586fdba66310db8a5c5f05c75f28f87f047a5d67c1dac1327bd0deaf57eab17ba108908134d73a1ac30e232dd:::open","user":{"nickname":"漫友58849284","user_id":29913771,"username":"15777470522.mobile","canNicknameEdit":true,"site":"mobile_a_phone","other_user_id":0,"group_user":0,"group_admin":0,"group_author":0,"face":"http://static.u17i.com/common/images/face/default.big.gif","ticket":0,"coin":0,"level":0,"vip_level":0,"vip_type":0,"vip_end_time":0,"email":"","bound_email":0,"year_pay":0,"gender":"保密","phoneNumber":"15777470522","client_sign":0,"vip_exp":0,"exp":0,"exp_cpl":0,"vip_exp_cpl":0,"sexType":3,"likeCate":"","isFavRed":0,"score":0,"out_ad_open":false,"master_device":0,"short_description":"恭喜小主已经来到有妖气12天","isAuthor":0,"is_up_pwd":true,"birthday":"0000-00-00","is_modify_info":0,"sign_type":0,"vip_status":0,"reading_ticket":1,"dis_total":1,"share":0},"user_last_read":{"comicId":93661,"chapterId":399277,"comicName":"神之一脚","chapterName":"第一波 踏上绿茵场吧，翔！"}}}
     */

    //15280657062

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
         * message : 登录成功!
         * returnData : {"key":"75b7512b09942f9b2955f1a9a7e3738034fd66ed95f6967319d1c4efb61752be7b567c263eb85269b6fc8c75c30fbb220f3632f01983b5eaccfab8ee90af8b0afa6fbfdbdb479aa3bec1878586fdba66310db8a5c5f05c75f28f87f047a5d67c1dac1327bd0deaf57eab17ba108908134d73a1ac30e232dd:::open","user":{"nickname":"漫友58849284","user_id":29913771,"username":"15777470522.mobile","canNicknameEdit":true,"site":"mobile_a_phone","other_user_id":0,"group_user":0,"group_admin":0,"group_author":0,"face":"http://static.u17i.com/common/images/face/default.big.gif","ticket":0,"coin":0,"level":0,"vip_level":0,"vip_type":0,"vip_end_time":0,"email":"","bound_email":0,"year_pay":0,"gender":"保密","phoneNumber":"15777470522","client_sign":0,"vip_exp":0,"exp":0,"exp_cpl":0,"vip_exp_cpl":0,"sexType":3,"likeCate":"","isFavRed":0,"score":0,"out_ad_open":false,"master_device":0,"short_description":"恭喜小主已经来到有妖气12天","isAuthor":0,"is_up_pwd":true,"birthday":"0000-00-00","is_modify_info":0,"sign_type":0,"vip_status":0,"reading_ticket":1,"dis_total":1,"share":0},"user_last_read":{"comicId":93661,"chapterId":399277,"comicName":"神之一脚","chapterName":"第一波 踏上绿茵场吧，翔！"}}
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
             * key : 75b7512b09942f9b2955f1a9a7e3738034fd66ed95f6967319d1c4efb61752be7b567c263eb85269b6fc8c75c30fbb220f3632f01983b5eaccfab8ee90af8b0afa6fbfdbdb479aa3bec1878586fdba66310db8a5c5f05c75f28f87f047a5d67c1dac1327bd0deaf57eab17ba108908134d73a1ac30e232dd:::open
             * user : {"nickname":"漫友58849284","user_id":29913771,"username":"15777470522.mobile","canNicknameEdit":true,"site":"mobile_a_phone","other_user_id":0,"group_user":0,"group_admin":0,"group_author":0,"face":"http://static.u17i.com/common/images/face/default.big.gif","ticket":0,"coin":0,"level":0,"vip_level":0,"vip_type":0,"vip_end_time":0,"email":"","bound_email":0,"year_pay":0,"gender":"保密","phoneNumber":"15777470522","client_sign":0,"vip_exp":0,"exp":0,"exp_cpl":0,"vip_exp_cpl":0,"sexType":3,"likeCate":"","isFavRed":0,"score":0,"out_ad_open":false,"master_device":0,"short_description":"恭喜小主已经来到有妖气12天","isAuthor":0,"is_up_pwd":true,"birthday":"0000-00-00","is_modify_info":0,"sign_type":0,"vip_status":0,"reading_ticket":1,"dis_total":1,"share":0}
             * user_last_read : {"comicId":93661,"chapterId":399277,"comicName":"神之一脚","chapterName":"第一波 踏上绿茵场吧，翔！"}
             */

            private String key;
            private UserBean user;
            private UserLastReadBean user_last_read;

            public String getKey() {
                return key;
            }

            public void setKey(String key) {
                this.key = key;
            }

            public UserBean getUser() {
                return user;
            }

            public void setUser(UserBean user) {
                this.user = user;
            }

            public UserLastReadBean getUser_last_read() {
                return user_last_read;
            }

            public void setUser_last_read(UserLastReadBean user_last_read) {
                this.user_last_read = user_last_read;
            }

            public static class UserBean {
                /**
                 * nickname : 漫友58849284
                 * user_id : 29913771
                 * username : 15777470522.mobile
                 * canNicknameEdit : true
                 * site : mobile_a_phone
                 * other_user_id : 0
                 * group_user : 0
                 * group_admin : 0
                 * group_author : 0
                 * face : http://static.u17i.com/common/images/face/default.big.gif
                 * ticket : 0
                 * coin : 0
                 * level : 0
                 * vip_level : 0
                 * vip_type : 0
                 * vip_end_time : 0
                 * email :
                 * bound_email : 0
                 * year_pay : 0
                 * gender : 保密
                 * phoneNumber : 15777470522
                 * client_sign : 0
                 * vip_exp : 0
                 * exp : 0
                 * exp_cpl : 0
                 * vip_exp_cpl : 0
                 * sexType : 3
                 * likeCate :
                 * isFavRed : 0
                 * score : 0
                 * out_ad_open : false
                 * master_device : 0
                 * short_description : 恭喜小主已经来到有妖气12天
                 * isAuthor : 0
                 * is_up_pwd : true
                 * birthday : 0000-00-00
                 * is_modify_info : 0
                 * sign_type : 0
                 * vip_status : 0
                 * reading_ticket : 1
                 * dis_total : 1
                 * share : 0
                 */

                private String nickname;
                private int user_id;
                private String username;
                private boolean canNicknameEdit;
                private String site;
                private int other_user_id;
                private int group_user;
                private int group_admin;
                private int group_author;
                private String face;
                private int ticket;
                private int coin;
                private int level;
                private int vip_level;
                private int vip_type;
                private int vip_end_time;
                private String email;
                private int bound_email;
                private int year_pay;
                private String gender;
                private String phoneNumber;
                private int client_sign;
                private int vip_exp;
                private int exp;
                private int exp_cpl;
                private int vip_exp_cpl;
                private int sexType;
                private String likeCate;
                private int isFavRed;
                private int score;
                private boolean out_ad_open;
                private int master_device;
                private String short_description;
                private int isAuthor;
                private boolean is_up_pwd;
                private String birthday;
                private int is_modify_info;
                private int sign_type;
                private int vip_status;
                private int reading_ticket;
                private int dis_total;
                private int share;

                public String getNickname() {
                    return nickname;
                }

                public void setNickname(String nickname) {
                    this.nickname = nickname;
                }

                public int getUser_id() {
                    return user_id;
                }

                public void setUser_id(int user_id) {
                    this.user_id = user_id;
                }

                public String getUsername() {
                    return username;
                }

                public void setUsername(String username) {
                    this.username = username;
                }

                public boolean isCanNicknameEdit() {
                    return canNicknameEdit;
                }

                public void setCanNicknameEdit(boolean canNicknameEdit) {
                    this.canNicknameEdit = canNicknameEdit;
                }

                public String getSite() {
                    return site;
                }

                public void setSite(String site) {
                    this.site = site;
                }

                public int getOther_user_id() {
                    return other_user_id;
                }

                public void setOther_user_id(int other_user_id) {
                    this.other_user_id = other_user_id;
                }

                public int getGroup_user() {
                    return group_user;
                }

                public void setGroup_user(int group_user) {
                    this.group_user = group_user;
                }

                public int getGroup_admin() {
                    return group_admin;
                }

                public void setGroup_admin(int group_admin) {
                    this.group_admin = group_admin;
                }

                public int getGroup_author() {
                    return group_author;
                }

                public void setGroup_author(int group_author) {
                    this.group_author = group_author;
                }

                public String getFace() {
                    return face;
                }

                public void setFace(String face) {
                    this.face = face;
                }

                public int getTicket() {
                    return ticket;
                }

                public void setTicket(int ticket) {
                    this.ticket = ticket;
                }

                public int getCoin() {
                    return coin;
                }

                public void setCoin(int coin) {
                    this.coin = coin;
                }

                public int getLevel() {
                    return level;
                }

                public void setLevel(int level) {
                    this.level = level;
                }

                public int getVip_level() {
                    return vip_level;
                }

                public void setVip_level(int vip_level) {
                    this.vip_level = vip_level;
                }

                public int getVip_type() {
                    return vip_type;
                }

                public void setVip_type(int vip_type) {
                    this.vip_type = vip_type;
                }

                public int getVip_end_time() {
                    return vip_end_time;
                }

                public void setVip_end_time(int vip_end_time) {
                    this.vip_end_time = vip_end_time;
                }

                public String getEmail() {
                    return email;
                }

                public void setEmail(String email) {
                    this.email = email;
                }

                public int getBound_email() {
                    return bound_email;
                }

                public void setBound_email(int bound_email) {
                    this.bound_email = bound_email;
                }

                public int getYear_pay() {
                    return year_pay;
                }

                public void setYear_pay(int year_pay) {
                    this.year_pay = year_pay;
                }

                public String getGender() {
                    return gender;
                }

                public void setGender(String gender) {
                    this.gender = gender;
                }

                public String getPhoneNumber() {
                    return phoneNumber;
                }

                public void setPhoneNumber(String phoneNumber) {
                    this.phoneNumber = phoneNumber;
                }

                public int getClient_sign() {
                    return client_sign;
                }

                public void setClient_sign(int client_sign) {
                    this.client_sign = client_sign;
                }

                public int getVip_exp() {
                    return vip_exp;
                }

                public void setVip_exp(int vip_exp) {
                    this.vip_exp = vip_exp;
                }

                public int getExp() {
                    return exp;
                }

                public void setExp(int exp) {
                    this.exp = exp;
                }

                public int getExp_cpl() {
                    return exp_cpl;
                }

                public void setExp_cpl(int exp_cpl) {
                    this.exp_cpl = exp_cpl;
                }

                public int getVip_exp_cpl() {
                    return vip_exp_cpl;
                }

                public void setVip_exp_cpl(int vip_exp_cpl) {
                    this.vip_exp_cpl = vip_exp_cpl;
                }

                public int getSexType() {
                    return sexType;
                }

                public void setSexType(int sexType) {
                    this.sexType = sexType;
                }

                public String getLikeCate() {
                    return likeCate;
                }

                public void setLikeCate(String likeCate) {
                    this.likeCate = likeCate;
                }

                public int getIsFavRed() {
                    return isFavRed;
                }

                public void setIsFavRed(int isFavRed) {
                    this.isFavRed = isFavRed;
                }

                public int getScore() {
                    return score;
                }

                public void setScore(int score) {
                    this.score = score;
                }

                public boolean isOut_ad_open() {
                    return out_ad_open;
                }

                public void setOut_ad_open(boolean out_ad_open) {
                    this.out_ad_open = out_ad_open;
                }

                public int getMaster_device() {
                    return master_device;
                }

                public void setMaster_device(int master_device) {
                    this.master_device = master_device;
                }

                public String getShort_description() {
                    return short_description;
                }

                public void setShort_description(String short_description) {
                    this.short_description = short_description;
                }

                public int getIsAuthor() {
                    return isAuthor;
                }

                public void setIsAuthor(int isAuthor) {
                    this.isAuthor = isAuthor;
                }

                public boolean isIs_up_pwd() {
                    return is_up_pwd;
                }

                public void setIs_up_pwd(boolean is_up_pwd) {
                    this.is_up_pwd = is_up_pwd;
                }

                public String getBirthday() {
                    return birthday;
                }

                public void setBirthday(String birthday) {
                    this.birthday = birthday;
                }

                public int getIs_modify_info() {
                    return is_modify_info;
                }

                public void setIs_modify_info(int is_modify_info) {
                    this.is_modify_info = is_modify_info;
                }

                public int getSign_type() {
                    return sign_type;
                }

                public void setSign_type(int sign_type) {
                    this.sign_type = sign_type;
                }

                public int getVip_status() {
                    return vip_status;
                }

                public void setVip_status(int vip_status) {
                    this.vip_status = vip_status;
                }

                public int getReading_ticket() {
                    return reading_ticket;
                }

                public void setReading_ticket(int reading_ticket) {
                    this.reading_ticket = reading_ticket;
                }

                public int getDis_total() {
                    return dis_total;
                }

                public void setDis_total(int dis_total) {
                    this.dis_total = dis_total;
                }

                public int getShare() {
                    return share;
                }

                public void setShare(int share) {
                    this.share = share;
                }
            }

            public static class UserLastReadBean {
                /**
                 * comicId : 93661
                 * chapterId : 399277
                 * comicName : 神之一脚
                 * chapterName : 第一波 踏上绿茵场吧，翔！
                 */

                private int comicId;
                private int chapterId;
                private String comicName;
                private String chapterName;

                public int getComicId() {
                    return comicId;
                }

                public void setComicId(int comicId) {
                    this.comicId = comicId;
                }

                public int getChapterId() {
                    return chapterId;
                }

                public void setChapterId(int chapterId) {
                    this.chapterId = chapterId;
                }

                public String getComicName() {
                    return comicName;
                }

                public void setComicName(String comicName) {
                    this.comicName = comicName;
                }

                public String getChapterName() {
                    return chapterName;
                }

                public void setChapterName(String chapterName) {
                    this.chapterName = chapterName;
                }
            }
        }
    }
}
