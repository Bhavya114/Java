package com.xworkz.overriding.app.boot;

import com.xworkz.overriding.app.BigDinosaur;

public class DinosaurRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Invoking main in DinosaurRunner");
		
		BigDinosaur bigDinosaur=new BigDinosaur();
		bigDinosaur.bite();

	}
}
