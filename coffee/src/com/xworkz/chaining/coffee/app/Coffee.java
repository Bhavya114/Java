package com.xworkz.chaining.coffee.app;

public class Coffee {
	public String brand;
	public int quantity;
	public double price;
	public boolean isEdible;
	
	public Coffee(String brand,int quantity,double price,boolean isEdible)
	{
		System.out.println("Invoking String.int,double, boolean const of Coffee");
		this.brand=brand;
		this.quantity=quantity;
		this.price=price;
		this.isEdible=isEdible;
	}
}
