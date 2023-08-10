package com.xworkz.encapsulation.app.boot;

import com.xworkz.encapsulation.app.Amazon;

public class AmazonRunner {

public static void main(String[] args) {
		
		Amazon amazon=new Amazon();
		amazon.setAverageRating(4.4);
		amazon.setCategory("Clothes");
		amazon.setCustomerEmail("archa@gmail.com");
		amazon.setCustomerName("Sanjay");
		amazon.setDescription("Good products");
		amazon.setGiftWrapAvailable(true);
		amazon.setOrderDate("18-9-2023");
		amazon.setPrice(1800.98);
		amazon.setPrimeEligible(true);
		amazon.setProductName("Jeans Tops");
		amazon.setRatingsCount(9);
		amazon.setReturnAllowed(false);
		amazon.setSellerName("Ajith K");
		amazon.setShippingAddress("Rjajjinagar Bangalore");
		
		System.out.println(amazon.getAverageRating());
		System.out.println(amazon.getCategory());
		System.out.println(amazon.getCustomerEmail());
		System.out.println(amazon.getCustomerName());
		System.out.println(amazon.getDescription());
		System.out.println(amazon.getOrderDate());
		System.out.println(amazon.getPrice());
		System.out.println(amazon.getProductName());
		System.out.println(amazon.getRatingsCount());
		System.out.println(amazon.getSellerName());
		System.out.println(amazon.getShippingAddress());
		System.out.println(amazon.isGiftWrapAvailable());
		System.out.println(amazon.isPrimeEligible());
		System.out.println(amazon.isReturnAllowed());
		
	}
}
