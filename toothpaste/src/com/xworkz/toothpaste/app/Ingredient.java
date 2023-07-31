package com.xworkz.toothpaste.app;

public class Ingredient {
	public String name;
	public float quantity;
	public int cost;
	
	public Ingredient(String name,float quantity, int cost) {
		
		this.name=name;
		this.quantity=quantity;
		this.cost=cost;
		
	}
	
	public void printInfo() {
		
		System.out.println("Name: "+name);
		System.out.println("Quantity: "+quantity);
		System.out.println("Cost: "+cost);
	}
}
