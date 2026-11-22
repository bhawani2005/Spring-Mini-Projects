package com.componant;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "company")
public class EmployeeConfig {

	private String companyName;
	private int employeeCount;
	private double annualRevenue;
	private boolean active;
	private char branchCode;
	
	List<String> employeeNames;
	Map<Integer, String> employeeDepartments;
	Set<String> uniqueSkills;
	Address companyAddress;
	String[]locations;
}
