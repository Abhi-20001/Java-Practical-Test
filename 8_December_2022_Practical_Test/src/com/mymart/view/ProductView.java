package com.mymart.view;

import java.util.LinkedList;

import com.mymart.model.Product;
import com.mymart.service.ProductService;

public class ProductView {
	ProductService ps = new ProductService();
	
	public void addProduct()
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the Product ID :");
		int ID = sc.nextInt();
		
		System.out.println("Enter the Product Name :");
		String Name = sc.next();
		
		System.out.println("Enter the Product Price :");
		double Price = sc.nextDouble();
		
		Product p = new Product(ID,Name,Price);
		
		ps.addProductService(p);
	}
	
	public void displayAllProduct()
	{
		LinkedList<Product> l = ps.getAllProductService();
		for(Product p : l)
		{
			System.out.println("The Product Details are :\n");
			System.out.println("The Product ID is :"+ p.getProductId());
			System.out.println("The Product Name is :"+ p.getProductName());
			System.out.println("The Product Price is :"+ p.getProductPrice());
		}
	}
	
	public void displayAllProductsStartingWithLetter()
	{
		java.util.Scanner c = new java.util.Scanner(System.in);
		System.out.println("Enter the Letter to check :");
		String s = c.next();
		
		LinkedList<Product> l = ps.searchProductNameStartingWithLetterService(s);
		for(Product p : l)
		{
			System.out.println("The Product Details are \n");
			System.out.println("The Product ID is :"+ p.getProductId());
			System.out.println("The Product Name is :"+ p.getProductName());
			System.out.println("The Product Price is :"+ p.getProductPrice());
		}
	}
	
	public void displayProductByID()
	{
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter the ID :");
		int ID = scanner.nextInt();
		
		ps.searchProductByIDService(ID);
	}
	
	public void removeProductByID()
	{
		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.println("Enter the ID :");
		int ID = scan.nextInt();
		
		ps.deleteProductByIDService(ID);
	}
}
