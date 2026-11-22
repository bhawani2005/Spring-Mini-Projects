package com.SpringCore;

import java.util.concurrent.CopyOnWriteArrayList;

public class Paytem implements IPayment {
	
	private String qrCode;
	private String name;
	
	
	
	public Paytem() {
		super();
	}



	public String getQrCode() {
		return qrCode;
	}



	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Paytem [qrCode=" + qrCode + ", name=" + name + "]";
	}



	@Override
	public boolean paymentVarification() {
		String payment = qrCode.substring(qrCode.indexOf("#")+1);
		
		return payment.equals("paytem");
	}

}
