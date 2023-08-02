package com.xworkz.hierarchy.app;

public class SevenLevel extends Hierarchy {

	String type;
	
	public void Seed(String type) 
	 { 
		
		System.out.println("Invoke the no-arg in SevenLevelHierarchy");
		this.type=type;
		System.out.println("Seed is "+this.type);
	}
}