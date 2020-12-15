package com.hy.guighost.dao;

import com.hy.guighost.entity.Student;
import com.hy.guighost.entity.Teacher;

import java.util.List;

public interface StudentDao {
    Student login(Student student);
    Student findStuById(Integer id);
    List<Student> findAllStu();

    void update(Student student);
    void delete(Integer id);

    void save(Student student);
}
