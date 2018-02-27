package com.example.administrator.myapplication.bean;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.BmobUser;

/**
 * Created by daiff on 2018/2/9.
 * for:
 */

public class Schedule extends BmobObject {
    private BmobUser user;
    private major major;
    private course course;
    private grade grade;
    private  semester semester;
    private classes classes;

    public com.example.administrator.myapplication.bean.classes getClasses() {
        return classes;
    }

    public void setClasses(com.example.administrator.myapplication.bean.classes classes) {
        this.classes = classes;
    }

    public com.example.administrator.myapplication.bean.semester getSemester() {
        return semester;
    }

    public void setSemester(com.example.administrator.myapplication.bean.semester semester) {
        this.semester = semester;
    }

    public com.example.administrator.myapplication.bean.grade getGrade() {
        return grade;
    }

    public void setGrade(com.example.administrator.myapplication.bean.grade grade) {
        this.grade = grade;
    }

    public com.example.administrator.myapplication.bean.course getCourse() {
        return course;
    }

    public void setCourse(com.example.administrator.myapplication.bean.course course) {
        this.course = course;
    }

    public com.example.administrator.myapplication.bean.major getMajor() {
        return major;
    }

    public void setMajor(com.example.administrator.myapplication.bean.major major) {
        this.major = major;
    }

    public BmobUser getUser() {
        return user;
    }

    public void setUser(BmobUser user) {
        this.user = user;
    }


}
