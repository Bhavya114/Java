package com.xworkz.browser.app;

public class Browser {
	public String name="Google Chrome";
	public Internet internet=new Internet();
	
	public void search() {
		System.out.println("Invoking search in Browser");
		
		if(this.internet!=null) {
			this.internet.makeOnlinePayment();
			this.internet.playMovies();
		}
		else {
			System.out.println("Cannot access Internet");
		}
	}
	
	public void info() {
		System.out.println("Browser Name is: "+name);
	}
}
