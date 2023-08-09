package com.xworkz.override.app.boot;

import com.xworkz.override.app.NavrangTheater;

public class Theater {

	public static void main(String[] args) {
		System.out.println("invoking main in TheaterRunner");

		NavrangTheater theater = new NavrangTheater();
		theater.display();
		System.out.println("*********Child ref**********");
		NavrangTheater navrangTheater = new NavrangTheater();
		navrangTheater.display();

	}

}
