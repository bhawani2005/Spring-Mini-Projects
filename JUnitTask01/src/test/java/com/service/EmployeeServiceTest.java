package com.service;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.model.Employee;

@RunWith(Parameterized.class)
public class EmployeeServiceTest {
	private final int id;
	private final String name, department;
	private final double salary;
	private final boolean expected;
	private final EmployeeService service = new EmployeeServiceImpl();
	
	public EmployeeServiceTest(int id, String name, String department, double salary, boolean expected) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.expected = expected;
	}
	
	@Parameters
	public static List<Object[]> testingInsertedData(){
		return Arrays.asList(new Object[][] {
			{101,"Asha", "IT", 55000.0, true},
            {102,"Ravi", "Finance", 42000.0, true},
            {103," ", "IT", 55000.0, false},
            {104,"Meera", "", 48000.0, false},
            {105,"Dev", "IT", 0.0, false},
            {106,"Neha", "HR", -500.0, false}
		});
	}
	
	@Test
	public void testIsValidEmployee() {
		Employee e = new Employee();
		e.setEmployeeId(id);
		e.setName(name);
		e.setDepartment(department);
		e.setSalary(salary);
		
		assertEquals(expected, service.isValidEmployee(e));
	}
}
    