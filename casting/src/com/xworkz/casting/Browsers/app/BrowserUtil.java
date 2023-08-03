package com.xworkz.casting.Browsers.app;

public class BrowserUtil {
	
	public static void run(Browser browser) {
		
		System.out.println("Browser URL: "+browser.url);
		browser.search();
		
		if(browser instanceof ChromeBrowser) {
			System.out.println("Accessing ChromeBrowser");
			ChromeBrowser chrome=(ChromeBrowser)browser;
			
			System.out.println("ChromeBrowser type: "+chrome.type);
			chrome.provideGoogleService();
		}
		

		if(browser instanceof OperaBrowser) {
			System.out.println("Accessing OperaBrowser");
			OperaBrowser opera=(OperaBrowser)browser;
			
			System.out.println("OperaBrowser origin country: "+opera.originCountry);
			opera.provideSecurity();
		}
		if(browser instanceof FireFox) {
			System.out.println("Accessing FireFox");
			FireFox fire=(FireFox)browser;
			
			System.out.println("FireFox version: "+fire.version);
			fire.explore();
		}
		
		if(browser instanceof MicrosoftEdge) {
			System.out.println("Accessing MicrosoftEdge");
			MicrosoftEdge edge=(MicrosoftEdge)browser;
			
			System.out.println("MicrosoftEdge company: "+edge.company);
			edge.collectFeature();
		}
		
	}

}