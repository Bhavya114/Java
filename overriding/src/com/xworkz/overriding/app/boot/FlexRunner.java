package com.xworkz.overriding.app.boot;

import com.xworkz.overriding.app.LedFlex;

public class FlexRunner {

	public static void main(String[] args) {

		System.out.println("Running main in FlexRunner");

		LedFlex ledFlex = new LedFlex();
		ledFlex.display();

	}
}
