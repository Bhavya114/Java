package com.xworkz.rope.app;

public class Rope {

	public String brand;
	public int price;
	public String color;
	public char size;
	
	public Rope(String brand,int price,String color,char size)
	{
		System.out.println("Invoking String,int, String, char const of Rope");
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.size=size;
	}
}
