package com.example.zexiger.yaoqi.bean;

import java.util.List;

//http://app.u17.com/v3/appV3_3/android/phone/comic/getDetectListV4_5?come_from=lenovo&serialNumber=3089dfb0&v=4500102&model=ZUK+Z2121&android_id=8e8c4ff5b6235ce9HTTP/1.1
public class BeanDiscover {

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

            //轮播图
            private List<GalleryItemsBean> galleryItems;
            //下面的每一个板块
            private List<ModulesBean> modules;

            public List<GalleryItemsBean> getGalleryItems() {
                return galleryItems;
            }

            public void setGalleryItems(List<GalleryItemsBean> galleryItems) {
                this.galleryItems = galleryItems;
            }

            public List<ModulesBean> getModules() {
                return modules;
            }

            public void setModules(List<ModulesBean> modules) {
                this.modules = modules;
            }

            public static class GalleryItemsBean {
                /**
                 * linkType : 3
                 * cover : http://image.mylife.u17t.com/2019/04/30/1556602110_Pi27I3SUiIpX.jpg
                 * id : 1393
                 * title : rainbow X
                 * content :
                 * topCover : http://image.mylife.u17t.com/2019/04/30/1556602113_u1WI7UiN6nn1.png
                 * ext : [{"key":"comicId","val":79422}]
                 */

                private int linkType;
                private String cover;
                private int id;
                private String title;
                private String content;
                private String topCover;
                private List<ExtBean> ext;

                public int getLinkType() {
                    return linkType;
                }

                public void setLinkType(int linkType) {
                    this.linkType = linkType;
                }

                public String getCover() {
                    return cover;
                }

                public void setCover(String cover) {
                    this.cover = cover;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }

                public String getTopCover() {
                    return topCover;
                }

                public void setTopCover(String topCover) {
                    this.topCover = topCover;
                }

                public List<ExtBean> getExt() {
                    return ext;
                }

                public void setExt(List<ExtBean> ext) {
                    this.ext = ext;
                }

                public static class ExtBean {
                    /**
                     * key : comicId
                     * val : 79422
                     */

                    private String key;
                    private int val;

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    public int getVal() {
                        return val;
                    }

                    public void setVal(int val) {
                        this.val = val;
                    }
                }
            }

            public static class ModulesBean {
                /**
                 * moduleType : 1
                 * uiType : 1
                 * moduleInfo : {"argName":"discovery","argValue":1,"title":"入坑只需一秒","icon":"http://image.mylife.u17t.com/2019/03/15/1552634037_jh4l1uZU46yH.png","bgCover":"http://image.mylife.u17t.com/"}
                 * items : [[{"comicId":179580,"title":"行星独行","cover":"http://cover2.u17i.com/2019/01/20103_1546513207_kvoYy01R915v.ubig.jpg","subTitle":"来自白星"},{"comicId":146607,"title":"妖怪男友派件中","cover":"http://cover2.u17i.com/2018/10/12683783_1539668431_HQhCQuE6LvE2.ubig.jpg","subTitle":"猫妖大哥和邻家小弟"},{"comicId":85740,"title":"请勿擅自签订契约","cover":"http://cover2.u17i.com/2018/10/12683783_1539673045_1EbDp11hpy81.ubig.jpg","subTitle":"少女！签订契约吧！"}],[{"comicId":151541,"title":"霸道总裁爱上我","cover":"http://cover2.u17i.com/2019/04/18833170_1555035928_R8ucH1RQrqmr.ubig.jpg","subTitle":"栽在霸道总裁手里"},{"comicId":195,"title":"雏蜂","cover":"http://cover2.u17i.com/2017/06/1260_1497245871_rbaowAU0Bb6A.ubig.jpg","subTitle":"少女尖兵最后的380"},{"comicId":167141,"title":"逆转恋情","cover":"http://cover2.u17i.com/2018/10/12683783_1539670342_2o32Z1tPpR32.ubig.jpg","subTitle":"逆转恋情"}],[{"comicId":130521,"title":"妙手仙丹","cover":"http://cover2.u17i.com/2017/06/109268_1498306358_Ee6c2ewk2yD7.ubig.jpg","subTitle":"巨力少女vs闷骚师父"},{"comicId":98063,"title":"邪君宠-貂蝉","cover":"http://cover2.u17i.com/2018/10/17905756_1540265055_Axy2HlKBh3Ah.ubig.jpg","subTitle":"穿越貂蝉结缘暴君恋"},{"comicId":179399,"title":"古人上线","cover":"http://cover2.u17i.com/2019/01/12270760_1547876515_4TagO5Ag8z78.ubig.jpg","subTitle":"穿到现代的古人"}],[{"comicId":75763,"title":"金牌助理","cover":"http://cover2.u17i.com/2018/10/12683783_1539670603_3p91CD46zz31.ubig.jpg","subTitle":"今天的男神也没吃药"},{"comicId":15596,"title":"老板好像喜欢我","cover":"http://cover2.u17i.com/2019/04/571406_1555297554_M7ggmUG3ANaX.ubig.jpg","subTitle":"存在于儿时的视界"},{"comicId":167077,"title":"我的猫咪上仙","cover":"http://cover2.u17i.com/2017/12/23168997_1514526212_9hh72x0fhH8o.ubig.jpg","subTitle":"被主人吸爆的猫神仙"}]]
                 */

