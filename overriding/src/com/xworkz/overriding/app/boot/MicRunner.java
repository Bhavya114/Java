package com.xworkz.overriding.app.boot;

import com.xworkz.overriding.app.DynamicMic;

public class MicRunner {

	public static void main(String[] args) {
		System.out.println("Running main in MicRunner");

		DynamicMic dynamicMic = new DynamicMic();
		dynamicMic.sound();

	}
}
