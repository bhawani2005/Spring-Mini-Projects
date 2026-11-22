package com.SpringCoreExam3;

import org.springframework.stereotype.Component;

@Component
public class PythonCourseService implements CourseFeeService{

	@Override
	public void enroll() {
		System.out.println("Python Course Enroll.");
		
	}
	
}
