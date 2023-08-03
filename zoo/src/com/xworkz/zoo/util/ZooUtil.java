package com.xworkz.zoo.util;

public class ZooUtil {
public static void save(Zoo zoo) {
		
		System.out.println("Zoo type: "+zoo.type);
		zoo.saveAnimal();
		
		if(zoo instanceof StateZoo) {
			System.out.println("Accessing StateZoo");
			
			StateZoo zoo1=(StateZoo)zoo;
			System.out.println("Zoo name: "+zoo1.name);
			zoo1.entertainPublic();
		}
		
		if(zoo instanceof NationalZoo) {
			System.out.println("Accessing NationalZoo");
			
			NationalZoo zoo2=(NationalZoo)zoo;
			System.out.println("Zoo location: "+zoo2.location);
			zoo2.eduactePublic();
		}
}
}
