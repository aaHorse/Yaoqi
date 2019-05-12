package com.example.zexiger.yaoqi.bean;

import java.util.List;

//http://app.u17.com/v3/appV3_3/android/phone/comic/chapterNew?come_from=lenovo&serialNumber=3089dfb0&v=4500102&model=ZUK+Z2121&chapter_id=32862&android_id=8e8c4ff5b6235ce9%20HTTP/1.1
public class BeanSpecific_1 {

    /*
    * 具体的漫画
    * */
    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {

        private ReturnDataBean returnData;

        public ReturnDataBean getReturnData() {
            return returnData;
        }

        public void setReturnData(ReturnDataBean returnData) {
            this.returnData = returnData;
        }

        public static class ReturnDataBean {

            private String chapter_id;
            private List<ImageListBean> image_list;

            public String getChapter_id() {
                return chapter_id;
            }

            public void setChapter_id(String chapter_id) {
                this.chapter_id = chapter_id;
            }

            public List<ImageListBean> getImage_list() {
                return image_list;
            }

            public void setImage_list(List<ImageListBean> image_list) {
                this.image_list = image_list;
            }


            public static class ImageListBean {
                /**
                 * location : http://img5.u17i.com/10/11/8805/190368_1290604331_F9h22VHH2VI2.0fe83_svol.jpg
                 * image_id : 270965
                 * width : 800
                 * height : 1129
                 * total_tucao : 273
                 * webp : 0
                 * type : 0
                 * img05 : http://img5.u17i.com/10/11/8805/wp/190368_1290604331_F9h22VHH2VI2.a7179_05.jpg
                 * img50 : http://img5.u17i.com/10/11/8805/wp/190368_1290604331_F9h22VHH2VI2.a7179_50.jpg
                 * images : [{"id":"197414","sort":"0","width":"800","height":"1129","img05":"http://img5.u17i.com/10/11/8805/wp/190368_1290604331_F9h22VHH2VI2.a7179_05.jpg","img50":"http://img5.u17i.com/10/11/8805/wp/190368_1290604331_F9h22VHH2VI2.a7179_50.jpg"}]
                 * imHeightArr : ["1129"]
                 */

                private String location;
                private String image_id;
                private String width;
                private String height;

                public String getLocation() {
                    return location;
                }

                public void setLocation(String location) {
                    this.location = location;
                }

                public String getImage_id() {
                    return image_id;
                }

                public void setImage_id(String image_id) {
                    this.image_id = image_id;
                }

                public String getWidth() {
                    return width;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public String getHeight() {
                    return height;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

            }
        }
    }
}
