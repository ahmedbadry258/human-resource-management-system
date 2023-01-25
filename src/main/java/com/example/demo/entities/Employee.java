package com.example.demo.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "employees")
public class Employee {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EMPLOYEE_ID")
	private Long employeeId;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;
	@Column(name = "HIRE_DATE")
	private LocalDate hireDate;
	@Column(name = "JOB_ID")
	private String jopId;
	@Column(name = "SALARY")
	private String salary;
	@Column(name = "COMMISSION_PCT")
	private double commissionPct;
	@Column(name = "MANAGER_ID")
	private int managerId;
	@Column(name = "DEPARTMENT_ID")
	private Long departmentId;
	public Employee() {
		super();
	}
	
	
	
	
	
	

}
