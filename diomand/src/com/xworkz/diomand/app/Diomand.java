package com.xworkz.diomand.app;

public class Diomand {

	public String brand;
	public double price;
	public String color;
	public String location;
	
	
	public Diomand(String brand,double price,String color,String location)
	{
		System.out.println("Invoking String, double, String, String const of Diomand");
	   this.brand=brand;
	   this.price=price;
	   this.color=color;
	   this.location=location;
	}

}
