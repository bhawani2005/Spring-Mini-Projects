package com.xmlAnnoQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:com/xmlAnnoQualifier/application.properties")
public class OnlineCourse {

	
	private String courseName;	
	private Mentor mentor;
	
	public OnlineCourse() {
		super();
	}


	@Value("${courseName}")
	public void setCourseName(String courseName) {
		this.courseName = courseName;
		
	}

	@Autowired
	@Qualifier("javaMentor")
	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}
	
	public void Display() {
		System.out.println("Course name: "+courseName);
		System.out.println("Select Mentor: "+mentor.getClass().getSimpleName());
		mentor.guide();
	}
}
