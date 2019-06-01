package com.example.zexiger.yaoqi.database;

import org.litepal.crud.DataSupport;

public class LoadClass extends DataSupport {
    private String comic_id;
    private String chapter_id;

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

}
