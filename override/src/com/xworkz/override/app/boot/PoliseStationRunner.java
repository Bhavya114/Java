package com.xworkz.override.app.boot;

import com.xworkz.override.app.PoliceStation;
import com.xworkz.override.app.TrafficPoliceStation;

public class PoliseStationRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PoliceStationRunner");

		PoliceStation policeStation = new TrafficPoliceStation();
		policeStation.arrest();
		System.out.println("*********Child ref**********");

		TrafficPoliceStation traficPoliceStation = new TrafficPoliceStation();
		traficPoliceStation.arrest();

	}
}
