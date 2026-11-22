package com.SpringJdbcLabTask01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {

	private static final String FIND_TOTAL_BOOK= "SELECT COUNT(1) FROM BOOK";
	private static final String FIND_BOOK_NAME_BY_BOOKID = "SELECT BOOKNAME FROM BOOK WHERE BOOKID = ?";
	private static final String FIND_BOOK_DETAILS_BY_BOOKID = "SELECT BOOKID, BOOKNAME, AUTHOR, PRICE FROM BOOK WHERE BOOKID = ?";
	
	private JdbcTemplate template;

	@Autowired
	public BookDao(JdbcTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public String toString() {
		return "BookDao [template=" + template + "]";
	}

	public int findTotalNumberOfBooks() {
		return template.queryForObject(FIND_TOTAL_BOOK, Integer.class);
	}
	
	public String findBookNameById(int bookId) {
		return template.queryForObject(FIND_BOOK_NAME_BY_BOOKID, String.class, bookId);
	}
	
	public BookBo findCompleteBookDetails(int bookId) {
		return template.queryForObject(FIND_BOOK_DETAILS_BY_BOOKID, new MyBookMapper(), bookId);
	}
	
}
