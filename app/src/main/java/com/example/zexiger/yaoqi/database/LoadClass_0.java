package com.example.zexiger.yaoqi.database;

import org.litepal.crud.DataSupport;

public class LoadClass_0 extends DataSupport {
    private String comic_id;
    private String name;
    private String author;
    private String cover_address;

    public String getComic_id() {
        return comic_id;
    }

    public void setComic_id(String comic_id) {
        this.comic_id = comic_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCover_address() {
        return cover_address;
    }

    public void setCover_address(String cover_address) {
        this.cover_address = cover_address;
    }
}
