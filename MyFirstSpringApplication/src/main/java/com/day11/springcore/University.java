package com.day11.springcore;

public class University {
	private String universityName;
	private int universityCode;
	private String universityAddress;
	private Student student;
	
	static {
		System.out.println("University Class loded...");
	}
	
	public University() {
		super();
		System.out.println("University Object created By Default constructor...");
	}
	public University(String universityName, int universityCode, String universityAddress, Student student) {
		super();
		System.out.println("University Object created By Parameterized constructor...");
		this.universityName = universityName;
		this.universityCode = universityCode;
		this.universityAddress = universityAddress;
		this.student = student;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		System.out.println("University Name set");
		this.universityName = universityName;
	}
	public int getUniversityCode() {
		return universityCode;
	}
	public void setUniversityCode(int universityCode) {
		System.out.println("University Code set");
		this.universityCode = universityCode;
	}
	public String getUniversityAddress() {
		return universityAddress;
	}
	public void setUniversityAddress(String universityAddress) {
		System.out.println("University Address set");
		this.universityAddress = universityAddress;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		System.out.println("University's Student set");
		this.student = student;
	}
	@Override
	public String toString() {
		return "University [universityName=" + universityName + ", universityCode=" + universityCode
				+ ", universityAddress=" + universityAddress + ", student=" + student + "]";
	}
	
	
}
