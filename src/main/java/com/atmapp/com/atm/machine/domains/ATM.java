package com.atmapp.com.atm.machine.domains;

import java.util.HashSet;
import java.util.Set;

import com.atmapp.com.atm.customer.domains.Address;
import com.atmapp.com.atm.transactions.domains.Transaction;

public class ATM {
	private Long atmId;
	private Address location;
	private Set<Transaction> transactions = new HashSet<>();
	
	public ATM() {
		
	}

	public Long getAtmId() {
		return atmId;
	}

	public void setAtmId(Long atmId) {
		this.atmId = atmId;
	}

	public Address getLocation() {
		return location;
	}

	public void setLocation(Address location) {
		this.location = location;
	}

	public Set<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(Set<Transaction> transactions) {
		this.transactions = transactions;
	}
	
}
