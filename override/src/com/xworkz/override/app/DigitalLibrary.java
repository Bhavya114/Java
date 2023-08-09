package com.xworkz.override.app;

public class DigitalLibrary extends Library {
	@Override
	public void displyaInfo() {
		System.out.println("invoking displayInfo method in DigitalLibrary");
		displyaInfo(name);
	}

	@Override
	public void displyaInfo(String name) {
		System.out.println("invoking displayInfo method of String in DigitalLibrary");
		displyaInfo(name, capacity);
	}

	@Override
	public void displyaInfo(String name, int capacity) {
		System.out.println("invoking displayInfo method of String,int in DigitalLibrary");
		displyaInfo(name, capacity, location);
	}

	@Override
	public void displyaInfo(String name, int capacity, String location) {
		System.out.println("invoking displayInfo method of String,int,Strign in DigitalLibrary");
		displyaInfo(name, capacity, location, librarian);
	}

	@Override
	public void displyaInfo(String name, int capacity, String location, String librarian) {
		System.out.println("invoking displayInfo method of String,int,Strign,String in DigitalLibrary");
		displyaInfo(name, capacity, location, librarian, openHours);
	}

	@Override
	public void displyaInfo(String name, int capacity, String location, String librarian, int openHours) {
		System.out.println("invoking displayInfo method of String,int,Strign,String,int in DigitalLibrary");
	}

}