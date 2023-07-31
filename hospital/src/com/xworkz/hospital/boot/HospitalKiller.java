package com.xworkz.hospital.boot;

import com.xworkz.hospital.app.Hospital;

public class HospitalKiller {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Running main in HospitalRunner");
		
		Hospital hospital=new Hospital();
		
		hospital.provideTreatment();

	}
}
