package com.day11.springcore;

public class Student {
	private String name;
	private int id;
	private String address;
	
	static {
		System.out.println("Student Class loded...");
	}
	
	public Student() {
		super();
		System.out.println("Student Object created By Default constructor...");
	}
	public Student(String name, int id, String address) {
		super();
		System.out.println("Student Object created By Parameterized constructor...");
		this.name = name;
		this.id = id;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Student Name set");
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("Student Id set");
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		System.out.println("Student Address set");
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	
	
}
