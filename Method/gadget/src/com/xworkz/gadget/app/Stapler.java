package com.xworkz.gadget.app;

public class Stapler {

	public String color;
	public int capacity;
	public String stapleSize;

	public void staple() {
		System.out.println("invoking stuple method in Stapler");
		staple("Blue");
	}

	public void staple(String color) {
		System.out.println("invoking stuple method in Stapler");
		System.out.println("Color:" + color);
		staple("Black", 20);
	}

	public void staple(String color, int capacity) {
		System.out.println("invoking stuple method in Stapler");
		System.out.println("Color:" + color);
		System.out.println("Capacity:" + capacity);
		staple("Yellow", 35, "Heavy");
	}

	public void staple(String color, int capacity, String stapleSize) {
		System.out.println("invoking stuple method in Stapler");
		System.out.println("Color:" + color);
		System.out.println("Capacity:" + capacity);
		System.out.println("Staple Size:" + stapleSize);
	}
}
