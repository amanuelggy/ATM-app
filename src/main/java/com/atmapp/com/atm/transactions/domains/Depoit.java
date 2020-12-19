package com.atmapp.com.atm.transactions.domains;

public class Depoit extends Transaction {

	private double amount;
	
	public Depoit() {
		
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
