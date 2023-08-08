package com.xworkz.overriding.app.boot;

import com.xworkz.overriding.app.BrainEatingAmoeba;

public class AmoebaRunner {

	public static void main(String[] args) {
		System.out.println("Running main in AmoebaRunner");
		BrainEatingAmoeba brainEatingAmoeba=new BrainEatingAmoeba();
		brainEatingAmoeba.move();
	}
}
