package com.annoPropertySourceAndValueDay2;

import org.springframework.beans.factory.annotation.Value;

public class Account {
	private long accountNumber;
	private String accountHolderName;
	private String accountType;
	private double balance;
	private String branch;
	private String ifscCode;
	
	@Value("${aNumber}")
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	@Value("${aHolderName}")
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	@Value("${aType}")
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	@Value("${balance}")
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Value("${branch}")
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	@Value("${ifscCode}")
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", accountType="
				+ accountType + ", balance=" + balance + ", branch=" + branch + ", ifscCode=" + ifscCode + "]";
	}
	
	
}
