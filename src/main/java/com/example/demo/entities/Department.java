package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "DEPARTMENTS")
public class Department implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DEPARTMENT_ID")
	private Long departmentId;
	@Column(name = "DEPARTMENT_NAME")
	private String departmentName;
//	@Column(name = " MANAGER_ID")
//	private  Long managerId;
	@ManyToOne()
	@JoinColumn(name = "MANAGER_ID")
	private Employee manager;
	//@Column(name = "")
	//private Long locationId;
	@ManyToOne()
	@JoinColumn(name = "LOCATION_ID")
	private Location location;
	
	
	   

}
