package com.rayshan.employeemgmt.service;

import com.rayshan.employeemgmt.entities.Employee;
import com.rayshan.employeemgmt.repository.ContactInfoRepository;
import com.rayshan.employeemgmt.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.SQLException;
import java.util.List;

@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository empRepository){
        this.employeeRepository = empRepository;
    }

    public List<Employee> getAllEmployees() {
        return this.employeeRepository.findAll();
    }

    @Transactional
    public Employee createEmployee(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployeesByName(String empName) {
        return this.employeeRepository.findByEmpNameLike(empName);
    }

    public List<Employee> getAllEmployeesByEmployeeNumber(Long empNo) {
        return this.employeeRepository.getAllEmployeesByEmployeeNumber(empNo);
    }

    public Employee updateEmployee(Employee employee, Long id) {
        return this.employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        this.employeeRepository.deleteById(id);
    }
}
