package com.prithila.studentdatabase.repository;

import com.prithila.studentdatabase.model.Department;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * @author Prithila
 * @since 8/7/2021
 */

@Repository
public class DepartmentRepositoryImpl implements DepartmentRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void save(Department department) {
        entityManager.persist(department);
        entityManager.flush();
    }

    @Override
    public void update(Department department) {
        entityManager.merge(department);
        entityManager.flush();
    }

    @Override
    public void delete(String id) {
        Department department = entityManager.find(Department.class, id);

        entityManager.remove(department);
        entityManager.flush();
        entityManager.clear();
    }

    @Override
    public Department findDepartment(String id) {
        return entityManager.find(Department.class, id);
    }

    @Override
    public List<Department> findAllDepartments() {
        Query query = entityManager.createQuery("Select d from Department d");
        List<Department> departmentList = query.getResultList();
        return departmentList;
    }
}
