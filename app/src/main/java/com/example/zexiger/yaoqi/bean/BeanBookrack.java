package com.example.zexiger.yaoqi.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.List;

public class BeanBookrack {

    /**
     * code : 1
     * data : {"stateCode":1,"message":"成功","returnData":{"boyRd":{"percent":92,"comics":[{"comicId":99874,"name":"妖神记（全彩）","cover":"http://cover.u17i.com/2019/04/14550326_1554792353_LZ8l8ccNI5EP.sbig.jpg","chapterCount":361},{"comicId":71064,"name":"斗罗大陆","cover":"http://cover.u17i.com/2019/04/4276398_1555039348_G8ErrccS2fCS.sbig.jpg","chapterCount":471},{"comicId":149716,"name":"锁龙","cover":"http://cover.u17i.com/2017/04/4146390_1493184894_Yz1B62y4zr21.sbig.jpg","chapterCount":113},{"comicId":3166,"name":"镇魂街","cover":"http://cover.u17i.com/2010/11/2786_1290484999_44z22704KDLT.sbig.jpg","chapterCount":266},{"comicId":195,"name":"雏蜂","cover":"http://cover.u17i.com/2017/06/1260_1497244625_ZKc7bCo47OrM.sbig.jpg","chapterCount":283},{"comicId":121836,"name":"驭灵师","cover":"http://cover.u17i.com/2019/04/4486442_1554952889_7Ick43X4SZYB.sbig.jpg","chapterCount":318}]},"girlRd":{"percent":92,"comics":[{"comicId":112879,"name":"今天开始做明星","cover":"http://cover.u17i.com/2019/04/4486442_1556158160_zAtk4EYyl2qz.sbig.jpg","chapterCount":215},{"comicId":125783,"name":"王牌校草","cover":"http://cover.u17i.com/2019/04/13367798_1554271716_FMG86k0Z08j0.sbig.jpg","chapterCount":299},{"comicId":142882,"name":"恋与星途","cover":"http://cover.u17i.com/2018/10/18242498_1540878969_sdh1d65vV6dv.sbig.jpg","chapterCount":201},{"comicId":68109,"name":"蓝翅","cover":"http://cover.u17i.com/2017/03/4177111_1489509484_l8FsH161lxf2.sbig.jpg","chapterCount":337},{"comicId":136225,"name":"追星逐月","cover":"http://cover.u17i.com/2017/09/16737425_1505125937_0jP70z2jf7qK.sbig.jpg","chapterCount":203},{"comicId":3166,"name":"镇魂街","cover":"http://cover.u17i.com/2010/11/2786_1290484999_44z22704KDLT.sbig.jpg","chapterCount":266}]},"favDefault":{"maxNum":5,"comics":[{"comicId":68109,"name":"蓝翅","cover":"http://cover.u17i.com/2017/03/4177111_1489509484_l8FsH161lxf2.sbig.jpg","chapterCount":337},{"comicId":3166,"name":"镇魂街","cover":"http://cover.u17i.com/2010/11/2786_1290484999_44z22704KDLT.sbig.jpg","chapterCount":266},{"comicId":8805,"name":"虎x鹤 妖师录","cover":"http://cover.u17i.com/2014/11/190368_1415172576_VxKFjWIDrphw.sbig.jpg","chapterCount":344},{"comicId":13707,"name":"端脑","cover":"http://cover.u17i.com/2014/10/12647_1413948764_xeZ2KC11sccR.sbig.jpg","chapterCount":240},{"comicId":27107,"name":"球娘","cover":"http://cover.u17i.com/2018/05/996329_1527061301_XQ3xho0NqPxd.sbig.jpg","chapterCount":290},{"comicId":195,"name":"雏蜂","cover":"http://cover.u17i.com/2017/06/1260_1497244625_ZKc7bCo47OrM.sbig.jpg","chapterCount":283},{"comicId":75859,"name":"噬规者","cover":"http://cover.u17i.com/2014/07/4431881_1405044822_6XsM9VnAV7nY.sbig.jpg","chapterCount":244},{"comicId":190,"name":"拜见女皇陛下","cover":"http://cover.u17i.com/2016/11/1213_1478322908_NjjWJwz3DTTd.sbig.jpg","chapterCount":216},{"comicId":5553,"name":"十万个冷笑话","cover":"http://cover.u17i.com/2012/06/29137_1339948555_JdJj99mVGUyu.sbig.jpg","chapterCount":304},{"comicId":142882,"name":"恋与星途","cover":"http://cover.u17i.com/2018/10/18242498_1540878969_sdh1d65vV6dv.sbig.jpg","chapterCount":201}]}}}
     */

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
         * message : 成功
         * returnData : {"boyRd":{"percent":92,"comics":[{"comicId":99874,"name":"妖神记（全彩）","cover":"http://cover.u17i.com/2019/04/14550326_1554792353_LZ8l8ccNI5EP.sbig.jpg","chapterCount":361},{"comicId":71064,"name":"斗罗大陆","cover":"http://cover.u17i.com/2019/04/4276398_1555039348_G8ErrccS2fCS.sbig.jpg","chapterCount":471},{"comicId":149716,"name":"锁龙","cover":"http://cover.u17i.com/2017/04/4146390_1493184894_Yz1B62y4zr21.sbig.jpg","chapterCount":113},{"comicId":3166,"name":"镇魂街","cover":"http://cover.u17i.com/2010/11/2786_1290484999_44z22704KDLT.sbig.jpg","chapterCount":266},{"comicId":195,"name":"雏蜂","cover":"http://cover.u17i.com/2017/06/1260_1497244625_ZKc7bCo47OrM.sbig.jpg","chapterCount":283},{"comicId":121836,"name":"驭灵师","cover":"http://cover.u17i.com/2019/04/4486442_1554952889_7Ick43X4SZYB.sbig.jpg","chapterCount":318}]},"girlRd":{"percent":92,"comics":[{"comicId":112879,"name":"今天开始做明星","cover":"http://cover.u17i.com/2019/04/4486442_1556158160_zAtk4EYyl2qz.sbig.jpg","chapterCount":215},{"comicId":125783,"name":"王牌校草","cover":"http://cover.u17i.com/2019/04/13367798_1554271716_FMG86k0Z08j0.sbig.jpg","chapterCount":299},{"comicId":142882,"name":"恋与星途","cover":"http://cover.u17i.com/2018/10/18242498_1540878969_sdh1d65vV6dv.sbig.jpg","chapterCount":201},{"comicId":68109,"name":"蓝翅","cover":"http://cover.u17i.com/2017/03/4177111_1489509484_l8FsH161lxf2.sbig.jpg","chapterCount":337},{"comicId":136225,"name":"追星逐月","cover":"http://cover.u17i.com/2017/09/16737425_1505125937_0jP70z2jf7qK.sbig.jpg","chapterCount":203},{"comicId":3166,"name":"镇魂街","cover":"http://cover.u17i.com/2010/11/2786_1290484999_44z22704KDLT.sbig.jpg","chapterCount":266}]},"favDefault":{"maxNum":5,"comics":[{"comicId":68109,"name":"蓝翅","cover":"http://cover.u17i.com/2017/03/4177111_1489509484_l8FsH161lxf2.sbig.jpg","chapterCount":337},{"comicId":3166,"name":"镇魂街","cover":"http://cover.u17i.com/2010/11/2786_1290484999_44z22704KDLT.sbig.jpg","chapterCount":266},{"comicId":8805,"name":"虎x鹤 妖师录","cover":"http://cover.u17i.com/2014/11/190368_1415172576_VxKFjWIDrphw.sbig.jpg","chapterCount":344},{"comicId":13707,"name":"端脑","cover":"http://cover.u17i.com/2014/10/12647_1413948764_xeZ2KC11sccR.sbig.jpg","chapterCount":240},{"comicId":27107,"name":"球娘","cover":"http://cover.u17i.com/2018/05/996329_1527061301_XQ3xho0NqPxd.sbig.jpg","chapterCount":290},{"comicId":195,"name":"雏蜂","cover":"http://cover.u17i.com/2017/06/1260_1497244625_ZKc7bCo47OrM.sbig.jpg","chapterCount":283},{"comicId":75859,"name":"噬规者","cover":"http://cover.u17i.com/2014/07/4431881_1405044822_6XsM9VnAV7nY.sbig.jpg","chapterCount":244},{"comicId":190,"name":"拜见女皇陛下","cover":"http://cover.u17i.com/2016/11/1213_1478322908_NjjWJwz3DTTd.sbig.jpg","chapterCount":216},{"comicId":5553,"name":"十万个冷笑话","cover":"http://cover.u17i.com/2012/06/29137_1339948555_JdJj99mVGUyu.sbig.jpg","chapterCount":304},{"comicId":142882,"name":"恋与星途","cover":"http://cover.u17i.com/2018/10/18242498_1540878969_sdh1d65vV6dv.sbig.jpg","chapterCount":201}]}}
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
             * boyRd : {"percent":92,"comics":[{"comicId":99874,"name":"妖神记（全彩）","cover":"http://cover.u17i.com/2019/04/14550326_1554792353_LZ8l8ccNI5EP.sbig.jpg","chapterCount":361},{"comicId":71064,"name":"斗罗大陆","cover":"http://cover.u17i.com/2019/04/4276398_1555039348_G8ErrccS2fCS.sbig.jpg","chapterCount":471},{"comicId":149716,"name":"锁龙","cover":"http://cover.u17i.com/2017/04/4146390_1493184894_Yz1B62y4zr21.sbig.jpg","chapterCount":113},{"comicId":3166,"name":"镇魂街","cover":"http://cover.u17i.com/2010/11/2786_1290484999_44z22704KDLT.sbig.jpg","chapterCount":266},{"comicId":195,"name":"雏蜂","cover":"http://cover.u17i.com/2017/06/1260_1497244625_ZKc7bCo47OrM.sbig.jpg","chapterCount":283},{"comicId":121836,"name":"驭灵师","cover":"http://cover.u17i.com/2019/04/4486442_1554952889_7Ick43X4SZYB.sbig.jpg","chapterCount":318}]}
             * girlRd : {"percent":92,"comics":[{"comicId":112879,"name":"今天开始做明星","cover":"http://cover.u17i.com/2019/04/4486442_1556158160_zAtk4EYyl2qz.sbig.jpg","chapterCount":215},{"comicId":125783,"name":"王牌校草","cover":"http://cover.u17i.com/2019/04/13367798_1554271716_FMG86k0Z08j0.sbig.jpg","chapterCount":299},{"comicId":142882,"name":"恋与星途","cover":"http://cover.u17i.com/2018/10/18242498_1540878969_sdh1d65vV6dv.sbig.jpg","chapterCount":201},{"comicId":68109,"name":"蓝翅","cover":"http://cover.u17i.com/2017/03/4177111_1489509484_l8FsH161lxf2.sbig.jpg","chapterCount":337},{"comicId":136225,"name":"追星逐月","cover":"http://cover.u17i.com/2017/09/16737425_1505125937_0jP70z2jf7qK.sbig.jpg","chapterCount":203},{"comicId":3166,"name":"镇魂街","cover":"http://cover.u17i.com/2010/11/2786_1290484999_44z22704KDLT.sbig.jpg","chapterCount":266}]}
             * favDefault : {"maxNum":5,"comics":[{"comicId":68109,"name":"蓝翅","cover":"http://cover.u17i.com/2017/03/4177111_1489509484_l8FsH161lxf2.sbig.jpg","chapterCount":337},{"comicId":3166,"name":"镇魂街","cover":"http://cover.u17i.com/2010/11/2786_1290484999_44z22704KDLT.sbig.jpg","chapterCount":266},{"comicId":8805,"name":"虎x鹤 妖师录","cover":"http://cover.u17i.com/2014/11/190368_1415172576_VxKFjWIDrphw.sbig.jpg","chapterCount":344},{"comicId":13707,"name":"端脑","cover":"http://cover.u17i.com/2014/10/12647_1413948764_xeZ2KC11sccR.sbig.jpg","chapterCount":240},{"comicId":27107,"name":"球娘","cover":"http://cover.u17i.com/2018/05/996329_1527061301_XQ3xho0NqPxd.sbig.jpg","chapterCount":290},{"comicId":195,"name":"雏蜂","cover":"http://cover.u17i.com/2017/06/1260_1497244625_ZKc7bCo47OrM.sbig.jpg","chapterCount":283},{"comicId":75859,"name":"噬规者","cover":"http://cover.u17i.com/2014/07/4431881_1405044822_6XsM9VnAV7nY.sbig.jpg","chapterCount":244},{"comicId":190,"name":"拜见女皇陛下","cover":"http://cover.u17i.com/2016/11/1213_1478322908_NjjWJwz3DTTd.sbig.jpg","chapterCount":216},{"comicId":5553,"name":"十万个冷笑话","cover":"http://cover.u17i.com/2012/06/29137_1339948555_JdJj99mVGUyu.sbig.jpg","chapterCount":304},{"comicId":142882,"name":"恋与星途","cover":"http://cover.u17i.com/2018/10/18242498_1540878969_sdh1d65vV6dv.sbig.jpg","chapterCount":201}]}
             */

