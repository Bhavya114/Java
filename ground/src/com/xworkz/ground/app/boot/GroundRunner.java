package com.xworkz.ground.app.boot;

import com.xworkz.ground.app.PlayGround;

public class GroundRunner {

	public static void main(String[] args) {
		System.out.println("Running GroundRunner.......");
		
		PlayGround playGround=new PlayGround("Ram Ground","Rajajinagar",1889,true);
		System.out.println(playGround.name);
		System.out.println(playGround.location);
		System.out.println(playGround.year);
		System.out.println(playGround.isGood);
		
		System.out.println("******************************");
		
		PlayGround playGround1=new PlayGround();
		System.out.println(playGround1.name);
		System.out.println(playGround1.location);
		System.out.println(playGround1.year);
		System.out.println(playGround1.isGood);
		

	}

}
