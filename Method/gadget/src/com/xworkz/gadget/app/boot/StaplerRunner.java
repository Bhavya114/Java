package com.xworkz.gadget.app.boot;

import com.xworkz.gadget.app.Stapler;

public class StaplerRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in StaplerRunner");

		Stapler stapler = new Stapler();
		stapler.staple();

	}

}
