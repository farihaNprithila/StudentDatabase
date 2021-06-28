package com.prithila.studentdatabase.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

/**
 * @author Prithila
 * @since 6/26/2021
 */

@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "student_id")
    private Long studentID;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "department")
    private String department;

    @ManyToMany
    @JoinTable(name = "student_course",
            joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "studentId"),
            inverseJoinColumns = @JoinColumn(name = "course_id", referencedColumnName = "courseId"))
    private List<Course> courseList;

    public Student() {

    }

    public Student(Long studentID) {
        this.studentID = studentID;
    }

    public Student(Long studentID, String firstName, String lastName, String department, List<Course> courseList) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.courseList = courseList;
    }

    public Student(String firstName, String lastName, String department, List<Course> courseList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.courseList = courseList;
    }

    public Student(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentID.equals(student.studentID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID);
    }
}
