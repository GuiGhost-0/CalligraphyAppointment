package com.hy.guighost.entity;

import javax.persistence.*;
import java.util.Set;
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tea_id;
    private String teaName;
    private String teaPassword;
    private String teachTime;
    private String major;
    @OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
    @JoinColumn(name = "tea_id")
    private Set<Student> stuSet;

    public Integer getTea_id() {
        return tea_id;
    }

    public void setTea_id(Integer tea_id) {
        this.tea_id = tea_id;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    public String getTeaPassword() {
        return teaPassword;
    }

    public void setTeaPassword(String teaPassword) {
        this.teaPassword = teaPassword;
    }

    public String getTeachTime() {
        return teachTime;
    }

    public void setTeachTime(String teachTime) {
        this.teachTime = teachTime;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Set<Student> getStuSet() {
        return stuSet;
    }

    public void setStuSet(Set<Student> stuSet) {
        this.stuSet = stuSet;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tea_id=" + tea_id +
                ", teaName='" + teaName + '\'' +
                ", teachTime='" + teachTime + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
