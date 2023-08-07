package com.xworkz.gadget.app.boot;

import com.xworkz.gadget.app.Specs;

public class SpecsRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in SpecsRunner");

		Specs specs = new Specs();
		specs.makeVisible();

	}
}
