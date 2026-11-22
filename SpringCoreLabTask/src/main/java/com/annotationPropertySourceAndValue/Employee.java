package com.annotationPropertySourceAndValue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("employee")
@Scope("prototype")
@PropertySource("classpath:com/annotationPropertySourceAndValue/application.properties")
public class Employee {
	
	@Value("${employeeId}")
	private int employeeId;
	
	@Value("${employeeName}")
	private String employeeName;
	
	@Value("${department}")
	private String department;
	
	@Value("${salary}")
	private double salary;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", department=" + department
				+ ", salary=" + salary + "]";
	}
	
	
	
	
}
