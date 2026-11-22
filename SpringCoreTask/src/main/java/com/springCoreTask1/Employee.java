package com.springCoreTask1;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	
	public Employee() {
		super();
	}

	
	public int getEmployeeId() {
		return employeeId;
	}


	public Employee(int employeeId, String employeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
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


	public double getEmployeeSalary() {
		return employeeSalary;
	}


	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}


	public void displayEmployee() {
		System.out.println("Employee Id: "+employeeId);
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Employee Salary: "+employeeSalary);
	}
}
