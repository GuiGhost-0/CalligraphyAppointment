package com.hy.guighost.dao.impl;

import com.hy.guighost.dao.AdminDao;
import com.hy.guighost.entity.Admin;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

public class AdminDaoImpl implements AdminDao {
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public Admin login(Admin admin) {
        List<Admin> admins = (List<Admin>) hibernateTemplate.find
                ("from Admin where adminName=?0 and adminPassword=?1",
                        admin.getAdminName(), admin.getAdminPassword());
        if (admins != null && admins.size() != 0) {
            Admin u = admins.get(0);
            return u;
        }
        return null;
    }

    @Override
    public Admin getById(Integer aid) {
        List<Admin> admins = (List<Admin>) hibernateTemplate.find("from Admin where a_id=?0", aid);
        if (admins != null && admins.size() != 0) {
            Admin u = admins.get(0);
            return u;
        }
        return null;
    }

    @Override
    public void updateAdmin(Admin admin) {
        hibernateTemplate.update(admin);
    }

    @Override
    public void saveAdmin(Admin admin) {
        hibernateTemplate.save(admin);
    }

}