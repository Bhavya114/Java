package com.xworkz.sport.app;

public class Floor {
	public String name;
	public Building[] building;
	
	public Floor(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	public void Corporator(String name,Building[] building) {
		this.name=name;
		this.building=building;
	}
	
	public void printInfo() {
		System.out.println("Corporator name is:"+name);
		
		for(int index=0; index<building.length; index++) {
			Building ref=this.building[index];
			ref.printInfo();
		}
	}
}
