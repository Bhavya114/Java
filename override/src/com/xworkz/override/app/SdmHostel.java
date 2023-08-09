package com.xworkz.override.app;

public class SdmHostel extends Hostel {
	@Override
	public void addStudent() {
		System.out.println("invoking addStudent method in SdmHostel");
		addStudent(warden);
	}

	@Override
	public void addStudent(String warden) {
		System.out.println("invoking addStudent method of String in SdmHostel");
		addStudent(warden, noOfStudents);
	}

	@Override
	public void addStudent(String warden, int noOfStudents) {
		System.out.println("invoking addStudent method of String,int in SdmHostel");
		addStudent(warden, noOfStudents, location);
	}

	@Override
	public void addStudent(String warden, int noOfStudents, String location) {
		System.out.println("invoking addStudent method of String,int,String in SdmHostel");
		addStudent(warden, noOfStudents, location, isItGovt);
	}

	@Override
	public void addStudent(String warden, int noOfStudents, String location, boolean isItGovt) {
		System.out.println("invoking addStudent method of String,int,String,boolean in BCMHostel");
		addStudent(warden, noOfStudents, location, isItGovt, noOfWorkers);
	}

	@Override
	public void addStudent(String warden, int noOfStudents, String location, boolean isItGovt, int noOfWorkers) {
		System.out.println("invoking addStudent method of String,int,String,boolean,int in BCMHostel");
	}

}
