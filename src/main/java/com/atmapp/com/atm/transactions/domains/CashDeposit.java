package com.atmapp.com.atm.transactions.domains;

public class CashDeposit extends Deposit {
	private Integer cashDepoitLimit;
	
	public CashDeposit() {
		
	}

	public Integer getCashDepoitLimit() {
		return cashDepoitLimit;
	}

	public void setCashDepoitLimit(Integer cashDepoitLimit) {
		this.cashDepoitLimit = cashDepoitLimit;
	}
	
}
