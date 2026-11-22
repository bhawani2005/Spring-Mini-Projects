package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "book_table")
@Data
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private String name;
	private String author;
	private String category;
	private double price;
	private boolean available;
}
