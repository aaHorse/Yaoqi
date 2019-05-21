package com.example.zexiger.yaoqi.bean;

import java.util.List;

//http://app.u17.com/v3/appV3_3/android/phone/comic/getDetectListV4_5?come_from=lenovo&serialNumber=3089dfb0&v=4500102&model=ZUK+Z2121&android_id=8e8c4ff5b6235ce9HTTP/1.1

public class BeanDiscover {
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

            private FloatItemsBean floatItems;
            private String editTime;
            private String defaultSearch;
            private List<GalleryItemsBean> galleryItems;
            private List<?> textItems;
            private List<ModulesBean> modules;

            public FloatItemsBean getFloatItems() {
                return floatItems;
            }

            public void setFloatItems(FloatItemsBean floatItems) {
                this.floatItems = floatItems;
            }

            public String getEditTime() {
                return editTime;
            }

            public void setEditTime(String editTime) {
                this.editTime = editTime;
            }

            public String getDefaultSearch() {
                return defaultSearch;
            }

            public void setDefaultSearch(String defaultSearch) {
                this.defaultSearch = defaultSearch;
            }

            public List<GalleryItemsBean> getGalleryItems() {
                return galleryItems;
            }

            public void setGalleryItems(List<GalleryItemsBean> galleryItems) {
                this.galleryItems = galleryItems;
            }

            public List<?> getTextItems() {
                return textItems;
            }

            public void setTextItems(List<?> textItems) {
                this.textItems = textItems;
            }

            public List<ModulesBean> getModules() {
                return modules;
            }

            public void setModules(List<ModulesBean> modules) {
                this.modules = modules;
            }

            public static class FloatItemsBean {
                /**
                 * localInfoButton : false
                 */

                private boolean localInfoButton;

                public boolean isLocalInfoButton() {
                    return localInfoButton;
                }

                public void setLocalInfoButton(boolean localInfoButton) {
                    this.localInfoButton = localInfoButton;
                }
            }

            public static class GalleryItemsBean {

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
                     * val : 178994
                     */

                    private String key;
                    private String val;

                    public String getKey() {
                        return key;
                    }

                    public void setKey(String key) {
                        this.key = key;
                    }

                    public String getVal() {
                        return val;
                    }

                    public void setVal(int val) {
                        this.val = val+"";
                    }

                    public void setVal(String val){
                        this.val=val;
                    }
                }
            }

            public static class ModulesBean {

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
