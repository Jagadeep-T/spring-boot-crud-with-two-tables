package com.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.cruddemo.entity.Department;
import com.springboot.cruddemo.exception.EmployeeServiceException;
import com.springboot.cruddemo.service.DepartmentService;

@RestController
@RequestMapping("/api")
public class DepartmentRestController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments")
    public ResponseEntity<List<Department>> findAllDepartments() {
        return new ResponseEntity<List<Department>>(departmentService.findAllDepartments(), HttpStatus.OK);
    }

    @GetMapping("/departments/{departmentId}")
    public ResponseEntity<Department> findDepartmentById(@PathVariable int departmentId) throws EmployeeServiceException {
        Department theDepartment = departmentService.findDepartmentById(departmentId);
        if (theDepartment == null || theDepartment.getId() <= 0) {
            throw new EmployeeServiceException("Department with id " + departmentId + " does not exist");
        }
        return new ResponseEntity<Department>(theDepartment, HttpStatus.OK);
    }
}
