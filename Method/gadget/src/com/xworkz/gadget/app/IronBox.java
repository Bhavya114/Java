package com.xworkz.gadget.app;

public class IronBox {

	public int temperature;
	public String streamLevel;
	public String powerStatus;

	public void adjustTemperature() {
		System.out.println("invoking adjustTemperature method in IronBox");
		adjustTemperature(22);

	}

	public void adjustTemperature(int temperature) {
		System.out.println("invoking adjustTemperature of int method in IronBox");
		System.out.println("Temperature:" + temperature);
		adjustTemperature(33, "High");
	}

	public void adjustTemperature(int temperature, String streamLevel) {
		System.out.println("invoking adjustTemperature of int,String method in IronBox");
		System.out.println("Temperature:" + temperature);
		System.out.println("Stream Level:" + streamLevel);
		adjustTemperature(36, "Low", "Off");
	}

	public void adjustTemperature(int temperature, String streamLevel, String powerStatus) {
		System.out.println("invoking adjustTemperature of int,String method in IronBox");
		System.out.println("Temperature:" + temperature);
		System.out.println("Stream Level:" + streamLevel);
		System.out.println("Power Status:" + streamLevel);

	}
}
