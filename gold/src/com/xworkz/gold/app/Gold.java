package com.xworkz.gold.app;

public class Gold {
	
	public double price;
	public String color;
	public boolean isSoft;
	public String brand;
	
	public Gold(String brand,String color,boolean isSoft,double price)
	{
		System.out.println("Invoking String,int,double, boolean const of Gold");
		this.brand=brand;
		this.color=color;
		this.isSoft=isSoft;
		this.price=price;
	}
}
