package com.example.zexiger.yaoqi.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.List;

//http://app.u17.com/v3/appV3_3/android/phone/list/todayRecommendList?day=5&page=1&come_from=lenovo&serialNumber=3089dfb0&v=4500102&model=ZUK+Z2121&android_id=8e8c4ff5b6235ce9HTTP/1.1
public class BeanUpdate {

    /*
    * 第一级
    * */
    private int code;
    private String msg;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
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
            private int page;
            private boolean hasMore;
            private boolean isNew;
            private int curDay;
            private List<ComicsBean> comics;

            public int getPage() {
                return page;
            }

            public void setPage(int page) {
                this.page = page;
            }

            public boolean isHasMore() {
                return hasMore;
            }

            public void setHasMore(boolean hasMore) {
                this.hasMore = hasMore;
            }

            public boolean isIsNew() {
                return isNew;
            }

            public void setIsNew(boolean isNew) {
                this.isNew = isNew;
            }

            public int getCurDay() {
                return curDay;
            }

            public void setCurDay(int curDay) {
                this.curDay = curDay;
            }

            public List<ComicsBean> getComics() {
                return comics;
            }

            public void setComics(List<ComicsBean> comics) {
                this.comics = comics;
            }

            public static class ComicsBean implements MultiItemEntity {
                /**
                 * todayId : 13636
                 * btnColor : 0
                 * title : 蓝翅
                 * is_dynamic_img : 0
                 * comic_sort : 3
                 * publish_time : 1556864816
                 * cover : http://cover2.u17i.com/chapter/2019/05/03/comic_chapter_1556864504_864.big.webp
                 * actionType : 3
                 * uiType : 1
                 * comicId : 68109
                 * comicName : 蓝翅
                 * author : 徐璐AKO
                 * chapterId : 858330
                 * description : 第99回 等待02
                 * chapterIndex : 335
                 * tagList : [{"tagStr":"生活","tagColor":"FDD63E"}]
                 * updateType : 2
                 */

                /*
                * 第四级
                * */
                private int todayId;
                private int btnColor;
                private String title;
                private String is_dynamic_img;
                private int comic_sort;
                private String publish_time;
                private String cover;
                private int actionType;
                private int uiType;
                private int comicId;
                private String comicName;
                private String author;
                private int chapterId;
                private String description;
                private int chapterIndex;
                private int updateType;
                private List<TagListBean> tagList;

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

                public int getTodayId() {
                    return todayId;
                }

                public void setTodayId(int todayId) {
                    this.todayId = todayId;
                }

                public int getBtnColor() {
                    return btnColor;
                }

                public void setBtnColor(int btnColor) {
                    this.btnColor = btnColor;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getIs_dynamic_img() {
                    return is_dynamic_img;
                }

                public void setIs_dynamic_img(String is_dynamic_img) {
                    this.is_dynamic_img = is_dynamic_img;
                }

                public int getComic_sort() {
                    return comic_sort;
                }

                public void setComic_sort(int comic_sort) {
                    this.comic_sort = comic_sort;
                }

                public String getPublish_time() {
                    return publish_time;
                }

                public void setPublish_time(String publish_time) {
                    this.publish_time = publish_time;
                }

                public String getCover() {
                    return cover;
                }

                public void setCover(String cover) {
                    this.cover = cover;
                }

                public int getActionType() {
                    return actionType;
                }

                public void setActionType(int actionType) {
                    this.actionType = actionType;
                }

                public int getUiType() {
                    return uiType;
                }

                public void setUiType(int uiType) {
                    this.uiType = uiType;
                }

                public int getComicId() {
                    return comicId;
                }

                public void setComicId(int comicId) {
                    this.comicId = comicId;
                }

                public String getComicName() {
                    return comicName;
                }

                public void setComicName(String comicName) {
                    this.comicName = comicName;
                }

                public String getAuthor() {
                    return author;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }

                public int getChapterId() {
                    return chapterId;
                }

                public void setChapterId(int chapterId) {
                    this.chapterId = chapterId;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public int getChapterIndex() {
                    return chapterIndex;
                }

                public void setChapterIndex(int chapterIndex) {
                    this.chapterIndex = chapterIndex;
                }

                public int getUpdateType() {
                    return updateType;
                }

                public void setUpdateType(int updateType) {
                    this.updateType = updateType;
                }

                public List<TagListBean> getTagList() {
                    return tagList;
                }

                public void setTagList(List<TagListBean> tagList) {
                    this.tagList = tagList;
                }

                public static class TagListBean {
                    /**
                     * tagStr : 生活
                     * tagColor : FDD63E
                     */

                    private String tagStr;
                    private String tagColor;

                    public String getTagStr() {
                        return tagStr;
                    }

                    public void setTagStr(String tagStr) {
                        this.tagStr = tagStr;
                    }

                    public String getTagColor() {
                        return tagColor;
                    }

                    public void setTagColor(String tagColor) {
                        this.tagColor = tagColor;
                    }
                }
            }
        }
    }
}
