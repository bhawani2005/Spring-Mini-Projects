package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connection.BuildConnection;
import com.entity.LibraryBook;

public class OperationDao {
	public static String addBooks(List<LibraryBook> data) {
		Session session = BuildConnection.getConnection().openSession();
		Transaction transaction = session.beginTransaction();
		
		for (LibraryBook value : data) {
			session.persist(value);
		}
		
		transaction.commit();
		session.close();
		
		return "Books Inserted Successfully...";
	}
	
	@SuppressWarnings("removal")
	public static List<LibraryBook> fetchBooks(List<LibraryBook> data){
		List<LibraryBook> result_data = new ArrayList<LibraryBook>();
		
		Session session = BuildConnection.getConnection().openSession();
		Transaction transaction = session.beginTransaction();
		
		for (LibraryBook value : data) {
			LibraryBook book = session.get(LibraryBook.class, value.getId());
			result_data.add(book);
		}
		
		transaction.commit();
		session.close();
		
		return result_data;
	}
}
