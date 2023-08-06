package com.xworkz.mushroom.app.run;

import com.xworkz.mushroom.app.BeechMushroom;

public class MushroomRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in MushroomRunner");
		
		BeechMushroom beechMushroom=new BeechMushroom("Black Mushroom",200,347,'S');
		System.out.println(beechMushroom.name);
		System.out.println(beechMushroom.price);
		System.out.println(beechMushroom.quantity);
		System.out.println(beechMushroom.size);
		
		System.out.println("*****************************");
		
		BeechMushroom beechMushroom1=new BeechMushroom();
		System.out.println(beechMushroom1.name);
		System.out.println(beechMushroom1.price);
		System.out.println(beechMushroom1.quantity);
		System.out.println(beechMushroom1.size);
			

	}
}
