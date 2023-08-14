package com.xworkz.java.app.boot;

import com.xworkz.java.app.Shape;

public class  Circle extends Shape {

	
	public double calculateArea() {
		System.out.println("Invoke CalculateArea");
		return 0;
	}

	
	public double calculatePerimeter() {
		System.out.println("Invoke calculatePerimeter");
		return 0;
	}

	
	public void draw() {
		System.out.println("Invoke draw");
		
	}

	public String getName() {
		System.out.println("Invoke getName");
		return null;
	}

	
	public void resize() {
		System.out.println("Invoke size");
		
	}

}