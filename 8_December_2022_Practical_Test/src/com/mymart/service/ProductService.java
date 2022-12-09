package com.mymart.service;

import java.util.LinkedList;

import com.mymart.dao.ProductDAO;
import com.mymart.model.Product;


public class ProductService {
	
	ProductDAO dao = new ProductDAO();
	
	void addProductService(Product p)
	{
		dao.addProduct(p);
	}
	
	LinkedList<Product> getAllProductService()
	{
		LinkedList<Product> s = dao.getAllProducts();
		return s;
	}
	
	LinkedList<Product> searchProductNameStartingWithLetterService(String s)
	{
		LinkedList<Product> l = new LinkedList<>();
		l.addAll(dao.searchProductNameStartingWithLetter(s));
		return l;
	}
	
	String searchProductByIDService(int ID)
	{
		String s = dao.searchProductByID(ID);
		return s;
	}
	
	LinkedList<Product> deleteProductByIDService(int ID)
	{
		
	}

}
