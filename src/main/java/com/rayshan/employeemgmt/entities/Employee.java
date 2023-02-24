package com.rayshan.employeemgmt.entities;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="emp_no", nullable = false)
    private Long empNumber;

    @Column(name="emp_name", nullable = false)
    private String empName;

    @Column(name="date_of_joining", nullable = true)
    private String dateOfJoining;

    @Column(name="department")
    private String department;

    @Column(name="salary")
    private Long salary;
}
