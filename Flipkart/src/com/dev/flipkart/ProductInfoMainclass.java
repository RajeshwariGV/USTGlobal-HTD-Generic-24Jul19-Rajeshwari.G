package com.dev.flipkart;

import java.util.Scanner;
public class ProductInfoMainclass {

	public static void main(String[] args) {
		ProductInfoImplementation P1 = new ProductInfoImplementation();
		  
		int button;
		
		ProductInfo p1 = new ProductInfo();
		p1.setProductID(413);
		p1.setProductName("Shirt");
		p1.setProductCost(1000);
		p1.setProductColor("Blue");
		p1.setDescription("Blue shirt from flipkart with low cost and high quality");
       
		

		ProductInfo p2 = new ProductInfo();
		p2.setProductID(414);
		p2.setProductName("Kurthi");
		p2.setProductCost(1500);
		p2.setProductColor("Black");
		p2.setDescription("Black Kurthi with low cost and high quality");
        
		ProductInfo p3 = new ProductInfo();
		p3.setProductID(415);
		p3.setProductName("TeaShirt");
		p3.setProductCost(800);
		p3.setProductColor("pink");
		p3.setDescription("Pink Teashirt from flipkart with low cost and highquality");

		ProductInfo p4 = new ProductInfo();
		p4.setProductID(416);
		p4.setProductName("1+7 Phone");
		p4.setProductCost(18000);
		p4.setProductColor("Blue");
		p4.setDescription("Blue Mobile from flipkart");
		
		System.out.println("****flipkart******");
	
		 System.out.println("product p1 "+p1);
	        System.out.println("product p2 "+p2);
	        System.out.println("product p3 "+p3);
	        System.out.println("product p4 "+p4);
	      
	}
}
	


