package com.hy.guighost.service.impl;

import com.hy.guighost.dao.AdminDao;
import com.hy.guighost.entity.Admin;
import com.hy.guighost.service.AdminService;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class AdminServiceImpl implements AdminService {
    private AdminDao adminDao;

    public void setAdminDao(AdminDao adminDao) {
        this.adminDao = adminDao;
    }

    @Override
    public Admin login(Admin admin) {
        return adminDao.login(admin);
    }
}
