package com.hy.guighost.service;

import com.hy.guighost.entity.Admin;

public interface AdminService {
    Admin login(Admin admin);
    Admin getById(Integer aid);
    void updateAdmin(Admin admin);
    void saveAdmin(Admin admin);
}
