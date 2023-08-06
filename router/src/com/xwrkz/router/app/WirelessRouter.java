package com.xwrkz.router.app;

public class WirelessRouter extends Router{
	
	public WirelessRouter(String brand,String type,boolean isWireless,int capacityInMb)
	{
		super(brand,type,isWireless,capacityInMb);
	}
	public WirelessRouter()
	{
		super("Tenda","Cable Modem",true,16);
	}

}