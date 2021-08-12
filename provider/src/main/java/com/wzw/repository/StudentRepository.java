package com.wzw.repository;

import com.wzw.entity.Student;

import java.util.Collection;

/**
 * @author wei
 * @Date 2021/8/12
 */
public interface StudentRepository {

    public Collection<Student> findAll();
    public Student findById(Integer id);
    public void saveOrUpdate(Student student);
    public void deleteById(Integer id);
}
