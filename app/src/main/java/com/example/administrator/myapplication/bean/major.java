package com.example.administrator.myapplication.bean;

import cn.bmob.v3.BmobObject;

/**
 * Created by daiff on 2018/2/9.
 * for:
 */

public class major extends BmobObject {
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    private String major;
    private String ddd;

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }
}
