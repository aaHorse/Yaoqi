package com.example.zexiger.yaoqi.database;

import org.litepal.crud.DataSupport;

public class InitClass extends DataSupport {
    private String key;
    private boolean isLogin;
    private int posture;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public boolean isLogin() {
        return isLogin;
    }

    public void setLogin(boolean login) {
        isLogin = login;
    }

    public int getPosture() {
        return posture;
    }

    public void setPosture(int posture) {
        this.posture = posture;
    }
}
