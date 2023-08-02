package com.xworkz.hierarchy.app;

public class SixLevel extends Hierarchy {

	String type;
	
	public void Bud(String type) 
	 { 
		
		System.out.println("Invoke the no-arg in SixLevelHierarchy");
		this.type=type;
		System.out.println("Bud is "+this.type);
	}

}