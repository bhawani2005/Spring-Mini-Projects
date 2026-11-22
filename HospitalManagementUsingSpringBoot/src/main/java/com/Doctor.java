package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Doctor {
	
	@Value("${id}")
	private int id;
	
	@Value("${name}")
	private String name;
	
	@Value("${specialization}")
	private String specialization;
	
	@Value("${hospitalName}")
	private String hospitalName;
	
	@Value("${consultationFee}")
	private double consultationFee;
	
}