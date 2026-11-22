package com.foodDeliverySystem;

class Employee {
	private int id;
	private String name;
	private double salary;
	private String role;

	public Employee() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", role=" + role + "]";
	}
	
	

}

class EmployeeBuilder {
	private int id;
	private String name;
	private double salary;
	private String role;

	public EmployeeBuilder() {

	}

	public int getId() {
		return id;
	}

	public EmployeeBuilder setId(int id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public EmployeeBuilder setName(String name) {
		this.name = name;
		return this;

	}

	public double getSalary() {
		return salary;
	}

	public EmployeeBuilder setSalary(double salary) {
		this.salary = salary;
		return this;
	}

	public String getRole() {
		return role;
	}

	public EmployeeBuilder setRole(String role) {
		this.role = role;
		return this;
	}

	public Employee build() {
		Employee e = new Employee();
		e.setId(this.id);
		e.setName(this.name);
		e.setSalary(this.salary);
		e.setRole(this.role);

		return e;
	}
}

public class Main {
	public static void main(String[] args) {
		Employee employee = new EmployeeBuilder()
				.setId(101).setName("Rohit")
				.setSalary(20000).setRole("Developer")
				.build();
		
		System.out.println(employee);
	}
}
