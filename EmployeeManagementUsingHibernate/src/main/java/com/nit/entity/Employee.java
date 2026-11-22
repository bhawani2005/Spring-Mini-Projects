package com.nit.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Table(name = "emp_data")
@Data
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_id")
	private int id;
	
	@Column(name = "emp_name")
	private String name;
	
	@Column(name = "emp_add")
	private String address;
	
	@Column(name = "com_name")
	private String companyName;
	
	@Transient
	private long contactNumber;
	
	@Column(name = "joining_date")
	private LocalDate date;
	
	@Column(name = "project_assignOn")
	private LocalTime assignTime;
	
	@Column(name = "project_submitOn")
	private LocalDateTime submisionDate;
	
	@Column(name = "emp_image")
	@Lob
	private byte[] image;
}
