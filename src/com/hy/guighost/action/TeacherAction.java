package com.hy.guighost.action;

import com.hy.guighost.entity.ShowYueKeInfo;
import com.hy.guighost.entity.Student;
import com.hy.guighost.entity.Teacher;
import com.hy.guighost.entity.YueKeInfo;
import com.hy.guighost.service.StudentService;
import com.hy.guighost.service.TeacherService;
import com.hy.guighost.service.YueKeService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TeacherAction extends ActionSupport implements ModelDriven<Teacher> {
    private TeacherService teacherService;
    private StudentService studentService;
    private YueKeService yueKeService;
    private Integer teaId;

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public void setYueKeService(YueKeService yueKeService) {
        this.yueKeService = yueKeService;
    }

    private Teacher teacher = new Teacher();
    @Override
    public Teacher getModel() {
        return teacher;
    }

    public void setTeacherService(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public String teacherLogin(){
        Teacher login = teacherService.login(teacher);
        ServletActionContext.getRequest().getSession().setAttribute("teacher",login);
        List<Student> stus = teacherService.findStusById(login.getTea_id());
        ServletActionContext.getRequest().getSession().setAttribute("stus",stus);

        List<YueKeInfo> stuByTeaId = yueKeService.findStuByTeaId(login.getTea_id());
        List<Student> students = new ArrayList<>();
        List<ShowYueKeInfo> showYueKeInfos = new ArrayList<>();
        for (YueKeInfo integer : stuByTeaId) {
            students.add(studentService.findStuById(integer.getStuId()));
        }
        for (Student student : students) {
            ShowYueKeInfo showYueKeInfo = new ShowYueKeInfo();
            showYueKeInfo.setStuName(student.getStuName());
            showYueKeInfo.setTeaMajor(login.getMajor());
            showYueKeInfo.setTeachTime(login.getTeachTime());
            showYueKeInfos.add(showYueKeInfo);
        }

        ServletActionContext.getRequest().getSession().setAttribute("showInfo",showYueKeInfos);
        if(login!=null){
            return SUCCESS;
        }else{
            return ERROR;
        }

    }

    public String list(){
        List<Teacher> teachers = teacherService.frndAllTeacher();
        ServletActionContext.getRequest().getSession().setAttribute("teaList",teachers);
        return "list";
    }

    public String update(){
        Teacher byId = teacherService.findById(teaId);
        ServletActionContext.getRequest().getSession().setAttribute("updTea",byId);
        return "update";
    }

    public String updateSuccess(){
        teacherService.update(teacher);
        List<Teacher> teachers = teacherService.frndAllTeacher();
        ServletActionContext.getRequest().getSession().setAttribute("teaList",teachers);
        return "list";
    }

    public String delete(){
        System.out.println(teaId);
        teacherService.delete(teaId);
        List<Teacher> teachers = teacherService.frndAllTeacher();
        ServletActionContext.getRequest().getSession().setAttribute("teaList",teachers);
        return "list";
    }

    public String save(){
        teacherService.save(teacher);
        return "list";
    }
}
