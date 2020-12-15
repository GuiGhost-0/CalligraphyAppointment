package com.hy.guighost.action;

import com.hy.guighost.entity.Admin;
import com.hy.guighost.service.AdminService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;
import java.io.Serializable;

public class MainAction extends ActionSupport implements ModelDriven<Admin> {
    private AdminService adminService;

    public void setAdminService(AdminService adminService) {
        this.adminService = adminService;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    private Admin admin = new Admin();
    @Override
    public Admin getModel() {
        return admin;
    }

    public String adminLogin(){
        Admin login = adminService.login(admin);
        if(login!=null){
            ServletActionContext.getRequest().getSession().setAttribute("admin",login);
            return SUCCESS;
        }else{
            return ERROR;
        }
    }

    public String adminLogout(){
        ServletActionContext.getRequest().getSession().removeAttribute("admin");
        ActionContext.getContext().getSession().clear();
        return "logout";
    }
}
