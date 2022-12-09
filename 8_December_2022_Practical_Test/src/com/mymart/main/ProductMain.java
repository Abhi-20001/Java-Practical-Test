package com.mymart.main;

import com.mymart.view.ProductView;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductView pv = new ProductView();
		
		int choice;
		
		do{
			java.util.Scanner sc = new java.util.Scanner(System.in);
			
			System.out.println("1.Add Product");
			System.out.println("2.View All Products");
			System.out.println("3.View all products starting with letter");
			System.out.println("4.View all products based on ID");
			System.out.println("5.Delete product based on ID");
			System.out.println("0.Exit\n");
			
			System.out.println("Enter Your Choice");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:pv.addProduct();
			break;
			case 2:pv.displayAllProduct();
			break;
			case 3:pv.displayAllProductsStartingWithLetter();
			break;
			case 4:pv.displayProductByID();
			break;
			case 5:pv.removeProductByID();
			break;
			case 0:
			break;
			}
		}while(choice != 0);
	}
}
