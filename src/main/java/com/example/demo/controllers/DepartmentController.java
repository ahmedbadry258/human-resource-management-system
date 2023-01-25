package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Department;

import com.example.demo.repositories.DepartmentRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/departments")
public class DepartmentController {
	@Autowired
	private DepartmentRepository departmentRepository;

	
	@GetMapping
	public List<Department> findAll(){
		return departmentRepository.findAll();
	}
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable ("id") Long id){
		return departmentRepository.findById(id).get();
	}
	@PostMapping
	public Department saveDepartment(@RequestBody Department department){
		departmentRepository.save(department);
		return department;
	}
	@PutMapping("/{id}")
	public Department editDepartment(@PathVariable ("id") Long id,@RequestBody Department department){
		Department d=departmentRepository.findById(id).get();
		d.setDepartmentName(department.getDepartmentName());
		d.setLocation(department.getLocation());
		d.setManager(department.getManager());
		departmentRepository.save(d);
		return d;
	}
	@DeleteMapping("/{id}")
	public String deleteDepartment(@PathVariable ("id") Long id){
		departmentRepository.deleteById(id);
		return "Department has been deleted";
	}

}
