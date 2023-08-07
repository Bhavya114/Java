package com.xworkz.gadget.app;

public class Ladder {

	public double length;
	public String material;
	public boolean isFoldable;

	public void canSupportWeight() {
		System.out.println("invoking canSupportweight method in Ladder");
		canSupportWeight(8.5);
	}

	public void canSupportWeight(double length) {
		System.out.println("invoking canSupportweight method of double in Ladder");
		System.out.println("Length:" + length);
		canSupportWeight(10.5, "Steel");
	}

	public void canSupportWeight(double length, String material) {
		System.out.println("invoking canSupportweight method of double,String in Ladder");
		System.out.println("Length:" + length);
		System.out.println("Material" + material);
		canSupportWeight(15.7, "Wood", false);
	}

	public void canSupportWeight(double length, String material, boolean isFoldable) {
		System.out.println("invoking canSupportweight method of double,String,boolean in Ladder");
		System.out.println("Length:" + length);
		System.out.println("Material:" + material);
		System.out.println("Foldable:" + isFoldable);
	}
}
