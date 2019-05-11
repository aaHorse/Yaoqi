package com.example.zexiger.yaoqi.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.List;

//http://app.u17.com/v3/appV3_3/android/phone/comic/detail_static_new?come_from=lenovo&comicid=8805&serialNumber=3089dfb0&v=4500102&model=ZUK+Z2121&android_id=8e8c4ff5b6235ce9HTTP/1.1
public class BeanSpecific {
    /*
    * 第一级
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
        /*
        * 第二级
        * */
        private ReturnDataBean returnData;

        public ReturnDataBean getReturnData() {
            return returnData;
        }

        public void setReturnData(ReturnDataBean returnData) {
            this.returnData = returnData;
        }

        public static class ReturnDataBean {
            /*
            * 第三级
            * */
            private ComicBean comic;
            private List<ChapterListBean> chapter_list;

            public ComicBean getComic() {
                return comic;
            }

            public void setComic(ComicBean comic) {
                this.comic = comic;
            }

            public List<ChapterListBean> getChapter_list() {
                return chapter_list;
            }

            public void setChapter_list(List<ChapterListBean> chapter_list) {
                this.chapter_list = chapter_list;
            }

            public static class ComicBean {
                /**
                 * name : 虎x鹤 妖师录
                 * comic_id : 8805
                 * is_vip : 3
                 * short_description : 修真世界虎鹤双形
                 * accredit : 2
                 * type : 0
                 * description : 妖魔鬼怪，仙道妖法，奇珍异宝，一个降魔卫道的玄幻世界！
                 * cate_id : 故事漫画
                 * thread_id : 219924
                 * series_status : 0
                 * last_update_time : 1556547902
                 * status : 2
                 * week_more : 3
                 * last_update_week :
                 * wideCover : http://cover.u17i.com/2018/10/12683783_1539672422_HeH2eLCcV8ae.ubig.jpg
                 * cover : http://cover.u17i.com/2014/11/190368_1415172576_VxKFjWIDrphw.sbig.jpg
                 * ori : http://cover.u17i.com/temp/2014/11/190368_1415172576_VxKFjWIDrphw.jpg
                 * theme_ids : ["少年","魔幻","动作"]
                 * classifyTags : [{"name":"少年","argName":"cate","argVal":1},{"name":"魔幻","argName":"theme","argVal":2},{"name":"动作","argName":"theme","argVal":5}]
                 * author : {"avatar":"http://k.avatar.u17i.com/2013/0331/190368_613e84c72944dee9979f780f6c4cfd8b_1364694763.big.png","name":"黄晓达","id":"190368"}
                 * wideColor : b49a84
                 * tagList : ["故事漫画","连载中"]
                 * ticket_desc : 再投335票就可以第3名！冲鸭！
                 */

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

            public static class ChapterListBean implements MultiItemEntity {
                /**
                 * name : 1 相遇
                 * image_total : 46
                 * chapter_id : 31066
                 * type : 0
                 * size : 12003969
                 * pass_time : 1289440156
                 * release_time : 0
                 * zip_high_webp : 6227393
                 * vip_images : 0
                 * publish_time : 1289440156
                 * chapterIndex : 0
                 * smallPlaceCover : http://cover2.u17i.com/chapter/2018/11/05/comic_chapter_1541418382_370.square.jpg
                 * is_new : 0
                 * has_locked_image : false
                 * index : 1
                 */

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
        }
    }
}
