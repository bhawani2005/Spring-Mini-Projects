package com.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankServiceProxy implements BankService {
	
	@Autowired
	private BankServiceImp service;

	@Override
	public void deposit(double amount) {
		if(amount>0) {
			service.deposit(amount);
		}
		else {
			System.out.println("Invalid Amount.");
		}
	}

	@Override
	public void withdraw(double amount) {
		if(amount>0 && amount<service.getBalance()) {
			service.withdraw(amount);
		}
		else {
			System.out.println("Invalid Amount.");
		}
	}

	@Override
	public double checkBalance() {
		return service.checkBalance();
	}

}
