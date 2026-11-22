package com.day19.springCore;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	private Course course;

	public Course getCourse() {
		return course;
	}

	@Required
	public void setCourse(Course course) {
		this.course = course;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [course=" + course + "]";
	}

	public void show() {
		System.out.println(course.getName());
	}
}
