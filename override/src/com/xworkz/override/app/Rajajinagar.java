package com.xworkz.override.app;

public class Rajajinagar extends Street {
	@Override
	public void addLandMark() {
		System.out.println("invoking addLandMark method in Rajajinagar");
		addLandMark(name);
	}

	@Override
	public void addLandMark(String name) {
		System.out.println("invoking addLandMark method of String in Rajajinagar");
		addLandMark(name, location);
	}

	@Override
	public void addLandMark(String name, String location) {
		System.out.println("invoking addLandMark method of String,String in Rajajinagar");
		addLandMark(name, location, length);
	}

	@Override
	public void addLandMark(String name, String location, int length) {
		System.out.println("invoking addLandMark method of String,String,int in Rajajinagar");
		addLandMark(name, location, length, lanes);
	}

	@Override
	public void addLandMark(String name, String location, int length, int lanes) {
		System.out.println("invoking addLandMark method of String,String,int,int in Rajajinagar");
		addLandMark(name, location, length, lanes, hastraficLight);
	}

	@Override
	public void addLandMark(String name, String location, int length, int lanes, boolean hastraficLight) {
		System.out.println("invoking addLandMark method of String,String,int,int,boolean in Rajajinagar");
	}

}