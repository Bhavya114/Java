package com.xworkz.override.app.boot;

import com.xworkz.override.app.FishMarket;
import com.xworkz.override.app.Market;

public class MarketRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MarketRunner");

		Market market = new FishMarket();
		market.sell();
		System.out.println("*********Child ref*************");
		FishMarket fishMarket = new FishMarket();
		fishMarket.sell();

	}

}
