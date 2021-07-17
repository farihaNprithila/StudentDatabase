package com.prithila.studentdatabase.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author Prithila
 * @since 6/26/2021
 */

@Entity
@Table(name = "course")
public class Course {

    @Id
    @Column(name = "course_id")
    private String courseID;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "department")
    private String department;


    public Course() {
    }

    public Course(String courseID, String courseName, String department) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.department = department;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseId) {
        this.courseID = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return courseID.equals(course.courseID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseID);
    }
}
