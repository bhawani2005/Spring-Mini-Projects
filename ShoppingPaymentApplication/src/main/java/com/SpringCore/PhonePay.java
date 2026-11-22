package com.SpringCore;

public class PhonePay implements IPayment {

	private String qrCode;
	private String name;

	public PhonePay() {
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
		return "PhonePay [qrCode=" + qrCode + ", name=" + name + "]";
	}

	@Override
	public boolean paymentVarification() {
		String payment = qrCode.substring(qrCode.indexOf("#") + 1);

		return payment.equals("phonepay");
	}

}
