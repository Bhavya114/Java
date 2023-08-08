package com.xworkz.overriding.app.boot;

import com.xworkz.overriding.app.BlackCoal;

public class CoalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Invoking main in CoalRunner");
		BlackCoal blackCoal=new BlackCoal();
		blackCoal.burn();

	}
}
