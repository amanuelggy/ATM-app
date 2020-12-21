package com.atmapp.com.atm.transactions.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.atmapp.com.atm.transactions.domains.Deposit;

@Repository
public interface DepositRepo extends CrudRepository<Long, Deposit>{

	Deposit save(Deposit preDeposit);

}
