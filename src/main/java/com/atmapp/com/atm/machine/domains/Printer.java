package com.atmapp.com.atm.machine.domains;

public class Printer extends ATM {
	private Boolean printReceipt;
	
	public Printer() {
		
	}

	public Boolean getPrintReceipt() {
		return printReceipt;
	}

	public void setPrintReceipt(Boolean printReceipt) {
		this.printReceipt = printReceipt;
	}
	
}
