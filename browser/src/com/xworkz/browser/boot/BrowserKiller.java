package com.xworkz.browser.boot;

import com.xworkz.browser.app.Browser;

public class BrowserKiller {
public static void main(String[] args) {
		
		System.out.println("Running main in BrowserKiller ");
		
		Browser browser=new Browser();
		
		browser.info();
		browser.search();
	}
}
