package com.task01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CompanyService {

	@Value("${company.name}")
	private String companyName;
	
	@Value("${company.location}")
	private String location;
	
	@Value("${company.employee-count}")
	private int employee_count;
	
	@Autowired
	private Employee employee;

	public CompanyService() {
		super();
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getEmployee_count() {
		return employee_count;
	}

	public void setEmployee_count(int employee_count) {
		this.employee_count = employee_count;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "CompanyService [companyName=" + companyName + ", location=" + location + ", employee_count="
				+ employee_count + ", employee=" + employee + "]";
	}
	
	public void displayDetails() {
		System.out.println("Company Name: "+companyName);
		System.out.println("Company Location: "+location);
		System.out.println("Employee Count: "+employee_count);
		System.out.println("Employee details: ");
		System.out.println("Id: "+employee.getEmployeeId());
		System.out.println("Name: "+employee.getEmployeeName());
		System.out.println("Department: "+employee.getDepartment());
	}
}
