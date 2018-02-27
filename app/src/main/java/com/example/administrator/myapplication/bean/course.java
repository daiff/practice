package com.example.administrator.myapplication.bean;

import cn.bmob.v3.BmobObject;

/**
 * Created by daiff on 2018/2/9.
 * for:
 */

public class course extends BmobObject {
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    private  String course;
}
