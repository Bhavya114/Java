package com.xworkz.garage.app;

public class Garage {
public Mechanic mechanic=new Mechanic();
	
	public void vehicleService() {
		System.out.println("Invoking vehicleService in garage");
		
		if(this.mechanic!=null) {
			this.mechanic.repair();
		}
		else {
			System.out.println("Cannot access vehicleService");
		}
		if(this.mechanic!=null) {
			this.mechanic.restore();
		}
		else {
			System.out.println("Cannot access vehicleService");
		}
	}
}
