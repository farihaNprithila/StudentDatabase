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

public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Override
    @Transactional(transactionManager = "txManager")
    public void save(Course course) {
        courseRepository.save(course);
    }

    @Override
    public List<Course> findAllCourses() {
        return courseRepository.findAllCourses();
    }

}
