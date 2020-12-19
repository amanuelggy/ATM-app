package com.atmapp.com.atm.machine.domains;

public class DepositSlot extends ATM {
	private Double totalAmount;
	
	public DepositSlot() {
		
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
}
