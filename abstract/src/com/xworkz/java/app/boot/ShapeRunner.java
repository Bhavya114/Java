package com.xworkz.java.app.boot;

import com.xworkz.java.app.Shape;

public class ShapeRunner {

public static void main(String[] args) {
		
		Shape shape=new Circle();
		shape.calculateArea();
		shape.calculatePerimeter();
		shape.description();
		shape.display();
		shape.draw();
		shape.getName();
		shape.printInfo();
		shape.resize();
		shape.translate();
		shape.rotate();
	}
}
