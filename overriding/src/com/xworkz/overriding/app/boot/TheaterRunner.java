package com.xworkz.overriding.app.boot;

import com.xworkz.overriding.app.BlackBox;

public class TheaterRunner {

	public static void main(String[] args) {
		System.out.println("Running main in TheaterRunner");
		BlackBox blackBox=new BlackBox();
		blackBox.watchMovies();
	}

}
