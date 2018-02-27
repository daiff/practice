package com.example.administrator.myapplication.bean;

import cn.bmob.v3.BmobObject;

/**
 * Created by daiff on 2018/2/9.
 * for:
 */

public class grade extends BmobObject {
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    private  String grade;
}
