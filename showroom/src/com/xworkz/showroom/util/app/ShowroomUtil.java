package com.xworkz.showroom.util.app;

public class ShowroomUtil {
public static void run(Showroom showroom) {
		
		System.out.println("Showroom Location:"+showroom.location);
		showroom.service();
		if( showroom instanceof WatchShowroom) 
		{
			System.out.println("Accessing WatchShowroom");
			WatchShowroom watch=(WatchShowroom)showroom;
			
			System.out.println("Watch Showroom name: "+watch.name);
			watch.sell();
		}
		
		if( showroom instanceof MobileShowroom) 
		{
			System.out.println("Accessing MobileShowroom");
			MobileShowroom mobile=(MobileShowroom)showroom;
			System.out.println("Number of shops: "+mobile.noOfShops);
			
			mobile.support();
		}
		
}
}
