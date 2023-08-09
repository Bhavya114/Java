package com.xworkz.override.app.boot;

import com.xworkz.override.app.SdmHostel;

public class HostelRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in HostelRunner");

		SdmHostel hostel = new SdmHostel();
		hostel.addStudent();
		System.out.println("*********Child ref***********");
		SdmHostel bcmHostel = new SdmHostel();
		bcmHostel.addStudent();

	}

}
