package com.example.zexiger.yaoqi.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.List;

public class BeanSpecificContent {

    /*
    * 具体的漫画图片
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
        /**
         * stateCode : 1
         * message : 获取章节数据成功
         * returnData : {"chapter_id":"576832","type":"0","zip_file_high":"http://zip2.u17i.com/32/576832_crop.zip?update_time=1510886115","image_list":[{"location":"http://img2.u17i.com/17/11/142882/18242498_1510886078_j7m9Mjad7wdx.57877_svol.jpg","image_id":"5116585","width":"720","height":"1018","total_tucao":"11","webp":"0","type":"0","img05":"http://img2.u17i.com/17/11/142882/wp/18242498_1510886078_j7m9Mjad7wdx.28938_05.jpg","img50":"http://img2.u17i.com/17/11/142882/wp/18242498_1510886078_j7m9Mjad7wdx.28938_50.jpg","images":[{"id":"4783254","sort":"0","width":"720","height":"1018","img05":"http://img2.u17i.com/17/11/142882/wp/18242498_1510886078_j7m9Mjad7wdx.28938_05.jpg","img50":"http://img2.u17i.com/17/11/142882/wp/18242498_1510886078_j7m9Mjad7wdx.28938_50.jpg"}],"imHeightArr":["1018"]},{"location":"http://img2.u17i.com/17/01/142882/18242498_1485247712_P5VREAcaV3t5.a0ec3_svol.jpg","image_id":"4291909","width":"720","height":"6601","total_tucao":"53","webp":"0","type":"0","img05":"http://img2.u17i.com/17/01/142882/wp/18242498_1485247712_P5VREAcaV3t5.71b29_05.jpg","img50":"http://img2.u17i.com/17/01/142882/wp/18242498_1485247712_P5VREAcaV3t5.71b29_50.jpg","images":[{"id":"3944545","sort":"0","width":"720","height":"1651","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816300370_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816643607_webp50.webp"},{"id":"3944546","sort":"1","width":"720","height":"1651","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816322583_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816538654_webp50.webp"},{"id":"3944547","sort":"2","width":"720","height":"1651","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816665985_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816526338_webp50.webp"},{"id":"3944548","sort":"3","width":"720","height":"1648","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816734885_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816788189_webp50.webp"}],"imHeightArr":["6601"]},{"location":"http://img2.u17i.com/17/01/142882/18242498_1485247718_xt5HPfxK22KX.15280_svol.jpg","image_id":"4291910","width":"720","height":"3745","total_tucao":"40","webp":"0","type":"0","img05":"http://img2.u17i.com/17/01/142882/wp/18242498_1485247718_xt5HPfxK22KX.743ba_05.jpg","img50":"http://img2.u17i.com/17/01/142882/wp/18242498_1485247718_xt5HPfxK22KX.743ba_50.jpg","images":[{"id":"3944549","sort":"0","width":"720","height":"1873","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816319126_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816398378_webp50.webp"},{"id":"3944550","sort":"1","width":"720","height":"1872","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816124833_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816786101_webp50.webp"}],"imHeightArr":["3745"]},{"location":"http://img2.u17i.com/17/01/142882/18242498_1484717144_20U4e20EeQuu.c5506_svol.png","image_id":"4291911","width":"720","height":"5296","total_tucao":"69","webp":"0","type":"0","img05":"http://img2.u17i.com/17/01/142882/wp/18242498_1484717144_20U4e20EeQuu.ebba7_05.png","img50":"http://img2.u17i.com/17/01/142882/wp/18242498_1484717144_20U4e20EeQuu.ebba7_50.png","images":[{"id":"3944551","sort":"0","width":"720","height":"1766","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816964585_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816371213_webp50.webp"},{"id":"3944552","sort":"1","width":"720","height":"1766","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816991005_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816603975_webp50.webp"},{"id":"3944553","sort":"2","width":"720","height":"1764","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816263251_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816816896_webp50.webp"}],"imHeightArr":["5296"]},{"location":"http://img2.u17i.com/17/01/142882/18242498_1484717145_m3PUS25s8CF8.1990d_svol.png","image_id":"4291912","width":"720","height":"3888","total_tucao":"15","webp":"0","type":"0","img05":"http://img2.u17i.com/17/01/142882/wp/18242498_1484717145_m3PUS25s8CF8.1583a_05.png","img50":"http://img2.u17i.com/17/01/142882/wp/18242498_1484717145_m3PUS25s8CF8.1583a_50.png","images":[{"id":"3944554","sort":"0","width":"720","height":"1944","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816346291_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816926118_webp50.webp"},{"id":"3944555","sort":"1","width":"720","height":"1944","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816938745_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816867610_webp50.webp"}],"imHeightArr":["3888"]},{"location":"http://img2.u17i.com/17/01/142882/18242498_1484717146_5UbbzZmQq0O7.a26a1_svol.jpg","image_id":"4291913","width":"720","height":"6480","total_tucao":"50","webp":"0","type":"0","img05":"http://img2.u17i.com/17/01/142882/wp/18242498_1484717146_5UbbzZmQq0O7.5db2d_05.jpg","img50":"http://img2.u17i.com/17/01/142882/wp/18242498_1484717146_5UbbzZmQq0O7.5db2d_50.jpg","images":[{"id":"3944556","sort":"0","width":"720","height":"1620","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816207849_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816597326_webp50.webp"},{"id":"3944557","sort":"1","width":"720","height":"1620","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816587646_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816892714_webp50.webp"},{"id":"3944558","sort":"2","width":"720","height":"1620","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816716937_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816700921_webp50.webp"},{"id":"3944559","sort":"3","width":"720","height":"1620","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816990152_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816371042_webp50.webp"}],"imHeightArr":["6480"]},{"location":"http://img2.u17i.com/17/01/142882/18242498_1484717146_kFK0Ms2MqBm0.9825f_svol.jpg","image_id":"4291914","width":"720","height":"7848","total_tucao":"92","webp":"0","type":"0","img05":"http://img2.u17i.com/17/01/142882/wp/18242498_1484717146_kFK0Ms2MqBm0.d647b_05.jpg","img50":"http://img2.u17i.com/17/01/142882/wp/18242498_1484717146_kFK0Ms2MqBm0.d647b_50.jpg","images":[{"id":"3944560","sort":"0","width":"720","height":"1962","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816985822_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816831696_webp50.webp"},{"id":"3944561","sort":"1","width":"720","height":"1962","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816631004_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816736805_webp50.webp"},{"id":"3944562","sort":"2","width":"720","height":"1962","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816363417_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816273352_webp50.webp"},{"id":"3944563","sort":"3","width":"720","height":"1962","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816222294_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816248402_webp50.webp"}],"imHeightArr":["7848"]}],"unlock_image":[]}
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
             * chapter_id : 576832
             * type : 0
             * zip_file_high : http://zip2.u17i.com/32/576832_crop.zip?update_time=1510886115
             * image_list : [{"location":"http://img2.u17i.com/17/11/142882/18242498_1510886078_j7m9Mjad7wdx.57877_svol.jpg","image_id":"5116585","width":"720","height":"1018","total_tucao":"11","webp":"0","type":"0","img05":"http://img2.u17i.com/17/11/142882/wp/18242498_1510886078_j7m9Mjad7wdx.28938_05.jpg","img50":"http://img2.u17i.com/17/11/142882/wp/18242498_1510886078_j7m9Mjad7wdx.28938_50.jpg","images":[{"id":"4783254","sort":"0","width":"720","height":"1018","img05":"http://img2.u17i.com/17/11/142882/wp/18242498_1510886078_j7m9Mjad7wdx.28938_05.jpg","img50":"http://img2.u17i.com/17/11/142882/wp/18242498_1510886078_j7m9Mjad7wdx.28938_50.jpg"}],"imHeightArr":["1018"]},{"location":"http://img2.u17i.com/17/01/142882/18242498_1485247712_P5VREAcaV3t5.a0ec3_svol.jpg","image_id":"4291909","width":"720","height":"6601","total_tucao":"53","webp":"0","type":"0","img05":"http://img2.u17i.com/17/01/142882/wp/18242498_1485247712_P5VREAcaV3t5.71b29_05.jpg","img50":"http://img2.u17i.com/17/01/142882/wp/18242498_1485247712_P5VREAcaV3t5.71b29_50.jpg","images":[{"id":"3944545","sort":"0","width":"720","height":"1651","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816300370_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816643607_webp50.webp"},{"id":"3944546","sort":"1","width":"720","height":"1651","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816322583_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816538654_webp50.webp"},{"id":"3944547","sort":"2","width":"720","height":"1651","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816665985_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816526338_webp50.webp"},{"id":"3944548","sort":"3","width":"720","height":"1648","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816734885_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816788189_webp50.webp"}],"imHeightArr":["6601"]},{"location":"http://img2.u17i.com/17/01/142882/18242498_1485247718_xt5HPfxK22KX.15280_svol.jpg","image_id":"4291910","width":"720","height":"3745","total_tucao":"40","webp":"0","type":"0","img05":"http://img2.u17i.com/17/01/142882/wp/18242498_1485247718_xt5HPfxK22KX.743ba_05.jpg","img50":"http://img2.u17i.com/17/01/142882/wp/18242498_1485247718_xt5HPfxK22KX.743ba_50.jpg","images":[{"id":"3944549","sort":"0","width":"720","height":"1873","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816319126_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816398378_webp50.webp"},{"id":"3944550","sort":"1","width":"720","height":"1872","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816124833_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816786101_webp50.webp"}],"imHeightArr":["3745"]},{"location":"http://img2.u17i.com/17/01/142882/18242498_1484717144_20U4e20EeQuu.c5506_svol.png","image_id":"4291911","width":"720","height":"5296","total_tucao":"69","webp":"0","type":"0","img05":"http://img2.u17i.com/17/01/142882/wp/18242498_1484717144_20U4e20EeQuu.ebba7_05.png","img50":"http://img2.u17i.com/17/01/142882/wp/18242498_1484717144_20U4e20EeQuu.ebba7_50.png","images":[{"id":"3944551","sort":"0","width":"720","height":"1766","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816964585_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816371213_webp50.webp"},{"id":"3944552","sort":"1","width":"720","height":"1766","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816991005_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816603975_webp50.webp"},{"id":"3944553","sort":"2","width":"720","height":"1764","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816263251_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816816896_webp50.webp"}],"imHeightArr":["5296"]},{"location":"http://img2.u17i.com/17/01/142882/18242498_1484717145_m3PUS25s8CF8.1990d_svol.png","image_id":"4291912","width":"720","height":"3888","total_tucao":"15","webp":"0","type":"0","img05":"http://img2.u17i.com/17/01/142882/wp/18242498_1484717145_m3PUS25s8CF8.1583a_05.png","img50":"http://img2.u17i.com/17/01/142882/wp/18242498_1484717145_m3PUS25s8CF8.1583a_50.png","images":[{"id":"3944554","sort":"0","width":"720","height":"1944","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816346291_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816926118_webp50.webp"},{"id":"3944555","sort":"1","width":"720","height":"1944","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816938745_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816867610_webp50.webp"}],"imHeightArr":["3888"]},{"location":"http://img2.u17i.com/17/01/142882/18242498_1484717146_5UbbzZmQq0O7.a26a1_svol.jpg","image_id":"4291913","width":"720","height":"6480","total_tucao":"50","webp":"0","type":"0","img05":"http://img2.u17i.com/17/01/142882/wp/18242498_1484717146_5UbbzZmQq0O7.5db2d_05.jpg","img50":"http://img2.u17i.com/17/01/142882/wp/18242498_1484717146_5UbbzZmQq0O7.5db2d_50.jpg","images":[{"id":"3944556","sort":"0","width":"720","height":"1620","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816207849_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816597326_webp50.webp"},{"id":"3944557","sort":"1","width":"720","height":"1620","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816587646_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816892714_webp50.webp"},{"id":"3944558","sort":"2","width":"720","height":"1620","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816716937_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816700921_webp50.webp"},{"id":"3944559","sort":"3","width":"720","height":"1620","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816990152_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816371042_webp50.webp"}],"imHeightArr":["6480"]},{"location":"http://img2.u17i.com/17/01/142882/18242498_1484717146_kFK0Ms2MqBm0.9825f_svol.jpg","image_id":"4291914","width":"720","height":"7848","total_tucao":"92","webp":"0","type":"0","img05":"http://img2.u17i.com/17/01/142882/wp/18242498_1484717146_kFK0Ms2MqBm0.d647b_05.jpg","img50":"http://img2.u17i.com/17/01/142882/wp/18242498_1484717146_kFK0Ms2MqBm0.d647b_50.jpg","images":[{"id":"3944560","sort":"0","width":"720","height":"1962","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816985822_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816831696_webp50.webp"},{"id":"3944561","sort":"1","width":"720","height":"1962","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816631004_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816736805_webp50.webp"},{"id":"3944562","sort":"2","width":"720","height":"1962","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816363417_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816273352_webp50.webp"},{"id":"3944563","sort":"3","width":"720","height":"1962","img05":"http://img2.u17i.com/17/01/142882/wp/20170228134816222294_webp05.webp","img50":"http://img2.u17i.com/17/01/142882/wp/20170228134816248402_webp50.webp"}],"imHeightArr":["7848"]}]
             * unlock_image : []
             */

