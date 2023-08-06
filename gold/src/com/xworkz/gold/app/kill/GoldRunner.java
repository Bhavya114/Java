package com.xworkz.gold.app.kill;

import com.xworkz.gold.app.RoseGold;

public class GoldRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Runnning GoldRunner");
		RoseGold roseGold=new RoseGold();
		System.out.println(roseGold.brand);
		System.out.println(roseGold.color);
		System.out.println(roseGold.isSoft);
		System.out.println(roseGold.price);
		
		System.out.println("*******************");
		
		RoseGold roseGold2=new RoseGold("Nykaa","White Pink",true,6789999);
		System.out.println(roseGold2.brand);
		System.out.println(roseGold2.color);
		System.out.println(roseGold2.isSoft);
		System.out.println(roseGold2.price);
		
	}
}
