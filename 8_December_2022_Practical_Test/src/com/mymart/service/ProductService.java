package com.mymart.service;

import java.util.LinkedList;

import com.mymart.dao.ProductDAO;
import com.mymart.model.Product;


public class ProductService {
	
	ProductDAO dao = new ProductDAO();
	
	public void addProductService(Product p)
	{
		dao.addProduct(p);
	}
	
	public LinkedList<Product> getAllProductService()
	{
		LinkedList<Product> s = dao.getAllProducts();
		return s;
	}
	
	public LinkedList<Product> searchProductNameStartingWithLetterService(String s)
	{
		LinkedList<Product> l = new LinkedList<>();
		l.addAll(dao.searchProductNameStartingWithLetter(s));
		return l;
	}
	
	public String searchProductByIDService(int ID)
	{
		String s = dao.searchProductByID(ID);
		return s;
	}
	
	public LinkedList<Product> deleteProductByIDService(int ID)
	{
		LinkedList<Product> l = new LinkedList<>();
		l = dao.deleteProductByID(ID);
		return l;
	}

}
