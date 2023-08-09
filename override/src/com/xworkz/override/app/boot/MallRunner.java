package com.xworkz.override.app.boot;

import com.xworkz.override.app.Mall;
import com.xworkz.override.app.OrionMall;

public class MallRunner {

	private static Mall orionMall;

	public static void main(String[] args) {
		System.out.println("invokin main in MallRunner");

		Mall mall = new OrionMall();
		mall.invite();
		System.out.println("**********Child ref**********");
		orionMall = null;
		orionMall.invite();

	}
}
