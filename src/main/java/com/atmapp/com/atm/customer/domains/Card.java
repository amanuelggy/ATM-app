package com.atmapp.com.atm.customer.domains;

import java.time.ZonedDateTime;

import com.atmapp.com.atm.customer.enums.CardType;

public class Card {
	private Long cardId;
	private String cardNumber;
	private String customerName;
	private ZonedDateTime cardExpiry;
	private int pin;
	private CardType cardType;
	
	public Card() {
		
	}
	
	public Long getCardId() {
		return cardId;
	}

	public void setCardId(Long cardId) {
		this.cardId = cardId;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public ZonedDateTime getCardExpiry() {
		return cardExpiry;
	}

	public void setCardExpiry(ZonedDateTime cardExpiry) {
		this.cardExpiry = cardExpiry;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public CardType getCardType() {
		return cardType;
	}

	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}
	
}
