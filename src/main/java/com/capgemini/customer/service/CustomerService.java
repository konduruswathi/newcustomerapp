package com.capgemini.customer.service;

import com.capgemini.customer.entity.Customer;
import com.capgemini.customer.exception.AuthenticationFailedException;
import com.capgemini.customer.exception.CustomerNotFoundException;

public interface CustomerService {
public Customer addCustomer(Customer customer);
public Customer authenticateCustomer(int customerId,String password)throws AuthenticationFailedException;
public Customer updateCustomer(Customer customer);
public Customer findCustomerById(int customerId)throws CustomerNotFoundException;
public void deleteCustomer(int customerId);
}
