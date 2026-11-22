package com.ActorManagementSystemUsingSpringJdbc;

public class ActorBo {

	private int id;
	private String name;
	private String email;
	private double salary;
	private String movie;
	
	public ActorBo() {
		super();
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Actor [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", movie=" + movie
				+ "]";
	}
}
