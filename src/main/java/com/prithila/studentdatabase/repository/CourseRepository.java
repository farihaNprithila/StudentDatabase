package com.prithila.studentdatabase.repository;

import com.prithila.studentdatabase.model.Course;

/**
 * @author Prithila
 * @since 6/26/2021
 */


public interface CourseRepository {
    Course save(Course course);
}
