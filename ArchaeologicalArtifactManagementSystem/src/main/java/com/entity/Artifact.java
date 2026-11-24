package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "artifact_table")
@Data
public class Artifact {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private String artifactName;
	private String civilization;
	private String discoveryLocation;
	private int discoveryYear;
	private double estimatedValue;
	private int ageInYear;
	private String museumName;
	private String condition;
}
