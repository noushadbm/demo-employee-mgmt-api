package com.rayshan.employeemgmt;

import com.rayshan.employeemgmt.entities.ContactInfo;
import com.rayshan.employeemgmt.entities.Employee;
import com.rayshan.employeemgmt.repository.ContactInfoRepository;
import com.rayshan.employeemgmt.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class EmployeeMgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMgmtApplication.class, args);
	}

}