                private int moduleType;
                private int uiType;
                private ModuleInfoBean moduleInfo;
                private List<List<ItemsBean>> items;

                public int getModuleType() {
                    return moduleType;
                }

                public void setModuleType(int moduleType) {
                    this.moduleType = moduleType;
                }

                public int getUiType() {
                    return uiType;
                }

                public void setUiType(int uiType) {
                    this.uiType = uiType;
                }

                public ModuleInfoBean getModuleInfo() {
                    return moduleInfo;
                }

                public void setModuleInfo(ModuleInfoBean moduleInfo) {
                    this.moduleInfo = moduleInfo;
                }

                public List<List<ItemsBean>> getItems() {
                    return items;
                }

                public void setItems(List<List<ItemsBean>> items) {
                    this.items = items;
                }

                public static class ModuleInfoBean {
                    /**
                     * argName : discovery
                     * argValue : 1
                     * title : 入坑只需一秒
                     * icon : http://image.mylife.u17t.com/2019/03/15/1552634037_jh4l1uZU46yH.png
                     * bgCover : http://image.mylife.u17t.com/
                     */

                    private String argName;
                    private int argValue;
                    private String title;
                    private String icon;
                    private String bgCover;

                    public String getArgName() {
                        return argName;
                    }

                    public void setArgName(String argName) {
                        this.argName = argName;
                    }

                    public int getArgValue() {
                        return argValue;
                    }

                    public void setArgValue(int argValue) {
                        this.argValue = argValue;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getIcon() {
                        return icon;
                    }

                    public void setIcon(String icon) {
                        this.icon = icon;
                    }

                    public String getBgCover() {
                        return bgCover;
                    }

                    public void setBgCover(String bgCover) {
                        this.bgCover = bgCover;
                    }
                }

                public static class ItemsBean {
                    /**
                     * comicId : 179580
                     * title : 行星独行
                     * cover : http://cover2.u17i.com/2019/01/20103_1546513207_kvoYy01R915v.ubig.jpg
                     * subTitle : 来自白星
                     */

                    private int comicId;
                    private String title;
                    private String cover;
                    private String subTitle;

                    public int getComicId() {
                        return comicId;
                    }

                    public void setComicId(int comicId) {
                        this.comicId = comicId;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getCover() {
                        return cover;
                    }

                    public void setCover(String cover) {
                        this.cover = cover;
                    }

                    public String getSubTitle() {
                        return subTitle;
                    }

                    public void setSubTitle(String subTitle) {
                        this.subTitle = subTitle;
                    }
                }
            }
        }
    }
}
