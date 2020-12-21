package com.atmapp.com.atm.customer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atmapp.com.atm.customer.domains.Customer;
import com.atmapp.com.atm.customer.services.CustomerService;
import com.atmapp.com.atm.transactions.domains.Deposit;
import com.atmapp.com.atm.transactions.enums.TransactionType;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/create/account")
	public Customer createAccount(@RequestBody Customer customer) throws Exception {
		Customer account = customerService.createUser(customer);
		return account;
	}
	
	@PostMapping("/person/{userId}/deposit/type/{type}")
	public Deposit deposit(@RequestBody Deposit deposit, @PathVariable(value = "userId") Long userId, @PathVariable(value="type") TransactionType type) throws Exception {
		if (deposit == null) {
			throw new Exception("Deposit amount can not be null");
		}
		
		return customerService.deposit(deposit, userId, type);
	}

}
