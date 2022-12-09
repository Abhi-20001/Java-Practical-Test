package com.mymart.main;

import java.util.LinkedList;

import com.mymart.dao.ProductDAO;
import com.mymart.model.Product;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int a = sc.nextInt();
		
		// LinkedList<Product> l = new LinkedList<Product>();
		
		Product p = new Product(1,"Abhi",222.33);
		
		ProductDAO dao = new ProductDAO();
		
		dao.addProduct(p);
		
		LinkedList<Product> l = dao.getAllProducts();
		
		/*for(Product p1 : l)
			System.out.println(p1.getProductId()+" "+ p1.getProductName()+" "+ p1.getProductPrice());
		
		for(Product p1 :l)
			System.out.println(p1.getProductId()+" "+ p1.getProductName()+" "+ p1.getProductPrice());
		
		LinkedList<Product> l2 = dao.searchProductNameStartingWithLetter("A");
		System.out.println(l2);*/
		
		String s = dao.searchProductByID(0);
		System.out.println(s);
		
		/* do {
		
			switch(a)
			{
			case 1:System.out.println("Add New Product");
			break;
			case 2:System.out.println("View All Products");
			break;
			case 3:System.out.println("View all products starting with letter");
			break;
			case 4:System.out.println("View all products based on ID");
			break;
			case 5:System.out.println("Delete product based on ID");
			break;
			case 6:System.out.println("Exit");
			break;
			}
		}while(a != 0);
	*/
}
}
