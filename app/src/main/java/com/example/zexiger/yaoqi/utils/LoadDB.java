package com.example.zexiger.yaoqi.utils;

import com.example.zexiger.yaoqi.database.LoadClass;

import java.util.List;

public class LoadDB {
    /*
    * LoadClass的所有操作都写在这里
    * */

    //增
    public static void add(LoadClass obj){
        obj.save();
    }

    //查
    public static List<LoadClass> query()
}
