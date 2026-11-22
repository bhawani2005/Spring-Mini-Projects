package com.DesignPattern;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Image Prompt: ");
		String data = sc.nextLine();
		
		System.out.println("Enter type of plateform: ");
		String type = sc.nextLine();
		
		byte[] image = new DownloadImage().getImage(data, type);
		
		System.out.println(Arrays.toString(image));
		
		sc.close();
	}
}
