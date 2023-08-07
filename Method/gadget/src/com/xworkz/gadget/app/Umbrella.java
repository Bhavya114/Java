package com.xworkz.gadget.app;

public class Umbrella {

	public int price;
	public String color;
	public boolean isAutomatic;

	public void open() {
		System.out.println("invoking open method in Umbrella");
		open(400);
	}

	public void open(int price) {
		System.out.println("invoking open method in Umbrella");
		System.out.println("Price:" + price);
		open(500, "red");
	}

	public void open(int price, String color) {
		System.out.println("invoking open method in Umbrella");
		System.out.println("Price:" + price);
		System.out.println("Color:" + color);
		open(800, "Black", true);
	}

	public void open(int price, String color, boolean isAutomatic) {
		System.out.println("invoking open method in Umbrella");
		System.out.println("Price:" + price);
		System.out.println("Color:" + color);
		System.out.println("Automatically Open:" + isAutomatic);
	}
}
