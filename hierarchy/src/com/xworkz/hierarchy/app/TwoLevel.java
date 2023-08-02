package com.xworkz.hierarchy.app;

public class TwoLevel extends Hierarchy{
	
	String status;
	
	public void Leaf(String status)
	{
		System.out.println("Invoke the no-arg in TwoLevelHierarchy");
		this.status=status;
		System.out.println("Leaf is "+this.status);
	}
	
	

}