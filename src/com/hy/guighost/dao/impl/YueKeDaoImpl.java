package com.hy.guighost.dao.impl;

import com.hy.guighost.dao.YueKeDao;
import com.hy.guighost.entity.YueKeInfo;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

public class YueKeDaoImpl implements YueKeDao {
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public void addYueKeInfo(YueKeInfo yueKeInfo) {
        hibernateTemplate.save(yueKeInfo);
    }

    @Override
    public List<YueKeInfo> findAllInfo() {
        List<YueKeInfo> yueKeInfo = (List<YueKeInfo>) hibernateTemplate.find("from YueKeInfo");
        return yueKeInfo;
    }

    @Override
    public List<YueKeInfo> findStuByTeaId(Integer id) {
        System.out.println(id);
        List<YueKeInfo> objects = (List<YueKeInfo>) hibernateTemplate.find("from YueKeInfo where teaId=?0", id);
        return objects;
    }

}
