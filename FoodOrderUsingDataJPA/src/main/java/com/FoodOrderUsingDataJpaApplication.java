package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.ApplicationContext;

import com.service.FoodService;

@SpringBootApplication
@EntityScan(basePackages = { "com.entity" })
public class FoodOrderUsingDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FoodOrderUsingDataJpaApplication.class, args);

		FoodService bean = context.getBean("fs", FoodService.class);

		/*
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the order name");
		String orderName = sc.next();
		System.out.println("Enter the customer name");
		String customerName = sc.next();
		System.out.println("Enter the price");
		float price = sc.nextFloat();
		System.out.println("Enter the about");
		sc.nextLine();
		String about = sc.nextLine();

		FoodProduct product = new FoodProduct();
		product.setOrderName(orderName);
		product.setCustomerName(customerName);
		product.setPrice(price);
		product.setAboutOrder(about);

		bean.storedData(product);
		

		System.out.println("\u001B[31m" + "All the product" + "\u001B[0m");
		bean.getAllOrder().forEach(System.out::println);

		System.out.println("\u001B[33m" + "product with id" + "\u001B[0m");
		System.out.println(bean.getOrderById(2));
		
		System.out.println("\u001B[35m" + "Updated Product" + "\u001B[0m");
		System.out.println(bean.cancelOrder(2));

		System.out.println("All order which are Cancel: ");
		bean.getOrderByStatus("Placed").forEach(System.out::println);
		
		*/
		
		System.out.println("Count : "+bean.getProductCountBasedOnStatus("Placed"));
		
		
		System.out.println("Count: "+bean.getProductCountBasedOnStatusAndPriceRange("Placed", 100, 1000));
		
		
		System.out.println("Order : ");
		bean.getOrderByName("Ice").forEach(System.out::println);
	}

}
