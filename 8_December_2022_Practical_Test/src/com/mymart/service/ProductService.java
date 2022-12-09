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
	
	public void searchProductByIDService(int ID)
	{
		dao.searchProductByID(ID);
	}
	
	public void deleteProductByIDService(int ID)
	{
		dao.deleteProductByID(ID);
	}

}
