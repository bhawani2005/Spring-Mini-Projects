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
@Table(name = "Answer_data")
@Data
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "a_id")
	private int id;
	
	@Column(name = "ans", length = 120)
	private String answer;
	
	@OneToOne(mappedBy = "answer")
	@JoinColumn(name = "q_id")
	private Question question;
}
