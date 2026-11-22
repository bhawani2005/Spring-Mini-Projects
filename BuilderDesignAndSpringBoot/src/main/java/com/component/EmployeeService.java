package com.component;

import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

	Employee employee = new Employee.EmployeeBuilder().setEmpId(101)
			.setEmpName("Kumar").setDepartment("Testing")
			.setDesignation("Tester").setSalary(25000)
			.setLocation("HYD").build();

	public EmployeeService() {
		super();
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void printEmployeeDetails() {
		System.out.println("========== EMPLOYEE DETAILS ==========");
		System.out.println();
		System.out.println("Employee ID     : "+employee.getEmpId());
		System.out.println("Employee Name   : "+employee.getEmpName());
		System.out.println("Department      : "+employee.getDepartment());
		System.out.println("Designation     : "+employee.getDesignation());
		System.out.println("Salary          : "+employee.getSalary());
		System.out.println("Location        : "+employee.getLocation());
		System.out.println();
		System.out.println("======================================");
	}
}
