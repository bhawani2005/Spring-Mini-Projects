package com;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Address {
	
	@Column(name = "emp_street")
	private String strret;
	
	@Column(name = "emp_city")
	private String city;
	
	@Column(name = "emp_pinCode")
	private String pinCode;
}
