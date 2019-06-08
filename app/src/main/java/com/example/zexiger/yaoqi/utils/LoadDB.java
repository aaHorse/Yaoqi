package com.example.zexiger.yaoqi.utils;

import com.example.zexiger.yaoqi.database.LoadClass_0;

import org.litepal.crud.DataSupport;

import java.util.List;

public class LoadDB {
    /*
    * LoadClass_0的所有操作都写在这里
    * */

    //增
    public static void add(LoadClass_0 obj){
        obj.save();
    }

    //查
    public static List<LoadClass_0> query(){
        return DataSupport.findAll(LoadClass_0.class);
    }

    //查
    public static List<LoadClass_0> query(String str){
        return DataSupport.where("comic_id = ?",str).find(LoadClass_0.class);
    }
}
