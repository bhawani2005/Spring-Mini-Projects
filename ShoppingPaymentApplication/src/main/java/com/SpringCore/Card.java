package com.SpringCore;

public class Card implements IPayment {
	
	private String cardName;
	private String cardNumber;
	
	
	
	public Card() {
		super();
	}



	
	public String getCardName() {
		return cardName;
	}




	public void setCardName(String cardName) {
		this.cardName = cardName;
	}




	public String getCardNumber() {
		return cardNumber;
	}




	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}




	@Override
	public String toString() {
		return "Card [cardName=" + cardName + ", cardNumber=" + cardNumber + "]";
	}




	@Override
	public boolean paymentVarification() {
		return (cardName.equals("ICICI_DebitCard")||cardName.equals("SBI_DebitCard")) && cardNumber.length()==13;
	}

}
