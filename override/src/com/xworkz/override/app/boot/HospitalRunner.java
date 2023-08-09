package com.xworkz.override.app.boot;

import com.xworkz.override.app.ESIHospital;
import com.xworkz.override.app.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in HospitalRunner");

		Hospital hospital = new ESIHospital();
		hospital.admit();
		System.out.println("*********Child ref**********");
		ESIHospital esiHospital = new ESIHospital();
		esiHospital.admit();

	}

}
