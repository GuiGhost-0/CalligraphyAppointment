package com.hy.guighost.service.impl;

import com.hy.guighost.dao.StudentDao;
import com.hy.guighost.entity.Student;
import com.hy.guighost.entity.Teacher;
import com.hy.guighost.service.StudentService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public Student login(Student student) {
        return studentDao.login(student);
    }

    @Override
    public Student findStuById(Integer id) {
        return studentDao.findStuById(id);
    }

    @Override
    public List<Student> findAllStu() {
        return studentDao.findAllStu();
    }

    @Override
    public void update(Student student) {
        studentDao.update(student);
    }

    @Override
    public void delete(Integer id) {
        studentDao.delete(id);
    }

    @Override
    public void save(Student student) {
        studentDao.save(student);
    }
}
