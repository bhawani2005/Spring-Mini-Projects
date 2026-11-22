package com.space;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Space_Mission")
@Data
public class SpaceMission {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "mission_id")
	private int missionId;

	@Column(name = "mission_name", length = 120)
	private String missionName;

	@Column(length = 50)
	private String destination;

	private int year;

	@ManyToMany
	@JoinTable(name = " mission_astronaut", joinColumns = @JoinColumn(name = "mission_id"), inverseJoinColumns = @JoinColumn(name = "astronaut_id"))
	private List<Astronaut> astronauts;
}
