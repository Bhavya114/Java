package com.xworkz.gadget.app.boot;

import com.xworkz.gadget.app.Hotel;

public class HotelRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in HotelRunner");

		Hotel hotel = new Hotel();
		hotel.invite();

	}
}
