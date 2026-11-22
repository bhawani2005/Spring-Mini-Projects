package com.service;

import com.model.Employee;

public interface EmployeeService {

	boolean addEmployee(Employee employee);
	
	Employee getEmployeeById(int employeeId);
	
	boolean updateSalary(int employeeId, double newSalary);
	
	boolean  deleteEmployee(int employeeId);
	
	boolean  isValidEmployee(Employee employee);
}
