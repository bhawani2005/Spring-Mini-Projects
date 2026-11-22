package com.service;

import com.dao.EmployeeDao;
import com.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	@Override
	public boolean isValidEmployee(Employee employee) {
		if (employee == null) {
			return false;
		}
		
		if(employee.getName() == null || employee.getName().trim().isEmpty()) {
			return false;
		}
		
		if(employee.getDepartment() == null || employee.getDepartment().trim().isEmpty()) {
			return false;
		}
		return employee.getSalary()>0;
	}


	@Override
	public boolean addEmployee(Employee employee) {
		if(employee == null) {
			return false;
		}
		int count = EmployeeDao.addEmployee(employee);
		
		if(count>1) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		return EmployeeDao.getEmployeeById(employeeId);
		
	}

	@Override
	public boolean updateSalary(int employeeId, double newSalary) {
		if(newSalary>0) {
			int count = EmployeeDao.updateSalary(employeeId, newSalary);
			if(count>0) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		int count = EmployeeDao.deleteEmployee(employeeId);
		
		if(count>0) {
			return true;
		}
		return false;
	}

	
}
