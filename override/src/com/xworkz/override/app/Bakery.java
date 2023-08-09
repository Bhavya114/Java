package com.xworkz.override.app;

public class Bakery {

	public String name;
	public String location;
	public int employes;
	public boolean isOpen;
	public String specialOfTheDay;

	public void makeCake() {
		System.out.println("invoking makeCake method in Bakery");
	}

	public void makeCake(String name) {
		System.out.println("invoking makeCake method of String in Bakery");
	}

	public void makeCake(String name, String location) {
		System.out.println("invoking makeCake method of String,String in Bakery");
	}

	public void makeCake(String name, String location, int employes) {
		System.out.println("invoking makeCake method of String,String,int in Bakery");
	}

	public void makeCake(String name, String location, int employes, boolean isOpen) {
		System.out.println("invoking makeCake method of String,String,int,boolean in Bakery");
	}

	public void makeCake(String name, String location, int employes, boolean isOpen, String specialOfTheDay) {
		System.out.println("invoking makeCake method String,String,int,boolean,String in Bakery");
	}
}
