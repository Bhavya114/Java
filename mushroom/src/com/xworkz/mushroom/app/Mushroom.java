package com.xworkz.mushroom.app;

public class Mushroom {

	public int quantity;
	public double price;
	public String name;
	public char size;
	
	
	public Mushroom(String name,int quantity,double price,char size) 
	{
	
		System.out.println("Invoking String.int,double, char const of Mushroom");
		this.name=name;
		this.price=price;
		this.quantity=quantity;
		this.size=size;
		
	}
}
