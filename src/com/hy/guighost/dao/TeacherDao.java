package com.hy.guighost.dao;

import com.hy.guighost.entity.Student;
import com.hy.guighost.entity.Teacher;

import java.util.List;

public interface TeacherDao {
    Teacher login(Teacher teacher);
    List<Student> findStusById(Integer id);
    List<Teacher> findAllTeacher();
    Teacher findById(Integer id);
    void update(Teacher teacher);
    void delete(Integer id);


    void save(Teacher teacher);
}
