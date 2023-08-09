package com.xworkz.override.app;

public class ShabariHotel extends Hotel {
	@Override
	public void serve() {
		System.out.println("invoking serve method of String in Shabai Hotel");
		serve(name);
	}

	@Override
	public void serve(String name) {
		System.out.println("invoking serve method of String,String in Shabari Hotel");
		serve(name, location);
	}

	@Override
	public void serve(String name, String location) {
		System.out.println("invoking serve method of String,String,int in Shabari Hotel");
		serve(name, location, noOfCooks);
	}

	@Override
	public void serve(String name, String location, int noOfCooks) {
		System.out.println("invoking serve method of String,String,int in Shabari Hotel");
		serve(name, location, noOfCooks, noOfItems);
	}

	@Override
	public void serve(String name, String location, int noOfCooks, int noOfItems) {
		System.out.println("invoking serve method of String,String,int,int in Shabari Hotel");
		serve(name, location, noOfCooks, noOfItems, managerName);
	}

	@Override
	public void serve(String name, String location, int noOfCooks, int noOfItems, String managerName) {
		System.out.println("invoking serve method of String,String,int,int,String in ShabariHotel");
	}

}