package com.prithila.studentdatabase.service;

import com.prithila.studentdatabase.model.Department;

import java.util.List;

/**
 * @author Prithila
 * @since 8/8/2021
 */

public interface DepartmentService {
    void save(Department department);

    void update(Department department);

    void delete(String id);

    Department findDepartment(String id);

    List<Department> findAllDepartments();
}
