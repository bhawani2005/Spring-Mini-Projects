package com.nit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.OperationDao;
import com.entity.LibraryBook;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<LibraryBook> data = new ArrayList<LibraryBook>();

		while (true) {
			System.out.println();
			System.out.println("==========================");
			System.out.println("Book Manage Menu");
			System.out.println("==========================");
			System.out.println("Press 1 : Add Books");
			System.out.println("Press 2 : Fatch Books");
			System.out.println("Press 3 : Exit");
			System.out.println("==========================");
			System.out.println();

			System.out.println("Enter your choice: ");
			int choice = Integer.parseInt(sc.nextLine());
			System.out.println();

			switch (choice) {
			case 1:
				System.out.println("Enter How many data you will insert: ");
				int n = Integer.parseInt(sc.nextLine());
				
				for (int i = 0; i < n; i++) {
					LibraryBook book = new LibraryBook();
					
					System.out.println("Enter "+(i+1)+" Book details: ");
					System.out.print("Title: ");
					book.setTitle(sc.nextLine());
					
					System.out.println("Author: ");
					book.setAuthor(sc.nextLine());
					
					System.out.println("Category: ");
					book.setCategory(sc.nextLine());
					
					data.add(book);
					
				}
				String msg = OperationDao.addBooks(data);
				System.out.println(msg);
				
				break;

			case 2:
				System.out.println("Books Details are: ");
				OperationDao.fetchBooks(data).forEach(System.out::println);
				break;

			case 3:
				System.out.println("Thank You!");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Choice.");
				break;
			}

		}
	}
}
