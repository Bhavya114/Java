package com.xworkz.powerbank.app;

public class PowerBank {
	public String brand="MI";
	public Battery battery=new Battery();
	
	public void charge() {
		System.out.println("Invoking charge in PowerBank");
		
		if(this.battery!=null)
		{
			this.battery.storeCharge();
		}
		else {
			System.out.println("Cannot access Battery");
		}
		if(this.battery!=null)
		{
			this.battery.controlPowerFlow();
		}
		else {
			System.out.println("Cannot access Battery");
		}
	}
	
	public void printInfo() {
		
		System.out.println("PowerBank brand is: "+brand);
	}
}
