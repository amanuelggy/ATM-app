package com.atmapp.com.atm.customer.domains;

public class CheckingAccount extends Account {
	private String debitCardNumber;
	
	public CheckingAccount() {
		
	}

	public String getDebitCardNumber() {
		return debitCardNumber;
	}

	public void setDebitCardNumber(String debitCardNumber) {
		this.debitCardNumber = debitCardNumber;
	}
	
}
