package com.example.administrator.myapplication.bean;

import cn.bmob.v3.BmobObject;

/**
 * Created by daiff on 2018/2/9.
 * for:
 */

public class semester extends BmobObject {
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    private  String semester;
}
