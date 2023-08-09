package com.xworkz.override.app.boot;

import com.xworkz.override.app.City;
import com.xworkz.override.app.JaipurCity;

public class CityRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in CityRunner");

		City city = new JaipurCity();
		city.welcome();
		System.out.println("***********Child ref***************");
		JaipurCity belagaviCity = new JaipurCity();
		belagaviCity.welcome();

	}
}
