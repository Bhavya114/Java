package com.xworkz.store;

public class Store {
public void email(String[] emails) {
		
		for(int size=0; size<=emails.length-1; size++) {
			System.out.println("email at index " +size+ " is: " +emails[size]);
		}
	}
    public void groceryItems(String[] items) {
		
		for(int size=0; size<=items.length-1; size++) {
			System.out.println("email at index " +size+ " is: " +items[size]);
		}
	}
    public void iplTeams(String[] teams) {
		
		for(int size=0; size<=teams.length-1; size++) {
			System.out.println("email at index " +size+ " is: " +teams[size]);
		}
	}


}

