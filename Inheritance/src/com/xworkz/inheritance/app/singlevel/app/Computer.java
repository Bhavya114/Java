package com.xworkz.inheritance.app.singlevel.app;

public class Computer {
	public int ram;
	
	public Computer() {
		System.out.println("No arg consructor of Computer");
		System.out.println("Computer RAM: "+ram);
	}

	public void turnOn() {
		System.out.println("Invoking turnOn method in Computer");
	}
}
