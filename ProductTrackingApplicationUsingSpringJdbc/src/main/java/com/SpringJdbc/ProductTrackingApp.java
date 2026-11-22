package com.SpringJdbc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ProductTrackingApp {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ProductDeliveryConfig.class);

		ProductDeliveryDAO bean = context.getBean("product", ProductDeliveryDAO.class);

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n================================");
			System.out.println("     PRODUCT DELIVERY SYSTEM");
			System.out.println("================================");
			System.out.println("1. Get Product Price");
			System.out.println("2. Get All Products");
			System.out.println("3. Insert Product");
			System.out.println("4. Delete Product");
			System.out.println("5. Update Product");
			System.out.println("6. Find and Count Product by Name");
			System.out.println("7. Products by Shipping Address");
			System.out.println("8. Exit");
			System.out.println("================================");

			System.out.print("Enter your choice: ");
			int choice = Integer.parseInt(sc.nextLine());

			switch (choice) {
			case 1:
				System.out.print("Enter Your product name:");
				String name = sc.nextLine();

				System.out.println("Products Price are: ");
				bean.getProductPriceByName(name).forEach(System.out::println);
				break;

			case 2:
				System.out.println("Products Details: ");
				System.out.println("==================");
				bean.getAllProduct().forEach(System.out::println);
				break;

			case 3:
				System.out.println("Enter product details for insert: ");
				ProductDelivery product = new ProductDelivery();
				System.out.print("Enter Product Name: ");
				product.setProductName(sc.nextLine());
				
				System.out.print("Enter shipping Address: ");
				product.setProductShippingAddress(sc.nextLine());
				
				System.out.println("Enter price: ");
				product.setProductPrice(Double.parseDouble(sc.nextLine()));
				
				System.out.println("Enter quantity: ");
				product.setProductQuantity(Integer.parseInt(sc.nextLine()));
				
				System.out.println("Enter Placed date: ");
				product.setProductPlaceDate(sc.nextLine());
				
				int rowCount = bean.insertProductDetails(product);
				if(rowCount>0) {
					System.out.println("Inserted Successfully.");
				}
				else {
					System.out.println("insert failed! Try again.... ");
				}
				break;

			case 4:
				System.out.print("Enter Product name: ");
				String pName = sc.nextLine();
				
				int dRowCount = bean.deleteProductDetails(pName);
				if (dRowCount>0) {
					System.out.println("Product Details deleted successfully.");
				}
				else {
					System.out.println("delete failed! Try again.... ");
				}
				break;

			case 5:
				System.out.print("Enter Product Name for Update: ");
				String uName = sc.nextLine();
				
				System.out.print("Enter New Shipping Address: ");
				String newShippingAddress = sc.nextLine();
				
				System.out.print("Enter New Placed date: ");
				String newPlacedDate = sc.nextLine();
				
				int uRowCount = bean.updateProductDetails(newShippingAddress, newPlacedDate, uName);
				
				if (uRowCount>0) {
					System.out.println("Product Updated successfully.");
				}
				else {
					System.out.println("update failed! Try again.... ");
				}
				break;

			case 6:
				System.out.print("Enter Name for count: ");
				String cName = sc.nextLine();
				
				int count = bean.countProductByName(cName);
				System.out.println("Total "+cName+" are: "+count);
				break;

			case 7:
				System.out.print("Enter shipping Address: ");
				String pAddress = sc.nextLine();
				
				bean.getProductDetailsByShippingAdd(pAddress).forEach(System.out::println);
				break;

			case 8:
				System.out.println("Thank You!");
				System.exit(0);
				break;

			default:
				break;
			}

		}
	}
}
