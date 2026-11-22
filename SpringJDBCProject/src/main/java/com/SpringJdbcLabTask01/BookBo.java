package com.SpringJdbcLabTask01;

public class BookBo {
	private int  bookId;
	private String bookName;
	private String author;
	private double price;
	
	public BookBo() {
		super();
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookBo [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", price=" + price + "]";
	}

}
