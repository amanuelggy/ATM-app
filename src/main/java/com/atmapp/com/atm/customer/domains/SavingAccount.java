package com.atmapp.com.atm.customer.domains;

public class SavingAccount extends Account {
	private double withdrawalLimit;
	
	public SavingAccount() {
		
	}

	public double getWithdrawalLimit() {
		return withdrawalLimit;
	}

	public void setWithdrawalLimit(double withdrawalLimit) {
		this.withdrawalLimit = withdrawalLimit;
	}
	
}
