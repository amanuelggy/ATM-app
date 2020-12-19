package com.atmapp.com.atm.transactions.domains;

public class CheckDepoit extends Depoit {
	private String checkNumber;
	private String bankCode;
	
	public CheckDepoit() {
		
	}

	public String getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
}
