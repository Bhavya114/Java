package com.xworkz.hierarchy.app;

public class SingleLevel extends Hierarchy {

	String type;
	
	public void Root(String type) 
	 { 
		
		System.out.println("Invoke the no-arg in SingleLevelHierarchy");
		this.type=type;
		System.out.println("Root is "+this.type);
	}
	

}