package com.atmapp.com.atm.transactions.domains;

import java.util.HashSet;
import java.util.Set;

import com.atmapp.com.atm.customer.domains.Customer;

public class Deposit extends Transaction {

	private double amount;
	private Customer customer;
	
	public Deposit() {
		
	}
	
	public Deposit(Deposit deposit) {
		this.setAmount(deposit.getAmount());
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
