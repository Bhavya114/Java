package com.xworkz.override.app.boot;

import com.xworkz.override.app.DigitalLibrary;
import com.xworkz.override.app.Library;

public class LibraryRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in Libraryrunner");

		Library library = new DigitalLibrary();
		library.displyaInfo();
		System.out.println("*********Child ref**********");
		DigitalLibrary digitalLibrary = new DigitalLibrary();
		digitalLibrary.displyaInfo();

	}
}
