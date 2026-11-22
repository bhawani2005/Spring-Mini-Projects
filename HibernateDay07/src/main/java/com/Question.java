package com;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Question_data")
@Data
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "q_id")
	private int id;

	@Column(name = "Que", length = 120)
	private String question;
	
	@OneToOne
	@JoinColumn(name = "a_id")
	private Answer answer;
}
