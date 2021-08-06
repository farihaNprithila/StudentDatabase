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
    @Column(name = "id")
    private String id;


    @Column(name = "name")
    private String name;

    @Column(name = "departmentID")
    private int departmentID;


    public Course() {
    }

    public Course(String courseID, String name, int departmentID) {
        this.id = courseID;
        this.name = name;
        this.departmentID = departmentID;
    }

    public String getId() {
        return id;
    }

    public void setId(String courseID) {
        this.id = courseID;
    }


    public String getName() {
        return name;
    }

    public void setName(String courseName) {
        this.name = courseName;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id == course.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
