package com.xworkz.hotel.boot;

import com.xworkz.hotel.app.Hotel;

public class HotelKiller {
	

		public static void main(String[] args) {
			System.out.println("Running main in HotelRunner");
			
			Hotel hotel=new Hotel();
			
			hotel.printInfo();
			hotel.provideFood();
		}

}