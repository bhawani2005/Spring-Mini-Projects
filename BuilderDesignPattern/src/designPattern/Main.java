package designPattern;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		A a = new ABuilder().setNum1(100).setNum2(200).build();
		System.out.println(a);
		
		
		System.out.println("Enter Booking Details: ");
		System.out.println("Enter source: ");
		String source = sc.nextLine();
		System.out.println("Enter destination: ");
		String destination = sc.nextLine();
		System.out.println("Enter passengers: ");
		int passengers = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter travelClass: ");
		String travelClass = sc.nextLine();
		
		TravelBooking book = new TravelBookingBooker().setSource(source).setDestination(destination)
		.setPassengers(passengers).setTravelClass(travelClass)
		.book();
		
		System.out.println(book);
	}
}
