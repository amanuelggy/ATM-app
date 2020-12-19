package com.atmapp.com.atm.machine.domains;

import com.atmapp.com.atm.customer.domains.Address;

public class ATM {
	private Long atmId;
	private Address location;
	
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
	
}
