package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "JOBS")
public class Job {
	@Id
	@Column(name = "JOB_ID ")
	private String jobId;
	@Column(name = "JOB_TITLE",nullable = false)
	private String jobTitle;
	@Column(name = "MIN_SALARY")
	private Long minSalary;
	@Column(name = "MAX_SALARY")
	private Long maxSalary;
	


}
