package com.xworkz.overriding.app.boot;

import com.xworkz.overriding.app.BlackTicket;

public class TicketRunner {

	public static void main(String[] args) {
		System.out.println("Running main in TicketRunner");
		BlackTicket blackTicket=new BlackTicket();
		blackTicket.tear();
	}
}
