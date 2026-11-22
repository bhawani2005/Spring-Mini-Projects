package com.aster.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

@Data

@Entity
@Table(name = "patient_data")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Patient_Id")
	private int id;
	
	@Column(name = "P_Name", length = 100)
	private String name;
	
	@Column(name = "P_Email", length = 50)
	private String email;
	
	@Column(name = "P_Age", length = 3)
	private int age;
	
	@Column(name = "p_Gender", length = 1)
	private String gender;
	
	@Column(name = "Ph_No", length = 10)
	private long phoneNumber;
	
	@Column(name = "P_Address", length = 120)
	private String address;
	
	@Column(name = "P_AdmissionOn")
	private LocalDateTime admissionDate;
	
	@Column(name = "P_DischargeOn")
	private LocalDateTime dischargeDate;
	
	@Lob
	private String medicalHistory;
	
	@Lob
	private byte[] patientDoc;

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", gender=" + gender
				+ ", phoneNumber=" + phoneNumber + ", address=" + address + ", admissionDate=" + admissionDate
				+ ", dischargeDate=" + dischargeDate + ", medicalHistory=" + medicalHistory + "]";
	}
	
	
	
}
