package com.xworkz.powerbank.boot;

import com.xworkz.powerbank.app.PowerBank;

public class PowerBankKiller {
	public static void main(String[] args) {
		System.out.println("Running main in PowerBankrunner");
		
		PowerBank powerBank = new PowerBank();
		
		powerBank.printInfo();
		
		powerBank.charge();
		
	}
}
