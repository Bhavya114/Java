package com.xworkz.override.app;

public class Hospital {

	public String name;
	public String location;
	public String speciality;
	public int noOfDoctors;
	public boolean isACFecility;

	public void admit() {
		System.out.println("invoking admit method  in ESIHospital");
		admit(name);
	}

	public void admit(String name) {
		System.out.println("invoking admit method of String in ESIHospital");
		admit(name, location);
	}

	public void admit(String name, String location) {
		System.out.println("invoking admit method of String,String in ESIHospital");
		admit(name, location, speciality);
	}

	public void admit(String name, String location, String speciality) {
		System.out.println("invoking admit method of String,String,String in ESIHospital");
		admit(name, location, speciality, noOfDoctors);
	}

	public void admit(String name, String location, String speciality, int noOfDoctors) {
		System.out.println("invoking admit method of String,String,String,int in ESIHospital");
		admit(name, location, speciality, noOfDoctors, isACFecility);
	}

	public void admit(String name, String location, String speciality, int noOfDoctors, boolean isACFecility) {
		System.out.println("invoking admit method of String,String,String,int,boolean in ESIHospital");
	}

}
