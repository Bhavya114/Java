package com.xworkz.chaining.coffee.app.boot;

import com.xworkz.chaining.coffee.app.ColdCoffee;

public class CoffeeRunner {
	public static void main(String[] args) {


		ColdCoffee coldCoffee=new ColdCoffee();
		System.out.println(coldCoffee.brand);
		System.out.println(coldCoffee.price);
		System.out.println(coldCoffee.quantity);
		System.out.println(coldCoffee.isEdible);
		
		System.out.println("********************");
		
		ColdCoffee coldCoffee1=new ColdCoffee("Sunrice",250,100,false);
		System.out.println(coldCoffee1.brand);
		System.out.println(coldCoffee1.price);
		System.out.println(coldCoffee1.quantity);
		System.out.println(coldCoffee1.isEdible);
	}
}