            private BoyRdBean boyRd;
            private GirlRdBean girlRd;
            private FavDefaultBean favDefault;

            public BoyRdBean getBoyRd() {
                return boyRd;
            }

            public void setBoyRd(BoyRdBean boyRd) {
                this.boyRd = boyRd;
            }

            public GirlRdBean getGirlRd() {
                return girlRd;
            }

            public void setGirlRd(GirlRdBean girlRd) {
                this.girlRd = girlRd;
            }

            public FavDefaultBean getFavDefault() {
                return favDefault;
            }

            public void setFavDefault(FavDefaultBean favDefault) {
                this.favDefault = favDefault;
            }

            public static class BoyRdBean {
                /**
                 * percent : 92
                 * comics : [{"comicId":99874,"name":"妖神记（全彩）","cover":"http://cover.u17i.com/2019/04/14550326_1554792353_LZ8l8ccNI5EP.sbig.jpg","chapterCount":361},{"comicId":71064,"name":"斗罗大陆","cover":"http://cover.u17i.com/2019/04/4276398_1555039348_G8ErrccS2fCS.sbig.jpg","chapterCount":471},{"comicId":149716,"name":"锁龙","cover":"http://cover.u17i.com/2017/04/4146390_1493184894_Yz1B62y4zr21.sbig.jpg","chapterCount":113},{"comicId":3166,"name":"镇魂街","cover":"http://cover.u17i.com/2010/11/2786_1290484999_44z22704KDLT.sbig.jpg","chapterCount":266},{"comicId":195,"name":"雏蜂","cover":"http://cover.u17i.com/2017/06/1260_1497244625_ZKc7bCo47OrM.sbig.jpg","chapterCount":283},{"comicId":121836,"name":"驭灵师","cover":"http://cover.u17i.com/2019/04/4486442_1554952889_7Ick43X4SZYB.sbig.jpg","chapterCount":318}]
                 */

