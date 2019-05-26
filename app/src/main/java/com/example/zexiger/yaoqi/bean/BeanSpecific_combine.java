package com.example.zexiger.yaoqi.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.List;

//http://app.u17.com/v3/appV3_3/android/phone/comic/detail_static_new?come_from=lenovo&comicid=8805&serialNumber=3089dfb0&v=4500102&model=ZUK+Z2121&android_id=8e8c4ff5b6235ce9HTTP/1.1
public class BeanSpecific_combine {

    //漫画的信息，不含月票
    //静态

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
            private EmotionBean emotion;
            private List<ChapterListBean> chapter_list;
            private List<OtherWorksBean> otherWorks;
            private List<CommentListBean> commentList;

            public ComicBean getComic() {
                return comic;
            }

            public void setComic(ComicBean comic) {
                this.comic = comic;
            }

            public EmotionBean getEmotion() {
                return emotion;
            }

            public void setEmotion(EmotionBean emotion) {
                this.emotion = emotion;
            }

            public List<ChapterListBean> getChapter_list() {
                return chapter_list;
            }

            public void setChapter_list(List<ChapterListBean> chapter_list) {
                this.chapter_list = chapter_list;
            }

            public List<OtherWorksBean> getOtherWorks() {
                return otherWorks;
            }

            public void setOtherWorks(List<OtherWorksBean> otherWorks) {
                this.otherWorks = otherWorks;
            }

            public List<CommentListBean> getCommentList() {
                return commentList;
            }

            public void setCommentList(List<CommentListBean> commentList) {
                this.commentList = commentList;
            }

            public static class ComicBean {
                private String name;
                private String comic_id;
                private int is_vip;
                private String short_description;
                private int accredit;
                private String type;
                private String description;
                private String cate_id;
                private String thread_id;
                private int series_status;
                private int last_update_time;
                private int status;
                private String week_more;
                private String last_update_week;
                private String wideCover;
                private String cover;
                private String ori;
                private AuthorBean author;
                private String wideColor;
                private String ticket_desc;
                private List<String> theme_ids;
                private List<ClassifyTagsBean> classifyTags;
                private List<String> tagList;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getComic_id() {
                    return comic_id;
                }

                public void setComic_id(String comic_id) {
                    this.comic_id = comic_id;
                }

                public int getIs_vip() {
                    return is_vip;
                }

                public void setIs_vip(int is_vip) {
                    this.is_vip = is_vip;
                }

                public String getShort_description() {
                    return short_description;
                }

                public void setShort_description(String short_description) {
                    this.short_description = short_description;
                }

                public int getAccredit() {
                    return accredit;
                }

