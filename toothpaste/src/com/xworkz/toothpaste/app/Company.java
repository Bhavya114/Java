package com.xworkz.toothpaste.app;

public class Company {
	public String name;
	public String ceo;
	public String originCountry;

	public Company(String name, String ceo, String originCountry) {

		this.name = name;
		this.ceo = ceo;
		this.originCountry = originCountry;

	}

	public void printInfo() {

		System.out.println("Company Name is: " + name);
		System.out.println("CEO of the Company: " + ceo);
		System.out.println("Origin country: " + originCountry);
	}

}
