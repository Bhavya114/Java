package com.xworkz.casting.Browsers.app;

public class ChromeBrowser extends Browser{
	
	public String type = "Chrome Beta";

	public void provideGoogleService() {
		System.out.println("Invoking provideGoogleService in ChromeBrowser");
	}
}
