package com.xworkz.override.app.boot;

import com.xworkz.override.app.Pub;
import com.xworkz.override.app.SportsPub;

public class PubRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PubRunner");

		Pub pub = new SportsPub();
		pub.enjoy();
		System.out.println("********Child ref**********");

		SportsPub sportsPub = new SportsPub();
		sportsPub.enjoy();
	}
}
