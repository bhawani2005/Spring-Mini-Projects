package com.SpringJdbcLabTask02;

public class BookBo {
	private int bookId;
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
	
	

	public int getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public String getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "BookBo [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", price=" + price + "]";
	}
	
	
}
