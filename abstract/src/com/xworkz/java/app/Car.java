package com.xworkz.java.app;

public class Car extends Vechicle {

	public void start() {
		System.out.println("Start");
	}

	public void stop() {
		System.out.println("Stop");
		
	}

	public void accelerate() {
		System.out.println("Accelerate");
		
	}

	
	@Override
	public void turn() {
		System.out.println("Turn");
	}

	@Override
	public void decelerate() {
		// TODO Auto-generated method stub
		
	}

}
