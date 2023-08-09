package com.xworkz.override.app;

public class SportsPub extends Pub {
	@Override
	public void enjoy() {
		System.out.println("invoking enjoy method in SportsPub");
		enjoy(name);
	}

	@Override
	public void enjoy(String name) {
		System.out.println("invoking enjoy method of String in SportsPub");
		enjoy(name, location);
	}

	@Override
	public void enjoy(String name, String location) {
		System.out.println("invoking enjoy method of String,String in SportsPub");
		enjoy(name, location, capacity);
	}

	@Override
	public void enjoy(String name, String location, int capacity) {
		System.out.println("invoking enjoy method of String,String,int in SportsPub");
		enjoy(name, location, capacity, servesFood);
	}

	@Override
	public void enjoy(String name, String location, int capacity, boolean servesFood) {
		System.out.println("invoking enjoy method of String,String,int,boolean in SportsPub");
		enjoy(name, location, capacity, servesFood, pubType);
	}

	@Override
	public void enjoy(String name, String location, int capacity, boolean servesFood, String pubType) {
		System.out.println("invoking enjoy method of String,String,int,boolean,String in SportsPub");
	}

}
