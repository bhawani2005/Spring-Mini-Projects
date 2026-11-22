package com.component;

public class Employee {

	private int empId ;
	private String empName;
	private String department;
	private String designation;
	private double salary;
	private String location;
	
	public Employee() {
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", department=" + department + ", designation="
				+ designation + ", salary=" + salary + ", location=" + location + "]";
	}
	
	static class EmployeeBuilder{
		private int empId ;
		private String empName;
		private String department;
		private String designation;
		private double salary;
		private String location;
		
		public EmployeeBuilder() {
			
		}

		public int getEmpId() {
			return empId;
		}

		public EmployeeBuilder setEmpId(int empId) {
			this.empId = empId;
			return this;
		}

		public String getEmpName() {
			return empName;
		}

		public EmployeeBuilder setEmpName(String empName) {
			this.empName = empName;
			return this;
		}

		public String getDepartment() {
			return department;
		}

		public EmployeeBuilder setDepartment(String department) {
			this.department = department;
			return this;
		}

		public String getDesignation() {
			return designation;
		}

		public EmployeeBuilder setDesignation(String designation) {
			this.designation = designation;
			return this;
		}

		public double getSalary() {
			return salary;
		}

		public EmployeeBuilder setSalary(double salary) {
			this.salary = salary;
			return this;
		}

		public String getLocation() {
			return location;
		}

		public EmployeeBuilder setLocation(String location) {
			this.location = location;
			return this;
		}
		
		public Employee build() {
			Employee e = new Employee();
			e.setEmpId(this.empId);
			e.setEmpName(this.empName);
			e.setDepartment(this.department);
			e.setDesignation(this.designation);
			e.setSalary(this.salary);
			e.setLocation(this.location);
			
			return e;
		}
	}
}
