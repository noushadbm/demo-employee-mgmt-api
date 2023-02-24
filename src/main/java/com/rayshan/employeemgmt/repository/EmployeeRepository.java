package com.rayshan.employeemgmt.repository;

import com.rayshan.employeemgmt.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query(value = "SELECT * FROM employees WHERE emp_name LIKE CONCAT('%',:empName,'%')", nativeQuery = true)
    List<Employee> findByEmpNameLike(String empName);

    @Query(value = "FROM Employee e WHERE e.empNumber = ?1")
    List<Employee> getAllEmployeesByEmployeeNumber(Long empNo);
}
