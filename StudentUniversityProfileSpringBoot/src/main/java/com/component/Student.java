package com.component;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "student")
public class Student {

	private String name;
	private int id;
	private String branch;
	private List<String> subject;
	private List<Double> marks;
	private boolean isAdmission;
	
	private University university;
	
	public Student() {
		super();
	}

	public Student(String name, int id, String branch, List<String> subject, List<Double> marks, boolean isAdmission,
			University university) {
		super();
		this.name = name;
		this.id = id;
		this.branch = branch;
		this.subject = subject;
		this.marks = marks;
		this.isAdmission = isAdmission;
		this.university = university;
	}

	
	public void calculateGread() {
		if(isAdmission) {
			double total = marks.stream().mapToDouble(Double::doubleValue).sum();
			if(total>200) {
				double avgMark = total/marks.size();
				if(avgMark>=90 && avgMark<=100) {
					System.out.println("Gread : A");
				}
				else if(avgMark>=70 && avgMark<=90) {
					System.out.println("Gread : B");
				}
				else {
					System.out.println("Fail");
				}
			}
			else {
				System.out.println("Fail");
			}
		}
		else {
			System.out.println(name+" is not taken Admmision.");
		}
	}


	
}
