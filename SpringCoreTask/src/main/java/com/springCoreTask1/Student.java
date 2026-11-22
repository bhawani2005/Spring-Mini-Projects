package com.springCoreTask1;

public class Student {
	private int rollNumber;
	private String studentName;
	private String course;
	
	public Student() {
		super();
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	public void display() {
		System.out.println("Roll Number : "+rollNumber);
		System.out.println("Student Name : "+studentName);
		System.out.println("Course : "+course);
	}
}
