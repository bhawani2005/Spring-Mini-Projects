package com.SpringCoreExam3;

import org.springframework.stereotype.Component;

@Component("java")
public class JavaCourseService implements CourseFeeService {

	@Override
	public void enroll() {
		System.out.println("Java Course Enroll.");

	}

}
