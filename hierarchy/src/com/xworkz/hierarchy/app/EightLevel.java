package com.xworkz.hierarchy.app;

public class EightLevel extends Hierarchy {

	String type;
	
	public void Soil(String type) 
	 { 
		
		System.out.println("Invoke the no-arg in EightLevelHierarchy");
		this.type=type;
		System.out.println("Soil is "+this.type);
	}

}
