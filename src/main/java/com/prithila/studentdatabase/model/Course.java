package com.prithila.studentdatabase.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

/**
 * @author Prithila
 * @since 6/26/2021
 */

@Entity
@Table(name = "course")
public class Course {

    @Id
    @Column
    private Long courseId;

    @Column
    private String courseName;

    @ManyToMany(mappedBy = "courseList")
    private List<Student> studentList;

    public Course() {

    }

    public Course(Long courseId, String courseName, List<Student> studentList) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.studentList = studentList;
    }

    public Course(String courseName, List<Student> studentList) {
        this.courseName = courseName;
        this.studentList = studentList;
    }

    public Course(Long courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return courseId.equals(course.courseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId);
    }
}
