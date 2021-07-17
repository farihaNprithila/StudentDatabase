package com.prithila.studentdatabase.repository;

import com.prithila.studentdatabase.model.Course;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * @author Prithila
 * @since 6/29/2021
 */

@Repository
public class CourseRepoitoryImpl implements CourseRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Course course) {

        entityManager.persist(course);
        entityManager.flush();

    }

    @Override
    public List<Course> findAllCourses() {
        Query query = entityManager.createQuery("Select c from Course c");
        List<Course> courseList = query.getResultList();
        return courseList;
    }
}
