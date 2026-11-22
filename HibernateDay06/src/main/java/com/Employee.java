package com;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Table(name = "Employee_value")
@Data
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "emp_id")
	private int id;
	
	@Column(name = "Emp_name", length = 30)
	private String name;
	
	@Column(name = "cmp_name", length = 50)
	private String companyName;
	
	@Transient
	private long phNo;
	
	@Transient
	private String email;
	
	@Column(name = "emp_joining_date")
	private LocalDateTime joiningDate;
	
	@Embedded
	private Address address;
}
