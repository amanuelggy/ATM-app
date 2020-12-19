package com.atmapp.com.atm.machine.domains;

public class CheckDepoitSlot extends DepositSlot {
	private Boolean checkAmount;
	
	public CheckDepoitSlot() {
		
	}

	public Boolean getCheckAmount() {
		return checkAmount;
	}

	public void setCheckAmount(Boolean checkAmount) {
		this.checkAmount = checkAmount;
	}
		
}
