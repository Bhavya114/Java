package com.xwrkz.router.app.boot;

import com.xwrkz.router.app.WirelessRouter;

public class RouterRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		System.out.println("Running RouterRunner");
		
		WirelessRouter wirelessRouter=new WirelessRouter();
		System.out.println(wirelessRouter.brand);
		System.out.println(wirelessRouter.capacityInMb);
		System.out.println(wirelessRouter.isWireless);
		System.out.println(wirelessRouter.type);
		
		System.out.println("*****************************");
		

		WirelessRouter wirelessRouter1=new WirelessRouter("Cisco","DSL Modem",false,32);
		System.out.println(wirelessRouter1.brand);
		System.out.println(wirelessRouter1.capacityInMb);
		System.out.println(wirelessRouter1.isWireless);
		System.out.println(wirelessRouter1.type);

	}
}
