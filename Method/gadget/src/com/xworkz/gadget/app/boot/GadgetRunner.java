package com.xworkz.gadget.app.boot;

import com.xworkz.gadget.app.Gadget;

public class GadgetRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in GadgetRunner");

		Gadget gadget = new Gadget();
		gadget.displayInfo();

	}
}
