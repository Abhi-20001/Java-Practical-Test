package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Customer;
import com.example.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	   private CustomerService us;
	   //saving Customer details using rest api post mapping
	   @PostMapping("/save")
	   public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
		   return new ResponseEntity<Customer>(us.saveCustomer(customer),HttpStatus.CREATED);  
	}
	   // get Customer details using rest api get Mapping
	   @GetMapping("/getcustomer")
	   public List<Customer> getAllCustomer(){
		   return us.getAllCustomer();
	   }
	   
	   // get Customer details from table using rest api GET mapping with id attribute
	   @GetMapping("/getcustomerbyid/{id}")
	   public ResponseEntity<Customer> getCustomerById(@PathVariable("id")int id){
		   return new ResponseEntity<Customer>(us.getCustomerById(id),HttpStatus.OK);
		  
	   }
	   
	   //updating Customer details from table using rest api PUT mapping with id attribute
	   @PutMapping("/updatebyid/{id}")
	   public ResponseEntity<Customer> updateCustomerById(@PathVariable("id") int id, @RequestBody Customer customer){
		   return new ResponseEntity<Customer> (us.updateCustomerById(customer,id),HttpStatus.OK);
	   }
	
	   //delete Customer details from table using rest api delete mapping using id attribute
	   @DeleteMapping("/deletecustomer/{id}")
	   public ResponseEntity<String> deleteCustomerById(@PathVariable("id") int id){
		   us.deleteCustomerById(id);
		   return new ResponseEntity<String>("Customer deleted Successfully",HttpStatus.OK);
	   }
}