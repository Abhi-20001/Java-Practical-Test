package com.example.service;

import java.util.List;

import com.example.model.Customer;

//Customer Service interface
public interface CustomerService {
	
	//inserting Customer details in table
	Customer saveCustomer(Customer Customer);
	
	//fetching all Customer details from table
	List<Customer>getAllCustomer();
	
	//fetching Customer details from table
	Customer getCustomerById(int id);
	
	//modifying Customer details from table based on Customer id
	Customer updateCustomerById(Customer customer, int id);
	
	//remove Customer details from table based on Customer id
	void deleteCustomerById(int id);

}


