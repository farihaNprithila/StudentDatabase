package com.prithila.studentdatabase.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * @author Prithila
 * @since 6/26/2021
 */

@Entity
@Table(name = "course")
public class Course {

    @Id
    @Column(name = "id", nullable = false)
    private String id;


    @Column(name = "name")
    private String name;

    @Column(name = "department_id")
    private String departmentID;


    @Temporal(value = TemporalType.DATE)
    @Column(name = "creation_date")
    private Date creationDate = new Date();

    public Course() {
    }

    public Course(String id, String name, String departmentID) {
        this.id = id;
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

    public String getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date dateAdded) {
        this.creationDate = dateAdded;
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
