package com.SpringJdbcLabTask02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
	
	private static final String FIND_TOTAL_NO_OF_BOOK = "select count(1) from book";
	private static final String FIND_BOOK_NAME_BY_ID = "select bookName from book where bookId = ?";
	private static final String FIND_COMPLETE_BOOK_DETAILS_BY_ID = "select bookid, bookname, author, price from book where bookId = ?";
	private static final String DISPLAY_ALL_BOOK = "select * from book";
	private static final String INSERT_A_BOOK = "insert into book values(?,?,?,?)";
	private static final String UPDATE_BOOK_PRICE = "update book set price = ? where bookid = ?";
	private static final String DELETE_BOOK_BY_ID = "delete from book where bookid = ?";
	
	JdbcTemplate template;

	@Autowired
	public BookDao(JdbcTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public String toString() {
		return "BookDao [template=" + template + "]";
	}
	
	public int findTotalNoOfBook() {
		return template.queryForObject(FIND_TOTAL_NO_OF_BOOK, Integer.class);
	}
	
	public String findBookNameById(int bookId) {
		return template.queryForObject(FIND_BOOK_NAME_BY_ID, String.class, new Object[] {bookId});
	}
	
	public BookBo findCompleteBookDetailsById(int bookId) {
		return template.queryForObject(FIND_COMPLETE_BOOK_DETAILS_BY_ID, new Object[] {bookId}, (rs, row)->{
			BookBo book = new BookBo();
			book.setBookId(rs.getInt(1));
			book.setBookName(rs.getString(2));
			book.setAuthor(rs.getString(3));
			book.setPrice(rs.getDouble(4));
			return book;
		});
	}
	
	public List<BookBo> findAllBook() {
		return template.query(DISPLAY_ALL_BOOK, (rs, row)->{
			BookBo book = new BookBo();
			book.setBookId(rs.getInt(1));
			book.setBookName(rs.getString(2));
			book.setAuthor(rs.getString(3));
			book.setPrice(rs.getDouble(4));
			return book;
		});
	}
	
	public int insertBook(BookBo book) {
		return template.update(INSERT_A_BOOK, new Object[] {
				book.getBookId(),
				book.getBookName(),
				book.getAuthor(),
				book.getPrice()
		});
	}
	
	public int updateBookPrice(double price, int bookId) {
		return template.update(UPDATE_BOOK_PRICE, new Object[] {
				price,bookId
		});
	}
	
	public int deleteBookById(int bookId) {
		return template.update(DELETE_BOOK_BY_ID, new Object[] {bookId});
	}
}
