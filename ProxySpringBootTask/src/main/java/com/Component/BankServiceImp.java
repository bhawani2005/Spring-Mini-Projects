package com.Component;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "bankdetails")
public class BankServiceImp implements BankService {

	private double balance;
	
	
	public BankServiceImp() {
		super();
	}


	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposit done Successfully.");

	}

	@Override
	public void withdraw(double amount) {
		this.balance -= amount;
		System.out.println("Withdraw done successfully.");
	}

	@Override
	public double checkBalance() {
		return this.balance;
	}

}
