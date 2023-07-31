package com.xworkz.sales.boot;

import com.xworkz.sales.app.Shop;

public class ShopKiller {
	public static void main(String[] args) {

		System.out.println("Running main in ShopKiller");
		
		Shop shop =new Shop();
		
		shop.printInfo();
		shop.storeProduct();
	}
}
