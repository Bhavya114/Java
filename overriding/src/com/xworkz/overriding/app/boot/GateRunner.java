package com.xworkz.overriding.app.boot;

import com.xworkz.overriding.app.IndiaGate;

public class GateRunner {

	public static void main(String[] args) {

		System.out.println("Invoking main in GateRunner");
		IndiaGate indiaGate=new IndiaGate();
		indiaGate.open();
	}
}
