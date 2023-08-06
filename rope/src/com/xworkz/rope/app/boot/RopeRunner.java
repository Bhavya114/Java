package com.xworkz.rope.app.boot;

import com.xworkz.rope.app.Nylonrope;

public class RopeRunner {

public static void main(String[] args) {
		
		System.out.println("Running main in RopeRunner");
		
		Nylonrope nylon=new Nylonrope();
		System.out.println(nylon.brand);
		System.out.println(nylon.color);
		System.out.println(nylon.price);
		System.out.println(nylon.size);
		
		System.out.println("***********");
		
		Nylonrope nylon1=new Nylonrope("All Gear",799,"Green",'S');
		System.out.println(nylon1.brand);
		System.out.println(nylon1.color);
		System.out.println(nylon1.price);
		System.out.println(nylon1.size);

	}
}
