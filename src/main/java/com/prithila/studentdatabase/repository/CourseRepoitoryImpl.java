package com.prithila.studentdatabase.repository;

import com.prithila.studentdatabase.model.Course;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * @author Prithila
 * @since 6/29/2021
 */

@Repository
public class CourseRepoitoryImpl implements CourseRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public Course save(Course course) {
        entityManager.persist(course);
        entityManager.flush();
        entityManager.getTransaction().commit();
        return course;
    }
}
