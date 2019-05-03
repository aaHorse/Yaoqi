package com.example.zexiger.yaoqi.bean;

import java.util.List;

//http://app.u17.com/v3/appV3_3/android/phone/comic/favRecommend?come_from=lenovo&model=ZUK+Z2121&serialNumber=3089dfb0&android_id=8e8c4ff5b6235ce9&v=4500102HTTP/1.1
public class BeanBookrack {
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
            private FavDefaultBean favDefault;

            public FavDefaultBean getFavDefault() {
                return favDefault;
            }

            public void setFavDefault(FavDefaultBean favDefault) {
                this.favDefault = favDefault;
            }

            public static class FavDefaultBean {

                private int maxNum;
                private List<ComicsBeanXX> comics;

                public int getMaxNum() {
                    return maxNum;
                }

                public void setMaxNum(int maxNum) {
                    this.maxNum = maxNum;
                }

                public List<ComicsBeanXX> getComics() {
                    return comics;
                }

                public void setComics(List<ComicsBeanXX> comics) {
                    this.comics = comics;
                }

                public static class ComicsBeanXX {
                    /**
                     * comicId : 68109
                     * name : 蓝翅
                     * cover : http://cover.u17i.com/2017/03/4177111_1489509484_l8FsH161lxf2.sbig.jpg
                     * chapterCount : 335
                     */

                    /*
                    * 第四级
                    * */
                    private int comicId;
                    private String name;
                    private String cover;
                    private int chapterCount;

                    public int getComicId() {
                        return comicId;
                    }

                    public void setComicId(int comicId) {
                        this.comicId = comicId;
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

                    public int getChapterCount() {
                        return chapterCount;
                    }

                    public void setChapterCount(int chapterCount) {
                        this.chapterCount = chapterCount;
                    }
                }
            }
        }
    }
}
