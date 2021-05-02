package com.hy.guighost.action;

import com.hy.guighost.entity.Student;
import com.hy.guighost.entity.Teacher;
import com.hy.guighost.service.StudentService;
import com.hy.guighost.service.TeacherService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;

import java.util.List;

public class StudentAction extends ActionSupport implements ModelDriven<Student> {
    private StudentService studentService;
    private TeacherService teacherService;
    private Integer stuId;

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public void setTeacherService(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    private Student student = new Student();

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public Student getModel() {
        return student;
    }

    public String login(){
        Student login = studentService.login(student);
        List<Teacher> teachers = teacherService.frndAllTeacher();
        ServletActionContext.getRequest().getSession().setAttribute("student",login);
        ServletActionContext.getRequest().getSession().setAttribute("teachers",teachers);
        return SUCCESS;
    }
    public String list(){
        List<Student> allStu = studentService.findAllStu();
        ServletActionContext.getRequest().getSession().setAttribute("stus",allStu);
        return "list";
    }

    public String updatePage(){
        Student stuById = studentService.findStuById(stuId);
        ServletActionContext.getRequest().getSession().setAttribute("updStu",stuById);
        return "update";
    }

    public String updateSuccess(){
        studentService.update(student);
        List<Student> allStu = studentService.findAllStu();
        ServletActionContext.getRequest().getSession().setAttribute("stus",allStu);
        return "list";
    }

    public String save(){
        studentService.save(student);
        List<Student> allStu = studentService.findAllStu();
        ServletActionContext.getRequest().getSession().setAttribute("stus",allStu);
        return "list";
    }

    public String delete(){
        studentService.delete(stuId);
        List<Student> allStu = studentService.findAllStu();
        ServletActionContext.getRequest().getSession().setAttribute("stus",allStu);
        return "list";
    }
}
