package com.xworkz.hierarchy.app;

public class FiveLevel extends Hierarchy {

	String type;
	
	public void Fruit(String type) 
	 { 
		
		System.out.println("Invoke the no-arg in FiveLevelHierarchy");
		this.type=type;
		System.out.println("Fruit is "+this.type);
	}
}
