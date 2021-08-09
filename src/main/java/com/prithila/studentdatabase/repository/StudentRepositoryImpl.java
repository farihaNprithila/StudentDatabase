package com.prithila.studentdatabase.repository;

import com.prithila.studentdatabase.model.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * @author Prithila
 * @since 8/9/2021
 */

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void save(Student student) {
        entityManager.persist(student);
        entityManager.flush();
    }

    @Override
    public void update(Student student) {
        entityManager.merge(student);
        entityManager.flush();
    }

    @Override
    public void delete(String id) {
        Student student = entityManager.find(Student.class, id);

        entityManager.remove(student);
        entityManager.flush();
        entityManager.clear();
    }

    @Override
    public Student findStudent(String id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAllStudent() {
        Query query = entityManager.createQuery("Select s from Student s");
        List<Student> students = query.getResultList();
        return students;
    }
}
