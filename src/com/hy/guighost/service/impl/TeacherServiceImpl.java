package com.hy.guighost.service.impl;


import com.hy.guighost.dao.TeacherDao;
import com.hy.guighost.entity.Student;
import com.hy.guighost.entity.Teacher;
import com.hy.guighost.service.TeacherService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public class TeacherServiceImpl implements TeacherService {
    private TeacherDao teacherDao;

    public void setTeacherDao(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public Teacher login(Teacher teacher) {
        return teacherDao.login(teacher);
    }

    @Override
    public List<Student> findStusById(Integer id) {
        return teacherDao.findStusById(id);
    }

    @Override
    public List<Teacher> frndAllTeacher() {
        return teacherDao.findAllTeacher();
    }

    @Override
    public Teacher findById(Integer id) {
        return teacherDao.findById(id);
    }

    @Override
    public void update(Teacher teacher) {
        teacherDao.update(teacher);
    }

    @Override
    public void delete(Integer id) {
        teacherDao.delete(id);
    }

    @Override
    public void save(Teacher teacher) {
        teacherDao.save(teacher);
    }
}
