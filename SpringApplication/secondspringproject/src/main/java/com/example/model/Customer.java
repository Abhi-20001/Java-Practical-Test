package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
	@Table(name = "customerdetails")
	public class Customer {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		
		public Customer(int id, @NotBlank(message = "Please Enter Your CustomerName!!!") String uName,
				@NotBlank(message = "Please Enter Your Email!!!") @Email String customerEmail, long phnNumber) {
			super();
			this.id = id;
			this.uName = uName;
			this.customerEmail = customerEmail;
			this.phnNumber = phnNumber;
		}

		@Column(length = 30 , nullable = false)
		@NotBlank(message="Please Enter Your CustomerName!!!")
		private String uName;

		@Column(length = 30 , nullable = false, unique = true)
		@NotBlank(message="Please Enter Your CustomerEmail!!!")
		@Email
		private String customerEmail;
		//public Customer (String uName) {
		//	this.uName=uName;
		//}
		
		@Column(length = 10 , nullable = false, unique = true)
		private long phnNumber;
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getuName() {
			return uName;
		}

		public void setuName(String uName) {
			this.uName = uName;
		}

		public String getCustomerEmail() {
			return customerEmail;
		}

		public void setCustomerEmail(String userEmail) {
			this.customerEmail = userEmail;
		}

		public long getPhnNumber() {
			return phnNumber;
		}

		public void setPhnNumber(long phnNumber) {
			this.phnNumber = phnNumber;
		}			
	}

