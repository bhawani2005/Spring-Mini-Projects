package com.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;


import com.entity.Employee;

//@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public List<Employee> findByName(String name);
	
	public List<Employee> findByAddress(String address); 
	
	public List<Employee> findByJob(String job);
	
	//List<Employee> findByAgeIs(int age);
}
