package com.xworkz.zoo.util;

public class ZooRunner {
	public static void main(String[] args) {
		System.out.println("Running main in ZooRunner");
		
		//Zoo zoo=new Zoo();
		StateZoo stateZoo=new StateZoo();
		NationalZoo nationalZoo=new NationalZoo();
		
		ZooUtil.save(nationalZoo);
		System.out.println("*******************");
		ZooUtil.save(stateZoo);
	}
}
