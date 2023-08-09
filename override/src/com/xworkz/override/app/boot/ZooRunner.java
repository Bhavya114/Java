package com.xworkz.override.app.boot;

import com.xworkz.override.app.SafariZoo;
import com.xworkz.override.app.Zoo;

public class ZooRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in ZooRunner");

		Zoo zoo = new SafariZoo();
		zoo.buyTicket();
		System.out.println("**********Child ref");
		SafariZoo safariZoo = new SafariZoo();
		safariZoo.buyTicket();

	}
}
