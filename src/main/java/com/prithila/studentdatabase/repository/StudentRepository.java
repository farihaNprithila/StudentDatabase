package com.prithila.studentdatabase.repository;

import com.prithila.studentdatabase.model.Student;

import java.util.List;

/**
 * @author Prithila
 * @since 8/9/2021
 */

public interface StudentRepository {

    void save(Student student);

    void update(Student student);

    void delete(String id);

    Student findStudent(String id);

    List<Student> findAllStudent();
}
