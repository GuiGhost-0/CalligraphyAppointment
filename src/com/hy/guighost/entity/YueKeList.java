package com.hy.guighost.entity;

import java.util.Date;

public class YueKeList {
    private Integer id;
    private String stuName;
    private String major;
    private String teachTime;
    private String teacher;
    private Date yuyueTime;

    public Date getYuyueTime() {
        return yuyueTime;
    }

    public void setYuyueTime(Date yuyueTime) {
        this.yuyueTime = yuyueTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getTeachTime() {
        return teachTime;
    }

    public void setTeachTime(String teachTime) {
        this.teachTime = teachTime;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "YueKeList{" +
                "id=" + id +
                ", stuName='" + stuName + '\'' +
                ", major='" + major + '\'' +
                ", teachTime='" + teachTime + '\'' +
                ", teacher='" + teacher + '\'' +
                ", yuyueTime=" + yuyueTime +
                '}';
    }
}
