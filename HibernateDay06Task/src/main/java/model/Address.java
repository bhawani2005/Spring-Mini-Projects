package model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Address {

	@Column(name = "patient_add_street", length = 20)
	private String street;
	
	@Column(name = "patient_add_city", length = 20)
	private String city;
	
	@Column(name = "patient_add_state", length = 20)
	private String state;
	
	@Column(name = "patient_add_pincode", length = 6)
	private String pinCode;
}
