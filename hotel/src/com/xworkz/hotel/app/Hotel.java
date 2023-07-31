package com.xworkz.hotel.app;

public class Hotel {
public String name="Bhavya";
	
	public Cook cook =new Cook();
	
	public void provideFood() {
		
		System.out.println("Invoking provideFood in Hotel");
		
		if(this.cook!=null) {
			this.cook.prepareFood();
		}
		else {
			System.out.println("Cannot access Cook(NullPointerException)");
		}
		if(this.cook!=null) {
			this.cook.cleanKitchen();
		}
		else {
			System.out.println("Cannot access Cook(NullPointerException)");
		}
		
	}
	public void printInfo() {
		System.out.println("Hotel Name is: "+name);
	}
	
}
