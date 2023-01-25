package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.repositories.EmployeeRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("employees")
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@RequestMapping
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}

}
