package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.model.Customer;

public class TestCustomerServiceImpl {

		Customer c=new Customer(1,"Omkar","Omkarnarveer07@gmail.com",702882006);
		@Test
		//Negative Testing
		public void testgetuName() {
			assertEquals("Omkar",c.getuName());
		}		
}