                private int percent;
                private List<ComicsBean> comics;

                public int getPercent() {
                    return percent;
                }

                public void setPercent(int percent) {
                    this.percent = percent;
                }

                public List<ComicsBean> getComics() {
                    return comics;
                }

                public void setComics(List<ComicsBean> comics) {
                    this.comics = comics;
                }

                public static class ComicsBean {
                    /**
                     * comicId : 99874
                     * name : 妖神记（全彩）
                     * cover : http://cover.u17i.com/2019/04/14550326_1554792353_LZ8l8ccNI5EP.sbig.jpg
                     * chapterCount : 361
                     */

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

            public static class GirlRdBean {
                /**
                 * percent : 92
                 * comics : [{"comicId":112879,"name":"今天开始做明星","cover":"http://cover.u17i.com/2019/04/4486442_1556158160_zAtk4EYyl2qz.sbig.jpg","chapterCount":215},{"comicId":125783,"name":"王牌校草","cover":"http://cover.u17i.com/2019/04/13367798_1554271716_FMG86k0Z08j0.sbig.jpg","chapterCount":299},{"comicId":142882,"name":"恋与星途","cover":"http://cover.u17i.com/2018/10/18242498_1540878969_sdh1d65vV6dv.sbig.jpg","chapterCount":201},{"comicId":68109,"name":"蓝翅","cover":"http://cover.u17i.com/2017/03/4177111_1489509484_l8FsH161lxf2.sbig.jpg","chapterCount":337},{"comicId":136225,"name":"追星逐月","cover":"http://cover.u17i.com/2017/09/16737425_1505125937_0jP70z2jf7qK.sbig.jpg","chapterCount":203},{"comicId":3166,"name":"镇魂街","cover":"http://cover.u17i.com/2010/11/2786_1290484999_44z22704KDLT.sbig.jpg","chapterCount":266}]
                 */

