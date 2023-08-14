package com.xworkz.java.app.boot;

import com.xworkz.java.app.BluelineMetro;
import com.xworkz.java.app.Metro;

public class MetroRunner {

	public static void main(String[] args) {

		System.out.println("Running MetroRunner...");

		Metro metro = new BluelineMetro();
		metro.accelerate();
		metro.announcement();
		metro.completeJourney();
		metro.decelerate();
		metro.emergencyBrake();
		metro.move();
		metro.openDoors();
		metro.start();
		metro.stop();
		metro.playAnnouncement("HII");

	}
}
