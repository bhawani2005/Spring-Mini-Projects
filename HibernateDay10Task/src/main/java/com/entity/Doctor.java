package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Entity
@Table
@Data
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long doctorId;
	
	@Column(length = 50)
	private String doctorName;
	
	@Column(length = 50)
	private String specialization;
	
	private double salary;
	
	@ManyToOne
	@ToString.Exclude
	private Department department;
}
