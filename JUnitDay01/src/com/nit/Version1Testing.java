package com.nit;

import java.util.Arrays;

/*
 * 
 * This version is OK but if user change the class name,
 * method name, method parameter, return type at that time 
 * it will failed because we not validate all those things 
 * and all so we can not restrict them also 
 * 
 * Then in next version testing we will write code using reflection API.....
 * 
 * */

public class Version1Testing {

	public static void main(String[] args) {
		PrimeNumber pn = new PrimeNumber();

		if (pn.isPrime(5).equals(Arrays.asList(2, 3, 5)) && pn.isPrime(-5).equals(Arrays.asList())
				&& pn.isPrime(0).equals(Arrays.asList())
				&& pn.isPrime(20).equals(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19))) {
			System.out.println("All Test case Passed.");
		} else {
			int total = 4;
			int pass = 0;
			int fail = 0;

			if (pn.isPrime(5).equals(Arrays.asList(2, 3, 5))) {
				pass++;
			}

			if (pn.isPrime(-5).equals(Arrays.asList())) {
				pass++;
			}

			if (pn.isPrime(0).equals(Arrays.asList())) {
				pass++;
			}

			if (pn.isPrime(20).equals(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19))) {
				pass++;
			}
			
			fail = total-pass;
			System.out.println("Total: "+total);
			System.out.println("Pass: "+pass);
			System.out.println("Fail: "+fail);
		}

	}
}
