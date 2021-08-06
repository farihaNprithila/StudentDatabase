package com.prithila.studentdatabase.service;

import com.prithila.studentdatabase.model.Course;

import java.util.List;

/**
 * @author Prithila
 * @since 6/26/2021
 */


public interface CourseService {

    void save(Course course);

    void update(Course course);

    void delete(String id);

    Course findCourse(String id);

    List<Course> findAllCourses();

}
