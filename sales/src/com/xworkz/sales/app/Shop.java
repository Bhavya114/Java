package com.xworkz.sales.app;

public class Shop {
	public String shopName="Dmart";
	public Salesman salesman=new Salesman();
	
	public void storeProduct() {
		System.out.println("Invoking storeProduct in Shop");
		
		if(this.salesman!=null) {
			
			this.salesman.sellProduct();
		
		}
		else {
			System.out.println("cannot access sellProduct");
		}
		

		if(this.salesman!=null) {
			
			this.salesman.provideService();
		
		}
		else {
			System.out.println("cannot access provideService");
		}
		
	}
	public void printInfo() {
		System.out.println("Shop name is: "+shopName);
	}
}
