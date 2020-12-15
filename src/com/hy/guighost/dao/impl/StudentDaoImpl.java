package com.hy.guighost.dao.impl;

import com.hy.guighost.dao.StudentDao;
import com.hy.guighost.entity.Student;
import com.hy.guighost.entity.Teacher;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;


public class StudentDaoImpl implements StudentDao {
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public Student login(Student student) {
        List<Student> students = (List<Student>) hibernateTemplate.find("from Student where stuName=?0 and stuPassword=?1", student.getStuName(), student.getStuPassword());
        if(students.size() != 0 && students != null){
            Student student1 = students.get(0);
            return student1;
        }
        return null;
    }
    @Override
    public Student findStuById(Integer id) {
        return hibernateTemplate.get(Student.class,id);
    }
    @Override
    public List<Student> findAllStu() {
        List<Student> students = (List<Student>) hibernateTemplate.find("from Student");
        return students;
    }
    @Override
    public void update(Student student) {
        hibernateTemplate.update(student);
    }
    @Override
    public void delete(Integer id) {
        hibernateTemplate.delete(hibernateTemplate.get(Student.class,id));
    }
    @Override
    public void save(Student student) {
        hibernateTemplate.save(student);
    }
}