            private String chapter_id;
            private String type;
            private String zip_file_high;
            private List<ImageListBean> image_list;
            private List<?> unlock_image;

            public String getChapter_id() {
                return chapter_id;
            }

            public void setChapter_id(String chapter_id) {
                this.chapter_id = chapter_id;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getZip_file_high() {
                return zip_file_high;
            }

            public void setZip_file_high(String zip_file_high) {
                this.zip_file_high = zip_file_high;
            }

            public List<ImageListBean> getImage_list() {
                return image_list;
            }

            public void setImage_list(List<ImageListBean> image_list) {
                this.image_list = image_list;
            }

            public List<?> getUnlock_image() {
                return unlock_image;
            }

            public void setUnlock_image(List<?> unlock_image) {
                this.unlock_image = unlock_image;
            }

            public static class ImageListBean implements MultiItemEntity {
                /**
                 * location : http://img2.u17i.com/17/11/142882/18242498_1510886078_j7m9Mjad7wdx.57877_svol.jpg
                 * image_id : 5116585
                 * width : 720
                 * height : 1018
                 * total_tucao : 11
                 * webp : 0
                 * type : 0
                 * img05 : http://img2.u17i.com/17/11/142882/wp/18242498_1510886078_j7m9Mjad7wdx.28938_05.jpg
                 * img50 : http://img2.u17i.com/17/11/142882/wp/18242498_1510886078_j7m9Mjad7wdx.28938_50.jpg
                 * images : [{"id":"4783254","sort":"0","width":"720","height":"1018","img05":"http://img2.u17i.com/17/11/142882/wp/18242498_1510886078_j7m9Mjad7wdx.28938_05.jpg","img50":"http://img2.u17i.com/17/11/142882/wp/18242498_1510886078_j7m9Mjad7wdx.28938_50.jpg"}]
                 * imHeightArr : ["1018"]
                 */

                //
                private int itemType=1;
                //样式 1
                public static final int TYPE_1= 1;

                @Override
                public int getItemType() {
                    return itemType;
                }

                public void setItemType(int itemType) {
                    this.itemType = itemType;
                }

                private String location;
                private String image_id;
                private String width;
                private String height;
                private String total_tucao;
                private String webp;
                private String type;
                private String img05;
                private String img50;
                private List<ImagesBean> images;
                private List<String> imHeightArr;

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

                public String getTotal_tucao() {
                    return total_tucao;
                }

                public void setTotal_tucao(String total_tucao) {
                    this.total_tucao = total_tucao;
                }

                public String getWebp() {
                    return webp;
                }

                public void setWebp(String webp) {
                    this.webp = webp;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getImg05() {
                    return img05;
                }

                public void setImg05(String img05) {
                    this.img05 = img05;
                }

                public String getImg50() {
                    return img50;
                }

                public void setImg50(String img50) {
                    this.img50 = img50;
                }

                public List<ImagesBean> getImages() {
                    return images;
                }

                public void setImages(List<ImagesBean> images) {
                    this.images = images;
                }

                public List<String> getImHeightArr() {
                    return imHeightArr;
                }

                public void setImHeightArr(List<String> imHeightArr) {
                    this.imHeightArr = imHeightArr;
                }

                public static class ImagesBean {
                    /**
                     * id : 4783254
                     * sort : 0
                     * width : 720
                     * height : 1018
                     * img05 : http://img2.u17i.com/17/11/142882/wp/18242498_1510886078_j7m9Mjad7wdx.28938_05.jpg
                     * img50 : http://img2.u17i.com/17/11/142882/wp/18242498_1510886078_j7m9Mjad7wdx.28938_50.jpg
                     */

                    private String id;
                    private String sort;
                    private String width;
                    private String height;
                    private String img05;
                    private String img50;

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getSort() {
                        return sort;
                    }

                    public void setSort(String sort) {
                        this.sort = sort;
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

                    public String getImg05() {
                        return img05;
                    }

                    public void setImg05(String img05) {
                        this.img05 = img05;
                    }

                    public String getImg50() {
                        return img50;
                    }

                    public void setImg50(String img50) {
                        this.img50 = img50;
                    }
                }
            }
        }
    }
}
