package com.prithila.studentdatabase.service;

import com.prithila.studentdatabase.model.Department;
import com.prithila.studentdatabase.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Prithila
 * @since 8/8/2021
 */

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    @Transactional(transactionManager = "txManager")
    public void save(Department department) {
        departmentRepository.save(department);
    }

    @Override
    @Transactional(transactionManager = "txManager")
    public void update(Department department) {
        departmentRepository.update(department);
    }

    @Override
    @Transactional(transactionManager = "txManager")
    public void delete(String id) {
        departmentRepository.delete(id);
    }

    @Override
    @Transactional(transactionManager = "txManager")
    public Department findDepartment(String id) {
        return departmentRepository.findDepartment(id);
    }

    @Override
    @Transactional(transactionManager = "txManager")
    public List<Department> findAllDepartments() {
        return departmentRepository.findAllDepartments();
    }
}
