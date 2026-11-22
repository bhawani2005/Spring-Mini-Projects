package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "loan_data")
@Data
public class Loan {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int loanId;
	
	private String coustomerName;
	
	private String loanType;
	
	private double loanAmount;
	
	private double interestRate;
	
	private int durationMonths;
	
	private String loanStatus;
	
	private int creditScore;
}
