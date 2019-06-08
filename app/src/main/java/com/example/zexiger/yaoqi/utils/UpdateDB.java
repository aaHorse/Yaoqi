package com.example.zexiger.yaoqi.utils;

import com.example.zexiger.yaoqi.database.UpdateClass;

import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.List;

public class UpdateDB {
    /*
    * 对UpdateClass数据库的增删改查操作，都写在这里
    * */

    //增
    public static void add(UpdateClass obj){
        obj.save();
    }

    //查,comic_id对应的章节是否已经更新
    public static boolean query(UpdateClass obj){
         List<UpdateClass> lists =DataSupport.where("comic_id = ?",
                obj.getComic_id()).find(UpdateClass.class);
         if(lists!=null&&lists.size()>0){
             UpdateClass updateClass=lists.get(lists.size()-1);//取最后更新的，防止出现重复
             int a=Integer.parseInt(updateClass.getLast_update_time());
             int b=Integer.parseInt(obj.getLast_update_time());
             if(b>a){
                 update(obj);
                 return true;
             }
         }
         return false;
    }

    //改，对应的更新信息通知只提醒一次
    public static boolean update(UpdateClass obj){
        obj.updateAll("comic_id = ?",obj.getComic_id());
        return true;
    }
}
