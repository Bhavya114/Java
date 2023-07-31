package com.xworkz.cinema.boot;

	import com.xworkz.cinema.app.Auditor;
	import com.xworkz.cinema.app.Company;
	import com.xworkz.cinema.app.Movie;
	import com.xworkz.cinema.app.Producer;

	public class MovieKiller {

		public static void main(String[] args) {
			
			System.out.println("Running main in MovieKiller");
			
			Movie movie=new Movie();
			
			String name=movie.name;
			System.out.println("Movie name is: "+name);
			
			String language=movie.language;
			System.out.println("Movie language is: "+language);
			
			System.out.println("***********************************************");

			Producer producer=movie.producer;
			
			double budget=producer.budget;
			System.out.println("Movie budget is: "+budget);

			long mobileNo=producer.mobileNo;
			System.out.println("Producer Mobile Number is: "+mobileNo);

			System.out.println("***********************************************");

			Auditor auditor=producer.auditor;
			
			double aadharNo=auditor.aadharNo;
			System.out.println("Auditor Aadhar Number is: "+aadharNo);
			
			System.out.println("***********************************************");
			Company company=auditor.company;
			
			String companyName=company.companyName;
			System.out.println("Comapny name is: "+companyName);
			
			String location=company.location;
			System.out.println("Company locatio is: "+location);
			
		}
}
