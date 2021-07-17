package com.prithila.studentdatabase.service;

import com.prithila.studentdatabase.model.Course;
import com.prithila.studentdatabase.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Prithila
 * @since 6/29/2021
 */

@Service
@Scope(proxyMode = ScopedProxyMode.INTERFACES)
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Override
    public Course save(Course course) {
        return courseRepository.save(course);
    }

}
