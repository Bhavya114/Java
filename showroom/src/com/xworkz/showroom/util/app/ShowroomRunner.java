package com.xworkz.showroom.util.app;

public class ShowroomRunner {

public static void main(String[] args) {
		
		System.out.println("Running main ShowroomRunner");

		// Showroom showroom=new Showroom();

		WatchShowroom watchShowroom = new WatchShowroom();

		MobileShowroom mobileShowroom = new MobileShowroom();

		// ShowroomUtil.run(showroom);
		ShowroomUtil.run(watchShowroom);
		System.out.println("***************************");
		ShowroomUtil.run(mobileShowroom);

	}
}