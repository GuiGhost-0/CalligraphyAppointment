package com.hy.guighost.dao;

import com.hy.guighost.entity.YueKeInfo;

import java.util.List;

public interface YueKeDao {
    void addYueKeInfo(YueKeInfo yueKeInfo);
    List<YueKeInfo> findAllInfo();
    List<YueKeInfo> findStuByTeaId(Integer id);
}
