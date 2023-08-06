package com.xworkz.chaining.coffee.app;

public class ColdCoffee extends Coffee {

	public ColdCoffee() {
		super("Levista", 200, 100, true);

	}
	public ColdCoffee(String brand,int quantity,double price,boolean isEdible)
	{
		super(brand,quantity,price,isEdible);
		
	}
}