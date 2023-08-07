package com.xworkz.gadget.app;

public class Piler {

	public String brand;
	public String type;
	public double length;

	public void printDetals() {
		System.out.println("invoking printDetaios method in Plier");
		printDetals("Softgrip Plier");
	}

	public void printDetals(String brand) {
		System.out.println("invoking printDetaios method of String in Plier");
		System.out.println("Brand:" + brand);
		printDetals("GROZ", "Lineman Plier");
	}

	public void printDetals(String brand, String type) {
		System.out.println("invoking printDetaios method of String,String in Plier");
		System.out.println("Brand:" + brand);
		System.out.println("Type:" + type);
		printDetals("Swisso", "slip-joint", 5.5);
	}

	public void printDetals(String brand, String type, double length) {
		System.out.println("invoking printDetaios method of String,String,double in Plier");
		System.out.println("Brand:" + brand);
		System.out.println("Type:" + type);
		System.out.println("Length:" + length);

	}
}
