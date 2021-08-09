package com.prithila.studentdatabase.service;

import com.prithila.studentdatabase.model.Student;
import com.prithila.studentdatabase.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Prithila
 * @since 8/9/2021
 */

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    @Transactional(transactionManager = "txManager")
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    @Transactional(transactionManager = "txManager")
    public void update(Student student) {
        studentRepository.update(student);
    }

    @Override
    @Transactional(transactionManager = "txManager")
    public void delete(String id) {
        studentRepository.delete(id);

    }

    @Override
    @Transactional(transactionManager = "txManager")
    public Student findStudent(String id) {
        return studentRepository.findStudent(id);
    }

    @Override
    @Transactional(transactionManager = "txManager")
    public List<Student> findAllStudent() {
        return studentRepository.findAllStudent();
    }
}
