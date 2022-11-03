package com.mystore.model;

public class Product {
	int productId;
	String productName;
	double productPrice;
	
	public Product()
	{
		System.out.println("Without Parameter");
	}
	
	public Product(int prID)
	{
		productId = prID;
	}
	
	public Product(String prName)
	{
		productName = prName;
	}
	
	public Product(double prPrice)
	{
		productPrice = prPrice;
	}
	
	public Product(int prID,String prName,double prPrice)
	{
		productId = prID;
		productName = prName;
		productPrice = prPrice;
	}
	
	public void setProductId(int prID)
	{
		productId = prID;
	}
	
	public void setProductName(String prName)
	{
		productName = prName;
	}
	
	public void setProductPrice(double prPrice)
	{
		productPrice = prPrice;
	}
	
	public int getProductId()
	{
		return productId;
	}
	
	public String getProductName()
	{
		return productName;
	}
	
	public double getProductPrice()
	{
		return productPrice;
	}
}
