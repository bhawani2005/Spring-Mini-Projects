package com.day03LabTask;

public class BankCustomer {
	private int customerId;
	private String customerName;
	private String accountType;
	private String branchName;
	
	public BankCustomer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	
	
	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	@Override
	public String toString() {
		return "BankCustomer [customerId=" + customerId + ", customerName=" + customerName + ", customerType="
				+ accountType + ", branchName=" + branchName + "]";
	}
	
	
}
