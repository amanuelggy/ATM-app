package com.atmapp.com.atm.machine.domains;

import java.util.HashSet;
import java.util.Set;

public class Bank {
	
	private String name;
	private String bankCode;
	private Boolean addATM;
	private Set<ATM> atm = new HashSet();
	
	public Bank() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public Boolean getAddATM() {
		return addATM;
	}

	public void setAddATM(Boolean addATM) {
		this.addATM = addATM;
	}

	public Set<ATM> getAtm() {
		return atm;
	}

	public void setAtm(Set<ATM> atm) {
		this.atm = atm;
	}
	
}
