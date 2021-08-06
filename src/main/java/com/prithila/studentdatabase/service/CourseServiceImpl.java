package com.prithila.studentdatabase.service;

import com.prithila.studentdatabase.model.Course;
import com.prithila.studentdatabase.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Prithila
 * @since 6/29/2021
 */

@Service
@Transactional(transactionManager = "txManager")
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }

    @Override
    public void update(Course course) {
        courseRepository.update(course);
    }

    @Override
    public void delete(String id) {
        courseRepository.delete(id);
    }

    @Override
    public Course findCourse(String id) {
        return courseRepository.findCourse(id);
    }

    @Override
    public List<Course> findAllCourses() {
        return courseRepository.findAllCourses();
    }

}
