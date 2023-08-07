package com.xworkz.gadget.app.boot;

import com.xworkz.gadget.app.Mouse;

public class MouseRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MouseRunner");

		Mouse mouse = new Mouse();
		mouse.displatInfo();

	}
}
