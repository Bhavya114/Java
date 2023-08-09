package com.xworkz.override.app;

public class ESIHospital extends Hospital {
	@Override
	public void admit() {
		System.out.println("invoking admit method  in ESIHospital");
		admit(name);
	}

	@Override
	public void admit(String name) {
		System.out.println("invoking admit method of String in ESIHospital");
		admit(name, location);
	}

	@Override
	public void admit(String name, String location) {
		System.out.println("invoking admit method of String,String in ESIHospital");
		admit(name, location, speciality);
	}

	@Override
	public void admit(String name, String location, String speciality) {
		System.out.println("invoking admit method of String,String,String in ESIHospital");
		admit(name, location, speciality, noOfDoctors);
	}

	@Override
	public void admit(String name, String location, String speciality, int noOfDoctors) {
		System.out.println("invoking admit method of String,String,String,int in ESIHospital");
		admit(name, location, speciality, noOfDoctors, isACFecility);
	}

	@Override
	public void admit(String name, String location, String speciality, int noOfDoctors, boolean isACFecility) {
		System.out.println("invoking admit method of String,String,String,int,boolean in ESIHospital");
	}

}
