package com.example.zexiger.yaoqi.bean;

import java.util.List;

//http://app.u17.com/v3/appV3_3/android/phone/comic/chapterNew?come_from=lenovo&serialNumber=3089dfb0&v=4500102&model=ZUK+Z2121&chapter_id=32862&android_id=8e8c4ff5b6235ce9%20HTTP/1.1
public class BeanSpecific_1 {

    //漫画的具体内容

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
         * returnData : {"chapter_id":"9963","type":"3","zip_file_high":"http://zip6.u17i.com/63/9963_crop.zip?update_time=1515651986","image_list":[{"location":"http://img6.u17i.com/10/02/3166/2786_1515651231_jdx40f4I10nn.116d9_svol.jpg","image_id":"83276","width":"800","height":"1422","total_tucao":"2650","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651231_jdx40f4I10nn.79bd4_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651231_jdx40f4I10nn.116d9_svol.jpg","images":[{"id":"4948131","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526729311_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526725833_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651241_23R92G8DgNku.3f3e8_svol.jpg","image_id":"83277","width":"800","height":"1422","total_tucao":"1994","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651241_23R92G8DgNku.9d570_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651241_23R92G8DgNku.3f3e8_svol.jpg","images":[{"id":"4948132","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526544573_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526469615_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651251_Znjysk7j6EjG.41be6_svol.jpg","image_id":"83278","width":"800","height":"1422","total_tucao":"1663","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651251_Znjysk7j6EjG.5ba03_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651251_Znjysk7j6EjG.41be6_svol.jpg","images":[{"id":"4948133","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526817010_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526588876_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651261_wl47SCysCRw2.f7b21_svol.jpg","image_id":"83279","width":"800","height":"1422","total_tucao":"1407","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651261_wl47SCysCRw2.776de_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651261_wl47SCysCRw2.f7b21_svol.jpg","images":[{"id":"4948134","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526899723_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526466175_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651273_9ZU2U7848U7O.00a1e_svol.jpg","image_id":"83280","width":"800","height":"1422","total_tucao":"1435","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651273_9ZU2U7848U7O.ce60f_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651273_9ZU2U7848U7O.00a1e_svol.jpg","images":[{"id":"4948135","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526477843_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526301931_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651284_85M8QEpN8p1e.7aa3d_svol.jpg","image_id":"83281","width":"800","height":"1422","total_tucao":"1635","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651284_85M8QEpN8p1e.fdd0f_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651284_85M8QEpN8p1e.7aa3d_svol.jpg","images":[{"id":"4948136","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526118040_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526367394_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651352_5l2LZ9KFl4tv.ba0a5_svol.jpg","image_id":"83282","width":"800","height":"1422","total_tucao":"1327","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651352_5l2LZ9KFl4tv.1b4aa_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651352_5l2LZ9KFl4tv.ba0a5_svol.jpg","images":[{"id":"4948141","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526931745_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526191589_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651382_O66vZ4E43GBG.13fc5_svol.jpg","image_id":"83283","width":"800","height":"1422","total_tucao":"1812","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651382_O66vZ4E43GBG.c70ec_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651382_O66vZ4E43GBG.13fc5_svol.jpg","images":[{"id":"4948146","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526759803_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526872011_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651422_9Ry31R8aFF9r.b360c_svol.jpg","image_id":"83284","width":"800","height":"1422","total_tucao":"1439","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651422_9Ry31R8aFF9r.da459_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651422_9Ry31R8aFF9r.b360c_svol.jpg","images":[{"id":"4948147","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526341507_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526516028_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651435_UF8mnjCF8FmZ.db581_svol.jpg","image_id":"83285","width":"800","height":"1422","total_tucao":"1543","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651435_UF8mnjCF8FmZ.26aca_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651435_UF8mnjCF8FmZ.db581_svol.jpg","images":[{"id":"4948148","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526354286_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526646099_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651628_l5gD3yhm5JHy.d3bb4_svol.jpg","image_id":"83286","width":"800","height":"1422","total_tucao":"1696","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651628_l5gD3yhm5JHy.3ef0e_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651628_l5gD3yhm5JHy.d3bb4_svol.jpg","images":[{"id":"4948169","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526861424_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526922391_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651639_u9bS3zRzZ797.e6d60_svol.jpg","image_id":"83287","width":"800","height":"1422","total_tucao":"960","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651639_u9bS3zRzZ797.84db2_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651639_u9bS3zRzZ797.e6d60_svol.jpg","images":[{"id":"4948174","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526613744_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526613180_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651654_PYvy0P6Er32y.2a24b_svol.jpg","image_id":"83288","width":"800","height":"1422","total_tucao":"1368","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651654_PYvy0P6Er32y.026c2_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651654_PYvy0P6Er32y.2a24b_svol.jpg","images":[{"id":"4948180","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526394092_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526512624_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651665_8c8Pz6sBMeZO.6ab11_svol.jpg","image_id":"83289","width":"800","height":"1422","total_tucao":"1720","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651665_8c8Pz6sBMeZO.481fd_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651665_8c8Pz6sBMeZO.6ab11_svol.jpg","images":[{"id":"4948186","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526734550_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526796368_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651711_5wnKVUKsiYAa.bc824_svol.jpg","image_id":"83290","width":"800","height":"1422","total_tucao":"1603","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651711_5wnKVUKsiYAa.47166_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651711_5wnKVUKsiYAa.bc824_svol.jpg","images":[{"id":"4948187","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526580632_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526420839_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651851_b5qOX4IC57Bx.ae624_svol.jpg","image_id":"83291","width":"800","height":"1422","total_tucao":"1025","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651851_b5qOX4IC57Bx.19eb2_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651851_b5qOX4IC57Bx.ae624_svol.jpg","images":[{"id":"4948188","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526679708_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526384821_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651865_e2g8UOGgllGa.55174_svol.jpg","image_id":"83292","width":"800","height":"1422","total_tucao":"881","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651865_e2g8UOGgllGa.90912_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651865_e2g8UOGgllGa.55174_svol.jpg","images":[{"id":"4948189","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526921781_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526933247_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651881_KCCMCCYMVgJ9.45e5a_svol.jpg","image_id":"83293","width":"800","height":"1422","total_tucao":"1584","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651881_KCCMCCYMVgJ9.c02b9_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651881_KCCMCCYMVgJ9.45e5a_svol.jpg","images":[{"id":"4948190","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526842718_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526779520_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651894_445aFz2bxBHN.80c44_svol.jpg","image_id":"83294","width":"800","height":"1422","total_tucao":"5262","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651894_445aFz2bxBHN.02435_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651894_445aFz2bxBHN.80c44_svol.jpg","images":[{"id":"4948191","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526715726_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526229317_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651910_DhMinZZ4E0ei.944e1_svol.jpg","image_id":"83295","width":"800","height":"1422","total_tucao":"1439","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651910_DhMinZZ4E0ei.cfd74_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651910_DhMinZZ4E0ei.944e1_svol.jpg","images":[{"id":"4948192","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526386987_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526135143_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651927_1tei6TbVoiv5.ee0f2_svol.jpg","image_id":"83296","width":"800","height":"1422","total_tucao":"1480","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651927_1tei6TbVoiv5.9b3cb_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651927_1tei6TbVoiv5.ee0f2_svol.jpg","images":[{"id":"4948193","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526792146_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526820957_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651941_5iV5ly557fvr.88ff0_svol.jpg","image_id":"83297","width":"800","height":"1422","total_tucao":"1609","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651941_5iV5ly557fvr.96ccc_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651941_5iV5ly557fvr.88ff0_svol.jpg","images":[{"id":"4948194","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526598003_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526851387_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651955_upalJ5Y5z4k6.b8951_svol.jpg","image_id":"83298","width":"800","height":"1422","total_tucao":"1544","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651955_upalJ5Y5z4k6.18b2a_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651955_upalJ5Y5z4k6.b8951_svol.jpg","images":[{"id":"4948195","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526601661_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526723972_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651971_2bB22aAbOKDO.7c994_svol.jpg","image_id":"83299","width":"800","height":"1422","total_tucao":"963","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651971_2bB22aAbOKDO.82cbb_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651971_2bB22aAbOKDO.7c994_svol.jpg","images":[{"id":"4948196","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526807838_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526836727_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651983_dkk31ofFbdxX.e2aa3_svol.jpg","image_id":"91241","width":"800","height":"1422","total_tucao":"1938","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651983_dkk31ofFbdxX.ef1be_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651983_dkk31ofFbdxX.e2aa3_svol.jpg","images":[{"id":"4948197","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526480479_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526664634_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1265128093_rELZLiIEqrM5.a8645_svol.jpg","image_id":"83301","width":"800","height":"1135","total_tucao":"1165","webp":"0","type":"1","img05":"http://img6.u17i.com/10/02/3166/wp/2786_1265128093_rELZLiIEqrM5.666c9_05.jpg","img50":"http://img6.u17i.com/10/02/3166/wp/2786_1265128093_rELZLiIEqrM5.666c9_50.jpg","images":[{"id":"74802","sort":"0","width":"800","height":"1135","img05":"http://img6.u17i.com/10/02/3166/wp/2786_1265128093_rELZLiIEqrM5.666c9_05.jpg","img50":"http://img6.u17i.com/10/02/3166/wp/2786_1265128093_rELZLiIEqrM5.666c9_50.jpg"}],"imHeightArr":["1135"]}],"unlock_image":[]}
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
             * chapter_id : 9963
             * type : 3
             * zip_file_high : http://zip6.u17i.com/63/9963_crop.zip?update_time=1515651986
             * image_list : [{"location":"http://img6.u17i.com/10/02/3166/2786_1515651231_jdx40f4I10nn.116d9_svol.jpg","image_id":"83276","width":"800","height":"1422","total_tucao":"2650","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651231_jdx40f4I10nn.79bd4_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651231_jdx40f4I10nn.116d9_svol.jpg","images":[{"id":"4948131","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526729311_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526725833_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651241_23R92G8DgNku.3f3e8_svol.jpg","image_id":"83277","width":"800","height":"1422","total_tucao":"1994","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651241_23R92G8DgNku.9d570_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651241_23R92G8DgNku.3f3e8_svol.jpg","images":[{"id":"4948132","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526544573_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526469615_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651251_Znjysk7j6EjG.41be6_svol.jpg","image_id":"83278","width":"800","height":"1422","total_tucao":"1663","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651251_Znjysk7j6EjG.5ba03_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651251_Znjysk7j6EjG.41be6_svol.jpg","images":[{"id":"4948133","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526817010_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526588876_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651261_wl47SCysCRw2.f7b21_svol.jpg","image_id":"83279","width":"800","height":"1422","total_tucao":"1407","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651261_wl47SCysCRw2.776de_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651261_wl47SCysCRw2.f7b21_svol.jpg","images":[{"id":"4948134","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526899723_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526466175_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651273_9ZU2U7848U7O.00a1e_svol.jpg","image_id":"83280","width":"800","height":"1422","total_tucao":"1435","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651273_9ZU2U7848U7O.ce60f_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651273_9ZU2U7848U7O.00a1e_svol.jpg","images":[{"id":"4948135","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526477843_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526301931_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651284_85M8QEpN8p1e.7aa3d_svol.jpg","image_id":"83281","width":"800","height":"1422","total_tucao":"1635","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651284_85M8QEpN8p1e.fdd0f_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651284_85M8QEpN8p1e.7aa3d_svol.jpg","images":[{"id":"4948136","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526118040_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526367394_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651352_5l2LZ9KFl4tv.ba0a5_svol.jpg","image_id":"83282","width":"800","height":"1422","total_tucao":"1327","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651352_5l2LZ9KFl4tv.1b4aa_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651352_5l2LZ9KFl4tv.ba0a5_svol.jpg","images":[{"id":"4948141","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526931745_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526191589_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651382_O66vZ4E43GBG.13fc5_svol.jpg","image_id":"83283","width":"800","height":"1422","total_tucao":"1812","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651382_O66vZ4E43GBG.c70ec_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651382_O66vZ4E43GBG.13fc5_svol.jpg","images":[{"id":"4948146","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526759803_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526872011_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651422_9Ry31R8aFF9r.b360c_svol.jpg","image_id":"83284","width":"800","height":"1422","total_tucao":"1439","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651422_9Ry31R8aFF9r.da459_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651422_9Ry31R8aFF9r.b360c_svol.jpg","images":[{"id":"4948147","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526341507_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526516028_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651435_UF8mnjCF8FmZ.db581_svol.jpg","image_id":"83285","width":"800","height":"1422","total_tucao":"1543","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651435_UF8mnjCF8FmZ.26aca_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651435_UF8mnjCF8FmZ.db581_svol.jpg","images":[{"id":"4948148","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526354286_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526646099_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651628_l5gD3yhm5JHy.d3bb4_svol.jpg","image_id":"83286","width":"800","height":"1422","total_tucao":"1696","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651628_l5gD3yhm5JHy.3ef0e_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651628_l5gD3yhm5JHy.d3bb4_svol.jpg","images":[{"id":"4948169","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526861424_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526922391_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651639_u9bS3zRzZ797.e6d60_svol.jpg","image_id":"83287","width":"800","height":"1422","total_tucao":"960","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651639_u9bS3zRzZ797.84db2_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651639_u9bS3zRzZ797.e6d60_svol.jpg","images":[{"id":"4948174","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526613744_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526613180_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651654_PYvy0P6Er32y.2a24b_svol.jpg","image_id":"83288","width":"800","height":"1422","total_tucao":"1368","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651654_PYvy0P6Er32y.026c2_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651654_PYvy0P6Er32y.2a24b_svol.jpg","images":[{"id":"4948180","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526394092_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526512624_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651665_8c8Pz6sBMeZO.6ab11_svol.jpg","image_id":"83289","width":"800","height":"1422","total_tucao":"1720","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651665_8c8Pz6sBMeZO.481fd_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651665_8c8Pz6sBMeZO.6ab11_svol.jpg","images":[{"id":"4948186","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526734550_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526796368_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651711_5wnKVUKsiYAa.bc824_svol.jpg","image_id":"83290","width":"800","height":"1422","total_tucao":"1603","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651711_5wnKVUKsiYAa.47166_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651711_5wnKVUKsiYAa.bc824_svol.jpg","images":[{"id":"4948187","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526580632_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526420839_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651851_b5qOX4IC57Bx.ae624_svol.jpg","image_id":"83291","width":"800","height":"1422","total_tucao":"1025","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651851_b5qOX4IC57Bx.19eb2_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651851_b5qOX4IC57Bx.ae624_svol.jpg","images":[{"id":"4948188","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526679708_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526384821_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651865_e2g8UOGgllGa.55174_svol.jpg","image_id":"83292","width":"800","height":"1422","total_tucao":"881","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651865_e2g8UOGgllGa.90912_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651865_e2g8UOGgllGa.55174_svol.jpg","images":[{"id":"4948189","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526921781_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526933247_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651881_KCCMCCYMVgJ9.45e5a_svol.jpg","image_id":"83293","width":"800","height":"1422","total_tucao":"1584","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651881_KCCMCCYMVgJ9.c02b9_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651881_KCCMCCYMVgJ9.45e5a_svol.jpg","images":[{"id":"4948190","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526842718_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526779520_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651894_445aFz2bxBHN.80c44_svol.jpg","image_id":"83294","width":"800","height":"1422","total_tucao":"5262","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651894_445aFz2bxBHN.02435_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651894_445aFz2bxBHN.80c44_svol.jpg","images":[{"id":"4948191","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526715726_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526229317_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651910_DhMinZZ4E0ei.944e1_svol.jpg","image_id":"83295","width":"800","height":"1422","total_tucao":"1439","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651910_DhMinZZ4E0ei.cfd74_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651910_DhMinZZ4E0ei.944e1_svol.jpg","images":[{"id":"4948192","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526386987_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526135143_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651927_1tei6TbVoiv5.ee0f2_svol.jpg","image_id":"83296","width":"800","height":"1422","total_tucao":"1480","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651927_1tei6TbVoiv5.9b3cb_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651927_1tei6TbVoiv5.ee0f2_svol.jpg","images":[{"id":"4948193","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526792146_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526820957_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651941_5iV5ly557fvr.88ff0_svol.jpg","image_id":"83297","width":"800","height":"1422","total_tucao":"1609","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651941_5iV5ly557fvr.96ccc_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651941_5iV5ly557fvr.88ff0_svol.jpg","images":[{"id":"4948194","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526598003_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526851387_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651955_upalJ5Y5z4k6.b8951_svol.jpg","image_id":"83298","width":"800","height":"1422","total_tucao":"1544","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651955_upalJ5Y5z4k6.18b2a_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651955_upalJ5Y5z4k6.b8951_svol.jpg","images":[{"id":"4948195","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526601661_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526723972_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651971_2bB22aAbOKDO.7c994_svol.jpg","image_id":"83299","width":"800","height":"1422","total_tucao":"963","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651971_2bB22aAbOKDO.82cbb_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651971_2bB22aAbOKDO.7c994_svol.jpg","images":[{"id":"4948196","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526807838_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526836727_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1515651983_dkk31ofFbdxX.e2aa3_svol.jpg","image_id":"91241","width":"800","height":"1422","total_tucao":"1938","webp":"1","type":"0","img05":"http://img6.u17i.com/10/02/3166/mobile/2786_1515651983_dkk31ofFbdxX.ef1be_mobile.jpg","img50":"http://img6.u17i.com/10/02/3166/2786_1515651983_dkk31ofFbdxX.e2aa3_svol.jpg","images":[{"id":"4948197","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526480479_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526664634_webp50.webp"}],"imHeightArr":["1422"]},{"location":"http://img6.u17i.com/10/02/3166/2786_1265128093_rELZLiIEqrM5.a8645_svol.jpg","image_id":"83301","width":"800","height":"1135","total_tucao":"1165","webp":"0","type":"1","img05":"http://img6.u17i.com/10/02/3166/wp/2786_1265128093_rELZLiIEqrM5.666c9_05.jpg","img50":"http://img6.u17i.com/10/02/3166/wp/2786_1265128093_rELZLiIEqrM5.666c9_50.jpg","images":[{"id":"74802","sort":"0","width":"800","height":"1135","img05":"http://img6.u17i.com/10/02/3166/wp/2786_1265128093_rELZLiIEqrM5.666c9_05.jpg","img50":"http://img6.u17i.com/10/02/3166/wp/2786_1265128093_rELZLiIEqrM5.666c9_50.jpg"}],"imHeightArr":["1135"]}]
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

            public static class ImageListBean {
                /**
                 * location : http://img6.u17i.com/10/02/3166/2786_1515651231_jdx40f4I10nn.116d9_svol.jpg
                 * image_id : 83276
                 * width : 800
                 * height : 1422
                 * total_tucao : 2650
                 * webp : 1
                 * type : 0
                 * img05 : http://img6.u17i.com/10/02/3166/mobile/2786_1515651231_jdx40f4I10nn.79bd4_mobile.jpg
                 * img50 : http://img6.u17i.com/10/02/3166/2786_1515651231_jdx40f4I10nn.116d9_svol.jpg
                 * images : [{"id":"4948131","sort":"0","width":"800","height":"1422","img05":"http://img6.u17i.com/10/02/3166/wp/20180111132526729311_webp05.webp","img50":"http://img6.u17i.com/10/02/3166/wp/20180111132526725833_webp50.webp"}]
                 * imHeightArr : ["1422"]
                 */

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
                     * id : 4948131
                     * sort : 0
                     * width : 800
                     * height : 1422
                     * img05 : http://img6.u17i.com/10/02/3166/wp/20180111132526729311_webp05.webp
                     * img50 : http://img6.u17i.com/10/02/3166/wp/20180111132526725833_webp50.webp
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
