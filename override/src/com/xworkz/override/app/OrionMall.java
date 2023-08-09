package com.xworkz.override.app;

public class OrionMall extends Mall {
	@Override
	public void invite() {
		System.out.println("invoking invite method in OrionMall");
		invite(name);
	}


	public void invite(String name) {
		System.out.println("invoking invite method of String in OrionMall");
		invite(name, location);
	}

	@Override
	public void invite(String name, String location) {
		System.out.println("invoking invite method of String,String in OrionMall");
		invite(name, location, dailyProfit);
	}

	@Override
	public void invite(String name, String location, double dailyProfit) {
		System.out.println("invoking invite method of String,String,double in OrionMall");
		invite(name, location, dailyProfit, peopleVisitPerDay);
	}

	@Override
	public void invite(String name, String location, double dailyProfit, int peopleVisitPerDay) {
		System.out.println("invoking invite method of String,String,double,int in OrionMall");
		invite(name, location, dailyProfit, peopleVisitPerDay, isThereGST);
	}

	@Override
	public void invite(String name, String location, double dailyProfit, int peopleVisitPerDay, boolean isThereGST) {
		System.out.println("invoking invite method of String,String,double,int,boolean in OrionMall");
	}

}