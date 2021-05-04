package com.hy.guighost.dao;

import com.hy.guighost.entity.Admin;

public interface AdminDao {
    Admin login(Admin admin);
    Admin getById(Integer aid);
    void updateAdmin(Admin admin);
    void saveAdmin(Admin admin);
}
