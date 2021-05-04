package com.hy.guighost.action;

import com.hy.guighost.entity.Admin;
import com.hy.guighost.service.AdminService;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;
import java.io.Serializable;

public class MainAction extends ActionSupport implements ModelDriven<Admin> {
    private AdminService adminService;
    private Integer adminId;
    private String againPwd;


    public String getAgainPwd() {
        return againPwd;
    }

    public void setAgainPwd(String againPwd) {
        this.againPwd = againPwd;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

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
            ServletActionContext.getRequest().getSession().setAttribute("msg","用户名或密码错误");
            return ERROR;
        }
    }

    public String adminLogout(){
        ServletActionContext.getRequest().getSession().removeAttribute("admin");
        ActionContext.getContext().getSession().clear();
        ServletActionContext.getRequest().getSession().setAttribute("msg",null);
        return "logout";
    }

    public String toAdminManage(){
        Admin byId = adminService.getById(adminId);
        ServletActionContext.getRequest().getSession().setAttribute("adminMana",byId);
        return "adminmanage";
    }

    public String updateAdmin(){
        admin.setAdminPassword(againPwd);
        adminService.updateAdmin(admin);
        Admin byId = adminService.getById(admin.getA_id());
        ServletActionContext.getRequest().getSession().setAttribute("admin",byId);
        return "updsuccess";
    }

    public String toAddAdminManage(){
        Admin byId = adminService.getById(adminId);
        ServletActionContext.getRequest().getSession().setAttribute("admin",byId);
        return "toAddAdmin";
    }

    public String saveAdmin(){
        adminService.saveAdmin(admin);
        return SUCCESS;
    }

    public String toIndex(){
        ActionContext.getContext().getSession().clear();
        return "index";
    }
}
