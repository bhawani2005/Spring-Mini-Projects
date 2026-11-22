package com.Component;

import lombok.Data;

@Data
public class Chip {
	private String chipCompanyName;
	private String chipType;
	private boolean isActive;
	
	public void check() {
		if(chipType.equalsIgnoreCase("green")) {
			setActive(true);
			System.out.println("Your chip Actived successfully....");
		}
		else {
			System.out.println("Actived it your own risk....");
		}
	}
	
}
