package com.example.zexiger.yaoqi.database;

import org.litepal.crud.DataSupport;

public class UpdateClass extends DataSupport {
    private String comic_id;
    private String last_update_time;
    private String name;

    public String getComic_id() {
        return comic_id;
    }

    public void setComic_id(String comic_id) {
        this.comic_id = comic_id;
    }

    public String getLast_update_time() {
        return last_update_time;
    }

    public void setLast_update_time(String last_update_time) {
        this.last_update_time = last_update_time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
