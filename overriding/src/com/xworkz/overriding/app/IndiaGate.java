package com.xworkz.overriding.app;

public class IndiaGate extends Gate {
	@Override
	public void open() {

		System.out.println("Invoking open in IndiaGate");
	}
}