                private int percent;
                private List<ComicsBeanX> comics;

                public int getPercent() {
                    return percent;
                }

                public void setPercent(int percent) {
                    this.percent = percent;
                }

                public List<ComicsBeanX> getComics() {
                    return comics;
                }

                public void setComics(List<ComicsBeanX> comics) {
                    this.comics = comics;
                }

                public static class ComicsBeanX {
                    /**
                     * comicId : 112879
                     * name : 今天开始做明星
                     * cover : http://cover.u17i.com/2019/04/4486442_1556158160_zAtk4EYyl2qz.sbig.jpg
                     * chapterCount : 215
                     */

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

            public static class FavDefaultBean {
                /**
                 * maxNum : 5
                 * comics : [{"comicId":68109,"name":"蓝翅","cover":"http://cover.u17i.com/2017/03/4177111_1489509484_l8FsH161lxf2.sbig.jpg","chapterCount":337},{"comicId":3166,"name":"镇魂街","cover":"http://cover.u17i.com/2010/11/2786_1290484999_44z22704KDLT.sbig.jpg","chapterCount":266},{"comicId":8805,"name":"虎x鹤 妖师录","cover":"http://cover.u17i.com/2014/11/190368_1415172576_VxKFjWIDrphw.sbig.jpg","chapterCount":344},{"comicId":13707,"name":"端脑","cover":"http://cover.u17i.com/2014/10/12647_1413948764_xeZ2KC11sccR.sbig.jpg","chapterCount":240},{"comicId":27107,"name":"球娘","cover":"http://cover.u17i.com/2018/05/996329_1527061301_XQ3xho0NqPxd.sbig.jpg","chapterCount":290},{"comicId":195,"name":"雏蜂","cover":"http://cover.u17i.com/2017/06/1260_1497244625_ZKc7bCo47OrM.sbig.jpg","chapterCount":283},{"comicId":75859,"name":"噬规者","cover":"http://cover.u17i.com/2014/07/4431881_1405044822_6XsM9VnAV7nY.sbig.jpg","chapterCount":244},{"comicId":190,"name":"拜见女皇陛下","cover":"http://cover.u17i.com/2016/11/1213_1478322908_NjjWJwz3DTTd.sbig.jpg","chapterCount":216},{"comicId":5553,"name":"十万个冷笑话","cover":"http://cover.u17i.com/2012/06/29137_1339948555_JdJj99mVGUyu.sbig.jpg","chapterCount":304},{"comicId":142882,"name":"恋与星途","cover":"http://cover.u17i.com/2018/10/18242498_1540878969_sdh1d65vV6dv.sbig.jpg","chapterCount":201}]
                 */

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

                public static class ComicsBeanXX implements MultiItemEntity {
                    /**
                     * comicId : 68109
                     * name : 蓝翅
                     * cover : http://cover.u17i.com/2017/03/4177111_1489509484_l8FsH161lxf2.sbig.jpg
                     * chapterCount : 337
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
