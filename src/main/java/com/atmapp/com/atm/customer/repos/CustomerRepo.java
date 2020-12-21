package com.atmapp.com.atm.customer.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.atmapp.com.atm.customer.domains.Customer;


@Repository
public interface CustomerRepo extends CrudRepository<Customer, Long> {

	Customer save(Customer newCustomer);



}
