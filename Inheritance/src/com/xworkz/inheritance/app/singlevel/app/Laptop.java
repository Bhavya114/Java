package com.xworkz.inheritance.app.singlevel.app;

public class Laptop {
public String brand = "Dell";
	
	public Laptop() {
		System.out.println("No arg constructor of Laptop");
		System.out.println("Brand: "+brand);
	}

	public void shutDown() {
		System.out.println("Invoking shutDown method in Laptop");
	}
}
