package com.nit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Version2Testing {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Class<?> forName = null;
		
		try {
			forName = Class.forName("com.nit.PrimeNumber");
		} catch (ClassNotFoundException e) {
			System.err.println("Class Not Found.");
		}
		
		if(!forName.getSimpleName().equals("PrimeNumber")) {
			System.out.println("Check! Class Name should be PrimeNumber");
		}
		
		Method declaredMethod = null;
		
		try {
			declaredMethod = forName.getDeclaredMethod("isPrime", int.class);
		} catch (NoSuchMethodException | SecurityException e) {
			System.err.println("Method not found.");
			System.out.println("Check! Method Name should be isPrime and Parameter type should be int.");
		}
		
		if (!declaredMethod.getReturnType().equals(List.class)) {
			System.out.println("Method return type Mismatch.");
		}
		
		Object newInstance = null;
		
		try {
			newInstance = forName.getDeclaredConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			System.err.println("Constructor Parameter mismatch!");
		}
		
		
		List<Integer> result1 = null;
		List<Integer> result2 = null;
		List<Integer> result3 = null;
		List<Integer> result4 = null;
		try {
			result1 = (List<Integer>) declaredMethod.invoke(newInstance, 5);
			result2 = (List<Integer>) declaredMethod.invoke(newInstance, -5);
			result3 = (List<Integer>) declaredMethod.invoke(newInstance, -0);
			result4 = (List<Integer>) declaredMethod.invoke(newInstance, 20);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
		if (result1.equals(Arrays.asList(2, 3, 5)) && result2.equals(Arrays.asList())
				&& result3.equals(Arrays.asList())
				&& result4.equals(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19))) {
			System.out.println("All Test case Passed.");
			System.out.println("Total: 4");
			System.out.println("Pass: 4");
			System.out.println("Fail: 0");
		} else {
			int total = 4;
			int pass = 0;
			int fail = 0;

			if (result1.equals(Arrays.asList(2, 3, 5))) {
				pass++;
			}

			if (result2.equals(Arrays.asList())) {
				pass++;
			}

			if (result3.equals(Arrays.asList())) {
				pass++;
			}

			if (result4.equals(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19))) {
				pass++;
			}
			
			fail = total-pass;
			System.out.println("Total: "+total);
			System.out.println("Pass: "+pass);
			System.out.println("Fail: "+fail);
		}
	}
}
