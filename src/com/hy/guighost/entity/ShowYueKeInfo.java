package com.hy.guighost.entity;

public class ShowYueKeInfo {
    private String stuName;
    private String teaMajor;
    private String teachTime;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getTeaMajor() {
        return teaMajor;
    }

    public void setTeaMajor(String teaMajor) {
        this.teaMajor = teaMajor;
    }

    public String getTeachTime() {
        return teachTime;
    }

    public void setTeachTime(String teachTime) {
        this.teachTime = teachTime;
    }

    @Override
    public String toString() {
        return "ShowYueKeInfo{" +
                "stuName='" + stuName + '\'' +
                ", teaMajor='" + teaMajor + '\'' +
                ", teachTime='" + teachTime + '\'' +
                '}';
    }
}
