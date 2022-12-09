package com.mymart.dao;

import java.util.LinkedList;
import com.mymart.model.*;

public class ProductDAO {
	
	private static LinkedList<Product> l = new LinkedList<Product>();
	
	
	public void addProduct(Product p)
	{
		l.add(p);
	}
	
	public LinkedList<Product> getAllProducts()
	{
		return l;
	}
	
	public LinkedList<Product> searchProductNameStartingWithLetter(String c)
	{
		LinkedList<Product> l2 = new LinkedList<Product>();
		for(Product p1 : l)
		{
			if(p1.getProductName().startsWith(c))
			{
				l2.add(p1);
			}
		}
		return l2;
	}
	
	public void searchProductByID(int ID)
	{
		int n = ID;
		String s = new String();
		for(Product p1 : l )
		{
			if(p1.getProductId()==n)
			{
				System.out.println("The Product Details are :");
				System.out.println("The Product ID is :"+p1.getProductId()); 
				System.out.println("The Product Name is :"+ p1.getProductName()); 
				System.out.println("The Product Price is :"+ p1.getProductPrice());
			}
		}
	}
	
	public LinkedList<Product> deleteProductByID(int ID)
	{
		for(Product p1 : l)
		{
			if(p1.getProductId()==ID)
			{
				l.remove(p1);
			}
		}
		return l;
	}
}
