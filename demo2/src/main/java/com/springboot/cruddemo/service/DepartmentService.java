package com.springboot.cruddemo.service;

import java.util.List;

import com.springboot.cruddemo.entity.Department;

public interface DepartmentService {

    public List<Department> findAllDepartments();

    public Department findDepartmentById(int departmentId);
}
