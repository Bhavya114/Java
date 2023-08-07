package com.xworkz.gadget.app;

public class Specs {

	public String brand;
	public int price;
	public double version;

	public void makeVisible() {
		System.out.println("invoking makeVisible method in Specs");
		makeVisible("Furla");
	}

	public void makeVisible(String brand) {
		System.out.println("invoking makeVisible method of String in Specs");
		System.out.println("Brand:" + brand);
		makeVisible("Etnia", 1000);
	}

	public void makeVisible(String brand, int price) {
		System.out.println("invoking makeVisible method of String,int in Specs");
		System.out.println("Brand:" +brand);
		System.out.println("Price:" +price);
		makeVisible("Flexon", 800, 1.7);
	}

	public void makeVisible(String brand, int price, double version) {
		System.out.println("invoking makeVisible method of String,int,double in Specs");
		System.out.println("Brand:" +brand);
		System.out.println("Price:" +price);
		System.out.println("version:" +version);
	}

}
