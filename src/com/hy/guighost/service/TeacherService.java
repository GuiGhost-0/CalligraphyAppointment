package com.hy.guighost.service;

import com.hy.guighost.entity.Student;
import com.hy.guighost.entity.Teacher;

import java.util.List;

public interface TeacherService {
    Teacher login(Teacher teacher);
    List<Student> findStusById(Integer id);
    List<Teacher> frndAllTeacher();
    Teacher findById(Integer id);
    void update(Teacher teacher);
    void delete(Integer id);
    void save(Teacher teacher);
}
