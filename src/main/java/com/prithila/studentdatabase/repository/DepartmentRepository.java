package com.prithila.studentdatabase.repository;

import com.prithila.studentdatabase.model.Department;

import java.util.List;

/**
 * @author Prithila
 * @since 8/7/2021
 */

public interface DepartmentRepository {

    void save(Department department);

    void update(Department department);

    void delete(String id);

    Department findDepartment(String id);

    List<Department> findAllDepartments();
}
