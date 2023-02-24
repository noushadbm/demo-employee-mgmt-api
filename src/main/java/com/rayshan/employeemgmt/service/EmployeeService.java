package com.rayshan.employeemgmt.service;

import com.rayshan.employeemgmt.entities.Employee;
import com.rayshan.employeemgmt.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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
}
