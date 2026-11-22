package model;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Data
@Entity
@Table(name = "patient_data")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "patient_id")
	private int id;
	
	@Column(name = "patient_fullName", length = 30)
	private String fullName;
	
	@Transient
	private long phNo;
	
	@Transient
	private String email;
	
	@Embedded
	private Address address;
}
