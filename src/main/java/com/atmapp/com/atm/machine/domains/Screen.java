package com.atmapp.com.atm.machine.domains;

import com.atmapp.com.atm.transactions.enums.TransactionType;

public class Screen extends ATM {
	private Boolean showMessage;
	private TransactionType inputType;
	
	public Screen() {
		
	}

	public Boolean getShowMessage() {
		return showMessage;
	}

	public void setShowMessage(Boolean showMessage) {
		this.showMessage = showMessage;
	}

	public TransactionType getInputType() {
		return inputType;
	}

	public void setInputType(TransactionType inputType) {
		this.inputType = inputType;
	}
	
}
