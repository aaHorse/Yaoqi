package com.example.zexiger.yaoqi.database;

import org.litepal.crud.DataSupport;

public class InitClass extends DataSupport {
    private Boolean isLogin;

    public Boolean getLogin() {
        return isLogin;
    }

    public void setLogin(Boolean login) {
        isLogin = login;
    }
}
