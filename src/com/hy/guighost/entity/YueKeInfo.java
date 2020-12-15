package com.hy.guighost.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
public class YueKeInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer yk_id;
    private Integer teaId;
    private Integer stuId;
    private Date time;

    public Integer getYk_id() {
        return yk_id;
    }

    public void setYk_id(Integer yk_id) {
        this.yk_id = yk_id;
    }

    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "YueKeInfo{" +
                "yk_id=" + yk_id +
                ", teaId=" + teaId +
                ", stuId=" + stuId +
                ", time=" + time +
                '}';
    }
}
