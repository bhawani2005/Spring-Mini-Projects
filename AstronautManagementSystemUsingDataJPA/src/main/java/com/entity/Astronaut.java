package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "astronaut_data")
@Data
public class Astronaut {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long Id;
	private String Name;
	private int age;
	private String nationality;
	private String spaceAgency;
	private int experienceYear;
	private String mission;
	private int missionCount;
	private double salary;
	private boolean currentlyActive;
}
