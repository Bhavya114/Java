package com.xworkz.store.app;

import com.xworkz.store.Store;

public class StoreRunner {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Running main in Store......");
			
			String[] emails= {"divya@gmail.com","doolu@gmail.com","deepthi@gmail.com","shravya@gmail.com","srilaksmi@gmail.com","srimahalaksmi@gmail.com","sahana@gmail.com"};
			Store store =new Store();
			store.email(emails);
			
			System.out.println("############################################");
			
			String[] items= {"Rice","Vegetables","Milk","Cheese","Eggs","Wheat Flour","Butter"};
			Store store1 =new Store();
			store1.groceryItems(items);
			
	        System.out.println("############################################");
			
			String[] teams= {"Royal Challengers Bangalore","Channai Super Kings","Gujarat Titans","Delhi Capitals","Mumbai Indians","Punjab Kings","Sunrisers Hyderbad"};
			Store store2 =new Store();
			store2.groceryItems(teams);
			

		}

	}

