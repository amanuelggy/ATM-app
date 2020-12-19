package com.atmapp.com.atm.transactions.domains;

import java.time.ZonedDateTime;

import com.atmapp.com.atm.transactions.enums.TransactionStatus;
import com.atmapp.com.atm.transactions.enums.TransactionType;

public class Transaction {
	private int transactionId;
	private TransactionStatus status;
	private TransactionType type;
	private ZonedDateTime createdAt;
	private ZonedDateTime updatedAt;
	
	public Transaction() {
		
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public TransactionStatus getStatus() {
		return status;
	}

	public void setStatus(TransactionStatus status) {
		this.status = status;
	}
	
	public TransactionType getType() {
		return type;
	}

	public void setType(TransactionType type) {
		this.type = type;
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
	
}
