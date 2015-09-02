package com.app.service;

import java.util.List;

import com.app.entity.Customer;

public interface CustomerService {

	/**
	 * Save customer object.
	 * @param customer
	 * @return
	 */
	public Customer saveCustomer(Customer customer);

	public List<Customer> findAllCustomer();

}
