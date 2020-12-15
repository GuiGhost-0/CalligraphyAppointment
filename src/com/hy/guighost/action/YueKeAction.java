package com.hy.guighost.action;

import com.hy.guighost.entity.Student;
import com.hy.guighost.entity.Teacher;
import com.hy.guighost.entity.YueKeInfo;
import com.hy.guighost.entity.YueKeList;
import com.hy.guighost.service.StudentService;
import com.hy.guighost.service.TeacherService;
import com.hy.guighost.service.YueKeService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YueKeAction extends ActionSupport {
    private Integer teaId;
    private Integer stuId;
    private YueKeService yueKeService;
    private StudentService studentService;
    private TeacherService teacherService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public void setTeacherService(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    public void setYueKeService(YueKeService yueKeService) {
        this.yueKeService = yueKeService;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String test(){
        YueKeInfo yueKeInfo = new YueKeInfo();
        yueKeInfo.setStuId(stuId);
        yueKeInfo.setTeaId(teaId);
        yueKeInfo.setTime(new Date());
        yueKeService.addYueKeInfo(yueKeInfo);
        System.out.println(yueKeInfo);
        return NONE;
    }

    public String list(){
        List<YueKeInfo> allInfo = yueKeService.findAllInfo();
        List<YueKeList> yueKeLists = new ArrayList<>();
        for (YueKeInfo yueKeInfo : allInfo) {
            YueKeList yueKeList = new YueKeList();
            Teacher tea = teacherService.findById(yueKeInfo.getTeaId());
            Student stu = studentService.findStuById(yueKeInfo.getStuId());
            yueKeList.setId(yueKeInfo.getYk_id());
            yueKeList.setStuName(stu.getStuName());
            yueKeList.setMajor(tea.getMajor());
            yueKeList.setTeachTime(tea.getTeachTime());
            yueKeList.setTeacher(tea.getTeaName());
            yueKeList.setYuyueTime(yueKeInfo.getTime());
            yueKeLists.add(yueKeList);
        }
        ServletActionContext.getRequest().getSession().setAttribute("yuekelist",yueKeLists);
        return "list";
    }
}
