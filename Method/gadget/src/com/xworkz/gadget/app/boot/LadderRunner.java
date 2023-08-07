package com.xworkz.gadget.app.boot;

import com.xworkz.gadget.app.Ladder;

public class LadderRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in LadderRunner");

		Ladder ladder = new Ladder();
		ladder.canSupportWeight();

	}

}
