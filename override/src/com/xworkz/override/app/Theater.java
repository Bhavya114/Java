package com.xworkz.override.app;

public class Theater {

	public String name;
	public String area;
	public String currentMovie;
	public int ticketPrice;
	public boolean isThereAc;

	public void display() {
		System.out.println("invoking dispaly method in Theater");
	}

	public void display(String name) {
		System.out.println("invoking dispaly method of String  in Theater");
	}

	public void display(String name, String area) {
		System.out.println("invoking dispaly method of String,String in Theater");
	}

	public void display(String name, String area, String currentMovie) {
		System.out.println("invoking dispaly method of String,String,String in Theater");
	}

	public void display(String name, String area, String currentMovie, int ticketPrice) {
		System.out.println("invoking dispaly method of String,String,String,int in Theater");
	}

	public void display(String name, String area, String currentMovie, int ticketPrice, boolean isThereAc) {
		System.out.println("invoking dispaly method of String,String,String,int,boolean in Theater");
	}

}
