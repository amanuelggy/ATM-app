package com.atmapp.com.atm.transactions.domains;

public class Withdraw extends Transaction {
	private Integer amount;
	
	public Withdraw() {
		//--
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
}