                public void setAccredit(int accredit) {
                    this.accredit = accredit;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public String getCate_id() {
                    return cate_id;
                }

                public void setCate_id(String cate_id) {
                    this.cate_id = cate_id;
                }

                public String getThread_id() {
                    return thread_id;
                }

                public void setThread_id(String thread_id) {
                    this.thread_id = thread_id;
                }

                public int getSeries_status() {
                    return series_status;
                }

                public void setSeries_status(int series_status) {
                    this.series_status = series_status;
                }

                public int getLast_update_time() {
                    return last_update_time;
                }

                public void setLast_update_time(int last_update_time) {
                    this.last_update_time = last_update_time;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getWeek_more() {
                    return week_more;
                }

                public void setWeek_more(String week_more) {
                    this.week_more = week_more;
                }

                public String getLast_update_week() {
                    return last_update_week;
                }

                public void setLast_update_week(String last_update_week) {
                    this.last_update_week = last_update_week;
                }

                public String getWideCover() {
                    return wideCover;
                }

                public void setWideCover(String wideCover) {
                    this.wideCover = wideCover;
                }

                public String getCover() {
                    return cover;
                }

                public void setCover(String cover) {
                    this.cover = cover;
                }

                public String getOri() {
                    return ori;
                }

                public void setOri(String ori) {
                    this.ori = ori;
                }

                public AuthorBean getAuthor() {
                    return author;
                }

                public void setAuthor(AuthorBean author) {
                    this.author = author;
                }

                public String getWideColor() {
                    return wideColor;
                }

                public void setWideColor(String wideColor) {
                    this.wideColor = wideColor;
                }

                public String getTicket_desc() {
                    return ticket_desc;
                }

                public void setTicket_desc(String ticket_desc) {
                    this.ticket_desc = ticket_desc;
                }

                public List<String> getTheme_ids() {
                    return theme_ids;
                }

                public void setTheme_ids(List<String> theme_ids) {
                    this.theme_ids = theme_ids;
                }

                public List<ClassifyTagsBean> getClassifyTags() {
                    return classifyTags;
                }

                public void setClassifyTags(List<ClassifyTagsBean> classifyTags) {
                    this.classifyTags = classifyTags;
                }

                public List<String> getTagList() {
                    return tagList;
                }

                public void setTagList(List<String> tagList) {
                    this.tagList = tagList;
                }

                public static class AuthorBean {
                    /**
                     * avatar : http://k.avatar.u17i.com/2013/0331/190368_613e84c72944dee9979f780f6c4cfd8b_1364694763.big.png
                     * name : 黄晓达
                     * id : 190368
                     */

                    private String avatar;
                    private String name;
                    private String id;

                    public String getAvatar() {
                        return avatar;
                    }

                    public void setAvatar(String avatar) {
                        this.avatar = avatar;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }

                public static class ClassifyTagsBean {
                    /**
                     * name : 少年
                     * argName : cate
                     * argVal : 1
                     */

                    private String name;
                    private String argName;
                    private int argVal;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getArgName() {
                        return argName;
                    }

                    public void setArgName(String argName) {
                        this.argName = argName;
                    }

                    public int getArgVal() {
                        return argVal;
                    }

                    public void setArgVal(int argVal) {
                        this.argVal = argVal;
                    }
                }
            }

            public static class EmotionBean {
                /**
                 * emotionUrl : http://k.static.u17i.com/v4/face/8805.zip
                 * emotionVersion : 1
                 */

                private String emotionUrl;
                private int emotionVersion;

                public String getEmotionUrl() {
                    return emotionUrl;
                }

                public void setEmotionUrl(String emotionUrl) {
                    this.emotionUrl = emotionUrl;
                }

                public int getEmotionVersion() {
                    return emotionVersion;
                }

                public void setEmotionVersion(int emotionVersion) {
                    this.emotionVersion = emotionVersion;
                }
            }

            public static class ChapterListBean implements MultiItemEntity {

                //
                private int itemType;
                //样式 1
                public static final int TYPE_1= 1;

                @Override
                public int getItemType() {
                    return itemType;
                }

                public void setItemType(int itemType) {
                    this.itemType = itemType;
                }


                ////////////////////////////////////////////////
                private String name;
                private String image_total;
                private String chapter_id;
                private int type;
                private String size;
                private int pass_time;
                private String release_time;
                private String zip_high_webp;
                private String vip_images;
                private int publish_time;
                private int chapterIndex;
                private String smallPlaceCover;
                private int is_new;
                private boolean has_locked_image;
                private String index;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getImage_total() {
                    return image_total;
                }

                public void setImage_total(String image_total) {
                    this.image_total = image_total;
                }

                public String getChapter_id() {
                    return chapter_id;
                }

                public void setChapter_id(String chapter_id) {
                    this.chapter_id = chapter_id;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getSize() {
                    return size;
                }

                public void setSize(String size) {
                    this.size = size;
                }

                public int getPass_time() {
                    return pass_time;
                }

                public void setPass_time(int pass_time) {
                    this.pass_time = pass_time;
                }

                public String getRelease_time() {
                    return release_time;
                }

                public void setRelease_time(String release_time) {
                    this.release_time = release_time;
                }

                public String getZip_high_webp() {
                    return zip_high_webp;
                }

                public void setZip_high_webp(String zip_high_webp) {
                    this.zip_high_webp = zip_high_webp;
                }

                public String getVip_images() {
                    return vip_images;
                }

                public void setVip_images(String vip_images) {
                    this.vip_images = vip_images;
                }

                public int getPublish_time() {
                    return publish_time;
                }

                public void setPublish_time(int publish_time) {
                    this.publish_time = publish_time;
                }

                public int getChapterIndex() {
                    return chapterIndex;
                }

                public void setChapterIndex(int chapterIndex) {
                    this.chapterIndex = chapterIndex;
                }

                public String getSmallPlaceCover() {
                    return smallPlaceCover;
                }

                public void setSmallPlaceCover(String smallPlaceCover) {
                    this.smallPlaceCover = smallPlaceCover;
                }

                public int getIs_new() {
                    return is_new;
                }

                public void setIs_new(int is_new) {
                    this.is_new = is_new;
                }

                public boolean isHas_locked_image() {
                    return has_locked_image;
                }

                public void setHas_locked_image(boolean has_locked_image) {
                    this.has_locked_image = has_locked_image;
                }

                public String getIndex() {
                    return index;
                }

                public void setIndex(String index) {
                    this.index = index;
                }
            }

            public static class OtherWorksBean {
                /**
                 * comicId : 26505
                 * coverUrl : http://cover.u17i.com/2012/03/190368_1330968634_u5Pm76Zw5pcC.sbig.jpg
                 * name : 虎X鹤 （潮汕话）
                 * passChapterNum : 1
                 */

                private String comicId;
                private String coverUrl;
                private String name;
                private String passChapterNum;

                public String getComicId() {
                    return comicId;
                }

                public void setComicId(String comicId) {
                    this.comicId = comicId;
                }

                public String getCoverUrl() {
                    return coverUrl;
                }

                public void setCoverUrl(String coverUrl) {
                    this.coverUrl = coverUrl;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getPassChapterNum() {
                    return passChapterNum;
                }

                public void setPassChapterNum(String passChapterNum) {
                    this.passChapterNum = passChapterNum;
                }
            }

            public static class CommentListBean {
                /**
                 * praise_total : 173
                 * cate : 0
                 * color : null
                 * is_lock : 0
                 * comment_from : u17
                 * ip : 112.96.179.*
                 * comment_id : 6582371
                 * user_id : 366977
                 * content : 我现在很是不理解现在的读者的脑部构造啊，整天天嫌弃什么“又开始回忆，又开始回忆”。如果作者不把回忆的部分画出来，你知道那个人是谁？你能觉得人物丰满故事完整？我们作为读者应该吐槽的回忆是那种像火影动画里一样回忆一模一样剧情の东西。而不是这种干货有剧情的回忆啊！！！到底是我太较真，还是有妖气的用户年龄真的下降了这么多…[f281]
                 * create_time : 1473213646
                 * floor : 32133
                 * is_delete : 0
                 * is_up : 0
                 * total_reply : 70
                 * is_choice : 0
                 * comic_author : 0
                 * content_filter : 我现在很是不理解现在的读者的脑部构造啊，整天天嫌弃什么“又开始回忆，又开始回忆”。如果作者不把回忆的部分画出来，你知道那个人是谁？你能觉得人物丰满故事完整？我们作为读者应该吐槽的回忆是那种像火影动画里一样回忆一模一样剧情の东西。而不是这种干货有剧情的回忆啊！！！到底是我太较真，还是有妖气的用户年龄真的下降了这么多…[f281]
                 * ticketNum : 0
                 * gift_num : 0
                 * gift_img :
                 * imageList : []
                 * vip_exp : 15835
                 * face_type : 0
                 * title : 0
                 * nickname : 水逐流
                 * group_user : 99
                 * group_admin : 0
                 * group_author : 0
                 * face : http://static.u17i.com/common/images/face/default.big.png
                 * sex : 保密
                 * exp : 1832.80
                 * online_time : 864155
                 * group_custom : null
                 * active_time : 1441984102
                 * is_hidden : 0
                 * id : 366977
                 * level : {"level":6,"min_exp":10800,"max":9999999,"exp_speed":2,"album_size":1024,"favorite_num":100,"wage":600,"ticket":15}
                 * create_time_str : 2年前
                 * likeState : 0
                 * likeCount : 0
                 */

                private String praise_total;
                private String cate;
                private Object color;
                private String is_lock;
                private String comment_from;
                private String ip;
                private String comment_id;
                private int user_id;
                private String content;
                private String create_time;
                private String floor;
                private String is_delete;
                private int is_up;
                private String total_reply;
                private int is_choice;
                private int comic_author;
                private String content_filter;
                private int ticketNum;
                private int gift_num;
                private String gift_img;
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
                private String active_time;
                private String is_hidden;
                private String id;
                private LevelBean level;
                private String create_time_str;
                private int likeState;
                private int likeCount;
                private List<?> imageList;

                public String getPraise_total() {
                    return praise_total;
                }

                public void setPraise_total(String praise_total) {
                    this.praise_total = praise_total;
                }

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

                public int getUser_id() {
                    return user_id;
                }

                public void setUser_id(int user_id) {
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

                public int getIs_up() {
                    return is_up;
                }

                public void setIs_up(int is_up) {
                    this.is_up = is_up;
                }

                public String getTotal_reply() {
                    return total_reply;
                }

                public void setTotal_reply(String total_reply) {
                    this.total_reply = total_reply;
                }

                public int getIs_choice() {
                    return is_choice;
                }

                public void setIs_choice(int is_choice) {
                    this.is_choice = is_choice;
                }

                public int getComic_author() {
                    return comic_author;
                }

                public void setComic_author(int comic_author) {
                    this.comic_author = comic_author;
                }

                public String getContent_filter() {
                    return content_filter;
                }

                public void setContent_filter(String content_filter) {
                    this.content_filter = content_filter;
                }

                public int getTicketNum() {
                    return ticketNum;
                }

                public void setTicketNum(int ticketNum) {
                    this.ticketNum = ticketNum;
                }

                public int getGift_num() {
                    return gift_num;
                }

                public void setGift_num(int gift_num) {
                    this.gift_num = gift_num;
                }

                public String getGift_img() {
                    return gift_img;
                }

                public void setGift_img(String gift_img) {
                    this.gift_img = gift_img;
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

                public String getActive_time() {
                    return active_time;
                }

                public void setActive_time(String active_time) {
                    this.active_time = active_time;
                }

                public String getIs_hidden() {
                    return is_hidden;
                }

                public void setIs_hidden(String is_hidden) {
                    this.is_hidden = is_hidden;
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

                public static class LevelBean {
                    /**
                     * level : 6
                     * min_exp : 10800
                     * max : 9999999
                     * exp_speed : 2
                     * album_size : 1024
                     * favorite_num : 100
                     * wage : 600
                     * ticket : 15
                     */

                    private int level;
                    private int min_exp;
                    private int max;
                    //private int exp_speed;
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

//                    public int getExp_speed() {
//                        return exp_speed;
//                    }
//
//                    public void setExp_speed(int exp_speed) {
//                        this.exp_speed = exp_speed;
//                    }

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

}
