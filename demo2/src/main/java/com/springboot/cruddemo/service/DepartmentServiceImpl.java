package com.springboot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.cruddemo.dao.DepartmentDAO;
import com.springboot.cruddemo.entity.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDAO departmentDAO;

    @Override
    @Transactional
    public List<Department> findAllDepartments() {
        return departmentDAO.findAllDepartments();
    }
    
    @Override
    @Transactional
    public Department findDepartmentById(int departmentId){
        return departmentDAO.findDepartmentById(departmentId);
    }
}
