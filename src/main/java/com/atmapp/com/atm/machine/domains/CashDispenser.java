package com.atmapp.com.atm.machine.domains;

public class CashDispenser extends ATM {
	private Integer totalFiveDollarBills;
	private Integer totalTwentyDollarBills;
	private Integer totalFiftyDollarBills;
	private Integer totalHandredDollarBills;
	private Boolean dispenseCash;
	private Boolean canDispenseCash;
	
	public CashDispenser() {
		
	}

	public Integer getTotalFiveDollarBills() {
		return totalFiveDollarBills;
	}

	public void setTotalFiveDollarBills(Integer totalFiveDollarBills) {
		this.totalFiveDollarBills = totalFiveDollarBills;
	}

	public Integer getTotalTwentyDollarBills() {
		return totalTwentyDollarBills;
	}

	public void setTotalTwentyDollarBills(Integer totalTwentyDollarBills) {
		this.totalTwentyDollarBills = totalTwentyDollarBills;
	}

	public Integer getTotalFiftyDollarBills() {
		return totalFiftyDollarBills;
	}

	public void setTotalFiftyDollarBills(Integer totalFiftyDollarBills) {
		this.totalFiftyDollarBills = totalFiftyDollarBills;
	}

	public Integer getTotalHandredDollarBills() {
		return totalHandredDollarBills;
	}

	public void setTotalHandredDollarBills(Integer totalHandredDollarBills) {
		this.totalHandredDollarBills = totalHandredDollarBills;
	}

	public Boolean getDispenseCash() {
		return dispenseCash;
	}

	public void setDispenseCash(Boolean dispenseCash) {
		this.dispenseCash = dispenseCash;
	}

	public Boolean getCanDispenseCash() {
		return canDispenseCash;
	}

	public void setCanDispenseCash(Boolean canDispenseCash) {
		this.canDispenseCash = canDispenseCash;
	}
	
}
