package com.xworkz.overriding.app;

public class BrainEatingAmoeba extends Amoeba{
	@Override
	public void move() {
		System.out.println("Invoking move in BrainEatingAmoeba ");
	}
}