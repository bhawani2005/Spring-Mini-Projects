package com.xmlAnnoQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:com/xmlAnnoQualifier/application.properties")
public class PatientRecord {
	
	@Value("${pname}")
	private String pName;
	
	@Autowired
	@Qualifier("cardiologist")
	private Doctor doctor;
	
	public PatientRecord() {
		super();
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	public void display() {
		System.out.println("Patient Name: "+pName);
		System.out.println("Doctor Type: "+doctor.getClass().getSimpleName());
		doctor.check();
	}
}
