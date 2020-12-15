package com.hy.guighost.service;

import com.hy.guighost.entity.YueKeInfo;

import java.util.List;

public interface YueKeService {
    void addYueKeInfo(YueKeInfo yueKeInfo);
    List<YueKeInfo> findAllInfo();
    List<YueKeInfo> findStuByTeaId(Integer id);
}
