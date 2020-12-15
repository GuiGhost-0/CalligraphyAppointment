package com.hy.guighost.dao.impl;

import com.hy.guighost.dao.TeacherDao;
import com.hy.guighost.entity.Student;
import com.hy.guighost.entity.Teacher;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

public class TeacherDaoImpl implements TeacherDao {
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public Teacher login(Teacher teacher) {
        List<Teacher> teachers = (List<Teacher>) hibernateTemplate.find("from Teacher where teaName=?0 and teaPassword=?1", teacher.getTeaName(), teacher.getTeaPassword());
        if(teachers.size() != 0 && teachers != null){
            Teacher teach = teachers.get(0);
            return teach;
        }
        return null;
    }

    @Override
    public List<Student> findStusById(Integer id) {
        List<Student> students = (List<Student>) hibernateTemplate.find("from Student where teacher.tea_id =?0", id);
        return students;
    }

    @Override
    public List<Teacher> findAllTeacher() {
        List<Teacher> teachers = (List<Teacher>) hibernateTemplate.find("from Teacher");
        return teachers;
    }

    @Override
    public Teacher findById(Integer id) {
        Teacher teacher = hibernateTemplate.get(Teacher.class, id);
        return teacher;
    }

    @Override
    public void update(Teacher teacher) {
        hibernateTemplate.update(teacher);
    }

    @Override
    public void delete(Integer id) {
        hibernateTemplate.delete(hibernateTemplate.get(Teacher.class,id));
    }

    @Override
    public void save(Teacher teacher) {
        hibernateTemplate.save(teacher);
    }
}
