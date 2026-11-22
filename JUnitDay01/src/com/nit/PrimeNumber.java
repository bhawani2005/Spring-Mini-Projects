package com.nit;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
	
	public List<Integer> isPrime(int n){
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=2; i<=n; i++) {
			boolean isPrime = true;
			
			for(int j=2; j<=i/2; j++) {
				if(i%j==0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) {
				list.add(i);
			}
		}
		
		return list;
	}
}
