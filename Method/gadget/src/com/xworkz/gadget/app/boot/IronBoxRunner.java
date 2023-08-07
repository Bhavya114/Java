package com.xworkz.gadget.app.boot;

import com.xworkz.gadget.app.IronBox;

public class IronBoxRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in IronBoxRunner");

		IronBox ironBox = new IronBox();
		ironBox.adjustTemperature();
	}

}
