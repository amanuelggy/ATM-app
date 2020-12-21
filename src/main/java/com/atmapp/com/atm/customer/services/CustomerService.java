package com.atmapp.com.atm.customer.services;

import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Optional;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atmapp.com.atm.customer.domains.Account;
import com.atmapp.com.atm.customer.domains.Card;
import com.atmapp.com.atm.customer.domains.Customer;
import com.atmapp.com.atm.customer.enums.CardType;
import com.atmapp.com.atm.customer.repos.CustomerRepo;
import com.atmapp.com.atm.transactions.domains.Deposit;
import com.atmapp.com.atm.transactions.domains.Transaction;
import com.atmapp.com.atm.transactions.enums.TransactionStatus;
import com.atmapp.com.atm.transactions.enums.TransactionType;
import com.atmapp.com.atm.transactions.repo.DepositRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepo;
	
	@Autowired
	private DepositRepo depositRepo;
	
	
	public Customer createUser(Customer customer) throws Exception {
		validateInfo(customer);
		
		Customer newCustomer = creatAccountAndGenerateCard(customer);
		
		Customer saved = customerRepo.save(newCustomer);
		
		return saved;
	}

	public Customer createAccount(Customer customer) {
		
		return null;
	}

	protected Customer creatAccountAndGenerateCard(Customer customer) {
		Random rand = new Random();
		Integer number = rand.nextInt((10000000 - 1000000) + 1) + 1000000;
		String customerName = customer.getFirstName() + " " + customer.getLastName();
		ZonedDateTime cardExpiry = ZonedDateTime.now();
		cardExpiry = cardExpiry.plusYears(3L);
		
		Customer newCustomer = new Customer(customer);
		
		// create Account
		Account account = new Account();
		account.setAccountNumber(number);
		account.setTotalBalance(0);
		account.setAvailableBalance(0);
		Set<Account> accounts = new HashSet<Account>();
		accounts.add(account);
		newCustomer.setAccount(accounts);
		
		// create card
		Card card = new Card();
		int randThreeDigit = rand.nextInt((999 - 100) + 1) + 100;
		card.setCardNumber(number + "" + randThreeDigit);
		card.setCustomerName(customerName);
		card.setCardType(CardType.DEBIT_CARD);
		card.setCardExpiry(cardExpiry);
		card.setPin(1111);
		Set<Card> cards = new HashSet<Card>();
		cards.add(card);
		newCustomer.setCard(cards);
		
		return newCustomer;
	}

	private void validateInfo(Customer customer) throws Exception {
		if (customer == null) {
			throw new Exception("customer info can not be empty");
		}
		
		else if (customer.getFirstName() == null || customer.getLastName() == null) {
			throw new Exception("customer info can not be empty");
		}
		
		else if (customer.getPhone() == null || customer.getAddress() == null) {
			throw new Exception("customer info can not be empty");			
		}
		
	}

	public Deposit deposit(Deposit deposit, Long userId, TransactionType type) {
		

		Deposit preDeposit = new Deposit(deposit);
		deposit.setType(type);
		deposit.setStatus(TransactionStatus.INITIATE);
		
		// find person
		Optional<Customer> customer = customerRepo.findById(userId);
		if (customer.isPresent()) {
			deposit.setCustomer(customer.get());			
		}

		// Best way to do this would be to make Gateway request and save the transaction record
		Deposit saved = depositRepo.save(preDeposit);
		Deposit deposited = null;
		if (saved != null) {
			// update status to success
			saved.setStatus(TransactionStatus.SUCCESS);
			deposited = depositRepo.save(saved);
		} else {
			// update status to success
			saved.setStatus(TransactionStatus.FAILURE);
			deposited = depositRepo.save(saved);
		}
		return deposited;
	}

}
