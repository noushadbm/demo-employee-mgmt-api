package com.rayshan.employeemgmt.controller;

import com.rayshan.employeemgmt.entities.Employee;
import com.rayshan.employeemgmt.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

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
    public List<Employee> getAllEmployees(@RequestParam @Nullable String empName, @RequestParam @Nullable String empNo) {
        logger.info("Get all employees API invoked with EmployeeName:{} and EmployeeNo: {}", empName, empNo);
        if(Objects.nonNull(empName) && Objects.isNull(empNo)) {
            return this.employeeService.getAllEmployeesByName(empName);
        }

        if(Objects.nonNull(empNo) && Objects.isNull(empName)) {
            return this.employeeService.getAllEmployeesByEmployeeNumber(Long.parseLong(empNo));
        }
        return this.employeeService.getAllEmployees();
    }

    @PostMapping("/employees")
    public Employee createEmployee(@Validated @RequestBody Employee employee) {
        logger.info("Create employee API invoked. Employee No: {}, Name: {}", employee.getEmpNumber(), employee.getEmpName());
        return this.employeeService.createEmployee(employee);
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@Validated @RequestBody Employee employee, @PathVariable Long id) {
        logger.info("Update employee API invoked. Employee ID: {}", id);
        employee.setId(id); // Though ID should be coming in message body.
        return this.employeeService.updateEmployee(employee, id);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        logger.info("Delete employee API invoked. Employee ID: {}", id);
        this.employeeService.deleteEmployee(id);
    }
}
