package com.xworkz.ground.app;

public class Ground {

	public String name;
	public String location;
	public int year;
	public boolean isGood;
	
	public Ground(String name,String location,int year, boolean isGood)
	{
		System.out.println("Invoking String,String, int, boolean const of Ground");
		this.name=name;
		this.location=location;
		this.year=year;
		this.isGood=isGood;
	}
}
