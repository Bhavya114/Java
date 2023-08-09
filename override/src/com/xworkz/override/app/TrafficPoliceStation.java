package com.xworkz.override.app;

public class TrafficPoliceStation extends PoliceStation {
	@Override
	public void arrest() {
		System.out.println("invoking arrest method in TrafficPoliceStation");
		arrest(name);
	}

	@Override
	public void arrest(String name) {
		System.out.println("invoking arrest method of String in TrafficPoliceStation");
		arrest(name, location);
	}

	@Override
	public void arrest(String name, String location) {
		System.out.println("invoking arrest method of String,String in TrafficPoliceStation");
		arrest(name, location, officersCount);
	}

	@Override
	public void arrest(String name, String location, int officersCount) {
		System.out.println("invoking arrest method of String,String,int in TrafficPoliceStation");
		arrest(name, location, officersCount, hasJail);
	}

	@Override
	public void arrest(String name, String location, int officersCount, boolean hasJail) {
		System.out.println("invoking arrest method of String,String,int,boolean in TrafficPoliceStation");
		arrest(name, location, officersCount, hasJail, emergencyNumber);
	}

	@Override
	public void arrest(String name, String location, int officersCount, boolean hasJail, String emergencyNumber) {
		System.out.println("invoking arrest method of String,String,int,boolean,String in TraficPoliceStation");
	}

}