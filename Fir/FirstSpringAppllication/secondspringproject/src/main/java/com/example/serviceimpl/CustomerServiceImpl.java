package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.CustomerNotFoundException;
import com.example.model.Customer;
import com.example.repository.CustomerRepository;
import com.example.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository repo;
	
	@Override
	//Saving Customer details by jpa repository save()
	public Customer saveCustomer(Customer customer) {
		return repo.save(customer) ;
	}

	@Override
	//fetching all Customer details by jpa repository findAll()
	public List<Customer> getAllCustomer() {
		return repo.findAll();
	}

	@Override
	//fetching Customer details by jpa repository
	public Customer getCustomerById(int id) {
	//find by id , if not present then throw custom exception
		return repo.findById(id).orElseThrow(() -> new CustomerNotFoundException("Customer not found in table"));
	}

	@Override
	public Customer updateCustomerById(Customer customer, int id) {
		//find by id , if not present then throw custom exception
		Customer exitcustomer = repo.findById(id).orElseThrow(() -> new CustomerNotFoundException("Customer not found in table"));
		//set new value
		exitcustomer.setCustomerEmail(customer.getCustomerEmail());
		exitcustomer.setPhnNumber(customer.getPhnNumber());
		repo.save(exitcustomer);
		return null ;
	}

	@Override
	//fetching Customer details using jpa repository findById and removing it using deleteById
	public void deleteCustomerById(int id) {
	
		repo.findById(id).orElseThrow(() -> new CustomerNotFoundException("Customer not found in table"));
		repo.deleteById(id);
		
	}
	

}
