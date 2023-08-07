package com.xworkz.gadget.app;

public class Gadget {

	public String name;
	public double price;
	public boolean isPortable;

	public void displayInfo() {
		System.out.println("invoking displayIfo method in Gadget");
		displayInfo("Alaram");
	}

	public void displayInfo(String name) {
		System.out.println("invoking displayIfo method of String in Gadget");
		System.out.println("Name:" + name);
		displayInfo("Calculator", 200);
	}

	public void displayInfo(String name, double price) {
		System.out.println("invoking displayIfo method of String,double in Gadget");
		System.out.println("Name:" + name);
		System.out.println("Price:" + price);
		displayInfo("Computer", 10000, true);
	}

	public void displayInfo(String name, double price, boolean isPortable) {
		System.out.println("invoking displayIfo method of String,double,boolean in Gadget");
		System.out.println("Name:" + name);
		System.out.println("Price:" + price);
		System.out.println("Portable:" + isPortable);
	}
}
