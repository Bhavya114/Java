package com.xworkz.override.app;

public class ShivaTemple extends Temple {
	@Override
	public void hope() {
		System.out.println("invoking hope method in ShivaTemple");
		hope(name);
	}

	@Override
	public void hope(String name) {
		System.out.println("invoking hope method of String in ShivaTemple");
		hope(name, location);
	}

	@Override
	public void hope(String name, String location) {
		System.out.println("invoking hope method of String,String in ShivaTemple");
		hope(name, location, deity);
	}

	@Override
	public void hope(String name, String location, String deity) {
		System.out.println("invoking hope method of String,String,String in ShivaTemple");
		hope(name, location, deity, capacity);
	}

	@Override
	public void hope(String name, String location, String deity, int capacity) {
		System.out.println("invoking hope method of String,String,String,int in ShivaTemple");
		hope(name, location, deity, capacity, isPowerful);
	}

	@Override
	public void hope(String name, String location, String deity, int capacity, boolean isPowerful) {
		System.out.println("invoking hope method of String,String,String,int,boolean in ShivaTemple");
	}
}