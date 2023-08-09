package com.xworkz.override.app;

public class Hostel {

	public String warden;
	public int noOfStudents;
	public String location;
	public boolean isItGovt;
	public int noOfWorkers;

	public void addStudent() {
		System.out.println("invoking addStudent method in Hostel");
	}

	public void addStudent(String warden) {
		System.out.println("invoking addStudent method of String in Hostel");
	}

	public void addStudent(String warden, int noOfStudents) {
		System.out.println("invoking addStudent method of String,int in Hostel");
	}

	public void addStudent(String warden, int noOfStudents, String location) {
		System.out.println("invoking addStudent method of String,int,String in Hostel");
	}

	public void addStudent(String warden, int noOfStudents, String location, boolean isItGovt) {
		System.out.println("invoking addStudent method of String,int,String,boolean in Hostel");
	}

	public void addStudent(String warden, int noOfStudents, String location, boolean isItGovt, int noOfWorkers) {
		System.out.println("invoking addStudent method of String,int,String,boolean,int in Hostel");
	}
}
