package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Library_book_data")
@Data
public class LibraryBook {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "Book_id")
	private int id;
	
	@Column(name = "Book_title", length = 30)
	private String title;
	
	@Column(name = "Book_author", length = 30)
	private String author;
	
	@Column(name = "Book_category", length = 25)
	private String category;
}
