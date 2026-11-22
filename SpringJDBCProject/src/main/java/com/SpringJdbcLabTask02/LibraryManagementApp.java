package com.SpringJdbcLabTask02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibraryManagementApp {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BookConfig.class);
		
		
		BookDao bean = context.getBean("bookDao", BookDao.class);
		
		System.out.println("Total Number of Book is: ");
		System.out.println(bean.findTotalNoOfBook());
		
		System.out.println("===========================");
		
		System.out.println("The name of Book: ");
		System.out.println(bean.findBookNameById(102));
		
		System.out.println("===========================");

		System.out.println("Book Details is : ");
		System.out.println(bean.findCompleteBookDetailsById(101));
		
		System.out.println("===========================");

		System.out.println("All Book: ");
		bean.findAllBook().forEach(System.out::println);
		
		System.out.println("===========================");

//		BookBo book = new BookBo();
//		book.setBookId(106);
//		book.setBookName("Python");
//		book.setAuthor("Jack");
//		book.setPrice(400);
//		
//		int insertBook = bean.insertBook(book);
//		if (insertBook>0) {
//			System.out.println("Book Inserted.");
//		}
//		else {
//			System.out.println("Not Inserted.");
//		}
//		
		System.out.println("===========================");
		
//		int updateBookPrice = bean.updateBookPrice(350, 106);
//		if (updateBookPrice>0) {
//			System.out.println("Book Updated.");
//		}
//		else {
//			System.out.println("Not Updated.");
//		}
		
		System.out.println("===========================");
		
		
		int deleteBookById = bean.deleteBookById(106);
		if (deleteBookById>0) {
			System.out.println("Book deleted.");
		}
		else {
			System.out.println("Not deleted.");
		}
		
		System.out.println("===========================");
		
	}
}
