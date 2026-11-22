package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.component.Student;
import com.component.University;

@SpringBootApplication
@EnableConfigurationProperties(Student.class)
public class StudentUniversityProfileSpringBootApplication {

	@Autowired
	Environment environment;

	@Bean
	public University university() {
		University u = new University();
		u.setName(environment.getProperty("university.name"));
		u.setAddress(environment.getProperty("university.address"));
		u.setId(Integer.parseInt(environment.getProperty("university.id")));

		return u;
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StudentUniversityProfileSpringBootApplication.class, args);
		
		Student bean = context.getBean(Student.class);
		System.out.println(bean);
		bean.calculateGread();
	}

}
