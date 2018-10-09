package com.capgemini.customer.repository;



import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.customer.entity.Customer;

public interface CustomerRepository extends MongoRepository<Customer,Integer>{

	
	
}

