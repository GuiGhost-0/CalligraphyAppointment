package com.hy.guighost.service.impl;

import com.hy.guighost.dao.YueKeDao;
import com.hy.guighost.entity.YueKeInfo;
import com.hy.guighost.service.YueKeService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class YueKeServiceImpl implements YueKeService {
    private YueKeDao yueKeDao;

    public void setYueKeDao(YueKeDao yueKeDao) {
        this.yueKeDao = yueKeDao;
    }

    @Override
    public void addYueKeInfo(YueKeInfo yueKeInfo) {
        yueKeDao.addYueKeInfo(yueKeInfo);
    }

    @Override
    public List<YueKeInfo> findAllInfo() {
        return yueKeDao.findAllInfo();
    }

    @Override
    public List<YueKeInfo> findStuByTeaId(Integer id) {
        return yueKeDao.findStuByTeaId(id);
    }
}
