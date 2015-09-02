package com.app.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.entity.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String>{
	
	
}
