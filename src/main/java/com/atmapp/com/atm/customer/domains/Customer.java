package com.atmapp.com.atm.customer.domains;


import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

import com.atmapp.com.atm.customer.enums.CustomerStatus;
import com.atmapp.com.atm.transactions.domains.Transaction;

public class Customer {
	private Long userId;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private Set<Address> address = new HashSet<Address>();
	private CustomerStatus status;
	private Boolean canMakeTransaction = false;
	private Set<Card> card = new HashSet<Card>();
	private Set<Account> account = new HashSet<Account>();
	private Set<Transaction> transactions = new HashSet<Transaction>();
	private ZonedDateTime createdAt;
	private ZonedDateTime updatedAt;
	
	public Customer() {
		//--
	}
	public Customer(Customer customer) {
		this.setFirstName(customer.getFirstName());
		this.setLastName(customer.getLastName());
		this.setEmail(customer.getEmail());
		this.setPhone(customer.getEmail());
		this.setAddress(customer.getAddress());
	}
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	public CustomerStatus getStatus() {
		return status;
	}

	public void setStatus(CustomerStatus status) {
		this.status = status;
	}

	public Boolean getCanMakeTransaction() {
		return canMakeTransaction;
	}

	public void setCanMakeTransaction(Boolean canMakeTransaction) {
		this.canMakeTransaction = canMakeTransaction;
	}

	public ZonedDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(ZonedDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public ZonedDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(ZonedDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Set<Card> getCard() {
		return card;
	}

	public void setCard(Set<Card> card) {
		this.card = card;
	}
	public Set<Account> getAccount() {
		return account;
	}
	public void setAccount(Set<Account> account) {
		this.account = account;
	}
	public Set<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(Set<Transaction> transactions) {
		this.transactions = transactions;
	}
	
}
