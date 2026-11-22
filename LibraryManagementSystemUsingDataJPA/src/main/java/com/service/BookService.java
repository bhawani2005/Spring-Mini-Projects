package com.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.repository.BookRepository;

public class BookService {

	@Autowired
	BookRepository repository;
	
	
}
