package com.rayshan.employeemgmt.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.List;
@Setter
@Getter
@Entity
@Table(name="employees")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Digits(integer = 10, fraction = 0, message = "Maximum digits 10")
    @Column(name="emp_no", nullable = false)
    private Long empNumber;

    @Size(max = 100, message = "Length cannot be more than 100")
    @Column(name="emp_name", nullable = false)
    private String empName;

    @Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[012])-((19|2[0-9])[0-9]{2})$")
    @Column(name="date_of_joining", nullable = true)
    private String dateOfJoining;

    @Pattern(regexp = "^AD|IT|HD|HR|OP$")
    @Column(name="department")
    private String department;

    @Digits(integer = 10, fraction = 0, message = "Maximum digits 10")
    @Column(name="salary")
    private Long salary;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="fk_emp_id", referencedColumnName = "id")
    private List<ContactInfo> contactInfos;

    public Employee() {}

    public Employee(Long empNumber, String empName, String dateOfJoining, String department, Long salary) {
        this.empNumber = empNumber;
        this.empName = empName;
        this.dateOfJoining = dateOfJoining;
        this.department = department;
        this.salary = salary;
    }
}
