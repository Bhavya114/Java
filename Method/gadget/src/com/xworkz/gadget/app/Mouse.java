package com.xworkz.gadget.app;

public class Mouse {

	public String brand;
	public String model;
	public boolean wireless;

	public void displatInfo() {
		System.out.println("invoking deisplayInfo method in Mouse");
		displatInfo("HP");
	}

	public void displatInfo(String brand) {
		System.out.println("invoking deisplayInfo method of String in Mouse");
		System.out.println("Brand:" + brand);
		displatInfo("Logitech", "G Pro X Superlight");
	}

	public void displatInfo(String brand, String model) {
		System.out.println("invoking deisplayInfo method of String,String in Mouse");
		System.out.println("Brand:" + brand);
		System.out.println("Model:" + model);
		displatInfo("Lenovo", "Surface Modile Mouse", true);
	}

	public void displatInfo(String brand, String model, boolean wireless) {
		System.out.println("invoking deisplayInfo method of String,String,boolean in Mouse");
		System.out.println("Brand:" + brand);
		System.out.println("Model:" + model);
		System.out.println("Wireless:" + wireless);
	}
}
