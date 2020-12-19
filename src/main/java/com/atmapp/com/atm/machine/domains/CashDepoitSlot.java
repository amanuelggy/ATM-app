package com.atmapp.com.atm.machine.domains;

public class CashDepoitSlot extends DepositSlot {
	private Boolean receiveDollarBill;
	
	public CashDepoitSlot() {
		
	}

	public Boolean getReceiveDollarBill() {
		return receiveDollarBill;
	}

	public void setReceiveDollarBill(Boolean receiveDollarBill) {
		this.receiveDollarBill = receiveDollarBill;
	}
	
}
