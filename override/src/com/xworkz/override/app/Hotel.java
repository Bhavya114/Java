package com.xworkz.override.app;

public class Hotel {

	public String name;
	public String location;
	public int noOfCooks;
	public int noOfItems;
	public String managerName;

	public void serve() {
		System.out.println("invoking serve method of String in Hotel");
	}

	public void serve(String name) {
		System.out.println("invoking serve method of String,String in Hotel");
	}

	public void serve(String name, String location) {
		System.out.println("invoking serve method of String,String,int in Hotel");
	}

	public void serve(String name, String location, int noOfCooks) {
		System.out.println("invoking serve method of String,String,int in Hotel");
	}

	public void serve(String name, String location, int noOfCooks, int noOfItems) {
		System.out.println("invoking serve method of String,String,int,int in Hotel");
	}

	public void serve(String name, String location, int noOfCooks, int noOfItems, String managerName) {
		System.out.println("invoking serve method of String,String,int,int,String in Hotel");
	}
}
