package com.xwrkz.router.app;

public class Router {

	public String brand;
	public String type;
	public boolean isWireless;
	public int capacityInMb;
	
	public Router(String brand,String type,boolean isWireless,int capacityInMb)
	{
		
		System.out.println("String, String, boolean, int const of Router");
		this.brand=brand;
		this.type=type;
		this.capacityInMb=capacityInMb;
		this.isWireless=isWireless;
	}
}
