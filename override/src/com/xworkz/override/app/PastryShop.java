package com.xworkz.override.app;

public class PastryShop extends Bakery {
	@Override
	public void makeCake() {
		System.out.println("invoking makeCake method in PastryShop");
		makeCake(name);
	}

	@Override
	public void makeCake(String name) {
		System.out.println("invoking makeCake method of String in PastryShop");
		makeCake(name, location);
	}

	@Override
	public void makeCake(String name, String location) {
		System.out.println("invoking makeCake method of String,String in PastryShop");
		makeCake(name, location, employes);
	}

	@Override
	public void makeCake(String name, String location, int employes) {
		System.out.println("invoking makeCake method of String,String,int in PastryShop");
		makeCake(name, location, employes, isOpen);
	}

	@Override
	public void makeCake(String name, String location, int employes, boolean isOpen) {
		System.out.println("invoking makeCake method of String,String,int,boolean in PastryShop");
		makeCake(name, location, employes, isOpen, specialOfTheDay);
	}

	@Override
	public void makeCake(String name, String location, int employes, boolean isOpen, String specialOfTheDay) {
		System.out.println("invoking makeCake method String,String,int,boolean,String in PastryShop");
	}

}