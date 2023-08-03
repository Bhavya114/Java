package com.xworkz.casting.Browsers.app.boot;

import com.xworkz.casting.Browsers.app.BrowserUtil;
import com.xworkz.casting.Browsers.app.ChromeBrowser;
import com.xworkz.casting.Browsers.app.FireFox;
import com.xworkz.casting.Browsers.app.MicrosoftEdge;
import com.xworkz.casting.Browsers.app.OperaBrowser;

public class BrowserRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Running main in BrowserRunner");
		
		//Browser browser=new Browser();
		ChromeBrowser chromeBrowser=new ChromeBrowser();
		OperaBrowser opearBrowser=new OperaBrowser();
		FireFox fireFox =new FireFox();
		MicrosoftEdge microsftEdge=new MicrosoftEdge();
		
		BrowserUtil.run(chromeBrowser);
		System.out.println("*****************");
		BrowserUtil.run(opearBrowser);
		System.out.println("*****************");
		BrowserUtil.run(microsftEdge);
		System.out.println("*****************");
		BrowserUtil.run(fireFox);

	}

}
