package com.xworkz.gadget.app;

public class Hotel {

	public String name;
	public String location;
	public int noOfCook;

	public void invite() {
		System.out.println("invoking invite method in Hotel");
		invite("Shabari");

	}

	public void invite(String name) {
		System.out.println("invoking invite method of String  in Hotel");
		System.out.println("Hotel name is:" +name);
		invite("Shanti Sagar", "Mudhol");

	}

	public void invite(String name, String location) {
		System.out.println("invoking invite method of String,String in Hotel");
		System.out.println("Hotel name is:" + name);
		System.out.println("Hotel Locataion:" +location);
		invite("New Dhaba", "Bengalore", 20);

	}

	public void invite(String name, String location, int noOfCook) {
		System.out.println("invoking invite method of String,Strign,int in Hotel");
		System.out.println("Hotel name is:" + name);
		System.out.println("Hotel name is:" +location);
		System.out.println("Number of Cook in Hotel:" +noOfCook);

	}

}
