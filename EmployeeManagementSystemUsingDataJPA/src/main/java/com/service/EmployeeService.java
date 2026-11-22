package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Employee;
import com.exception.MyException;
import com.repository.EmployeeRepository;

@Service("empSer")
public class EmployeeService {

	@Autowired
	EmployeeRepository repository;

	public void insertEmployee(Employee employee) {
		repository.save(employee);
		System.out.println("Employee Inserted....");
	}

	public boolean updateEmployee(int id, double salary) {
		Employee employee = repository.findById(id).orElseThrow(() -> new MyException("Id not matched."));

		employee.setSalary(salary);

		Employee save = repository.save(employee);

		return save != null;
	}

	public Employee getEmployeeById(int id) {
		return repository.findById(id).orElseThrow(()->new MyException("Id not Matched."));
	}
	
	public List<Employee> getEmployees(){
		return repository.findAll();
	}
	
	public void deleteById(int id) {
		repository.deleteById(id);
	}
	
	public void deleteAll() {
		repository.deleteAll();
	}
	
	public boolean checkEmployeeById(int id) {
		return repository.existsById(id);
	}
	
	public long countEmployee() {
		return repository.count();
	}
	
	public List<Employee> getEmployeeByName(String name) {
		return repository.findByName(name);
	}
	
	public List<Employee> getEmployeeByAddress(String address){
		return repository.findByAddress(address);
	}
	
	public List<Employee> getEmployeeByJob(String job){
		return repository.findByJob(job);
	}
	
	
}
