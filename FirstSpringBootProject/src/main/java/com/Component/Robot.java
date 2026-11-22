package com.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Robot {
	
	@Autowired
	private Chip chip;
	
	@Value("${robotManufactureCompanyName}")
	private String robotManufactureCompanyName;
	@Value("${power}")
	private String power;
	
	public void onRobo() {
		chip.check();
		if(chip.isActive()) {
			System.out.println("Hi I am you Duck Robo.....");
		}
		else {
			System.out.println("First Active your chip!");
 		}
	}
}
