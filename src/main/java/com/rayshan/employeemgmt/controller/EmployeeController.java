package com.rayshan.employeemgmt.controller;

import com.rayshan.employeemgmt.entities.Employee;
import com.rayshan.employeemgmt.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
    Logger logger = LoggerFactory.getLogger(EmployeeController.class);
    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        logger.info("Get all employees API invoked.");
        return this.employeeService.getAllEmployees();
    }

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {
        logger.info("Create employee API invoked. Employee No: {}, Name: {}", employee.getEmpNumber(), employee.getEmpName());
        return this.employeeService.createEmployee(employee);
    }
}
