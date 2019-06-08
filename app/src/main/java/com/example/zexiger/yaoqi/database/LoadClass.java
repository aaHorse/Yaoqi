package com.example.zexiger.yaoqi.database;

import org.litepal.crud.DataSupport;

public class LoadClass extends DataSupport {
    private String comic_id;
    private String chapter_id;
    private String name;//章节的名字
    private String address;//章节压缩包对应的信息描述,是一个规整的字符串，在取出时转为数组

    public String getComic_id() {
        return comic_id;
    }

    public void setComic_id(String comic_id) {
        this.comic_id = comic_id;
    }

    public String getChapter_id() {
        return chapter_id;
    }

    public void setChapter_id(String chapter_id) {
        this.chapter_id = chapter_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
