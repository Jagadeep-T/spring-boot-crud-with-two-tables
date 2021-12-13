package com.springboot.cruddemo.dao;

import java.util.List;

import com.springboot.cruddemo.entity.Department;

public interface DepartmentDAO {

    public List<Department> findAllDepartments();

    public Department findDepartmentById(int departmentId);

    public void save(Department theDepartment);

    public void deleteById(int theId);
}
