package com.SpringCoreExam3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:com/SpringCoreExam3/application.properties")

public class EnrollService {
	
	@Value("${studentName}")
	private String studentName;
	
	@Value("${courseName}")
	private String courseName;
	
	@Value("${courseFee}")
	private double courseFee;
	
	@Value("${numberofMonths}")
	private int numberofMonths;
	
	@Value("${GSTPercentage}")
	private double GSTPercentage;
	
	@Value("${DiscountPercentage}")
	private double DiscountPercentage;
	
	@Value("${RegistrationFee}")
	private double RegistrationFee;
	
	@Autowired
	@Qualifier("java")
	private CourseFeeService courseFeeService;

	@Override
	public String toString() {
		return "EnrollService [studentName=" + studentName + ", courseName=" + courseName + ", courseFee=" + courseFee
				+ ", numberofMonths=" + numberofMonths + ", GSTPercentage=" + GSTPercentage + ", DiscountPercentage="
				+ DiscountPercentage + ", RegistrationFee=" + RegistrationFee + ", courseFeeService=" + courseFeeService
				+ "]";
	}
	
	public void enroll() {
		System.out.println(this.toString());
		
		System.out.println("GST Amount: "+courseFee*GSTPercentage);
		System.out.println("Discount amount: "+courseFee*DiscountPercentage);
		System.out.println("Payable Course Fee: "+(courseFee+(courseFee*GSTPercentage)-(courseFee*DiscountPercentage)));
		System.out.println("Total amount: "+(courseFee+(courseFee*GSTPercentage)-(courseFee*DiscountPercentage))+RegistrationFee);
		
		courseFeeService.enroll();
	}
}
