package com.annoPropertySourceAndValueDay2;

import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//@PropertySource("classpath:com/annoPropertySourceAndValueDay2/application.properties")
public class Employee {
	
	
	private int id;
	private String name;
	private String department;
	private double salary;
	private String city;
	
	@Value("${empId}")
	public void setId(int id) {
		this.id = id;
	}
	
	@Value("${empName}")
	public void setName(String name) {
		this.name = name;
	}
	
	@Value("${empDept}")
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Value("${empSal}")
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Value("${empCity}")
	public void setCity(String city) {
		this.city = city;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + ", city="
				+ city + "]";
	}
	
	
}
