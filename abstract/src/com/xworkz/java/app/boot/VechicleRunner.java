package com.xworkz.java.app.boot;

import com.xworkz.java.app.Car;

public class VechicleRunner {

	public static void main(String[] args) {
		
		Car vehicle=new Car();
		 vehicle.accelerate();
		 vehicle.decelerate();
		 vehicle.honk();
		 vehicle.lightsOff();
		 vehicle.lightsOn();
		 vehicle.refillFuel();
		 vehicle.service();
		 vehicle.service();
		 vehicle.start();
		 vehicle.stop();

	}
}
