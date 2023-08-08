package com.xworkz.overriding.app.boot;

import com.xworkz.overriding.app.CylinderDrum;

public class DrumRunner {

	public static void main(String[] args) {
		System.out.println("Running main in DrumRunner");
		CylinderDrum cylinderDrum=new CylinderDrum();
		cylinderDrum.fill();

	}
}
