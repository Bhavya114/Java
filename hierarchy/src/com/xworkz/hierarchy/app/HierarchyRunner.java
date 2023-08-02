package com.xworkz.hierarchy.app;

public class HierarchyRunner {
	public static void main(String[] args)
	{
		System.out.println("invoke main in the HierarchyRunner");
		Hierarchy hierarchy=new Hierarchy();
		hierarchy.Tree("mango");
		Hierarchy hierarchy1=new SingleLevel();
		hierarchy1.Root("Plant base");
		Hierarchy hierarchy2=new TwoLevel();
		hierarchy2.Leaf("kitchen of plant");
		Hierarchy hierarchy3=new ThreeLevel();
		hierarchy3.Stem("Main part of plant");
		Hierarchy hierarchy4=new FourLevel();
		hierarchy4.Flower("1st stage of fruit");
		Hierarchy hierarchy5=new FiveLevel();
		hierarchy5.Fruit("Seed genaretot");
		Hierarchy hierarchy6=new SixLevel();
		hierarchy6.Bud("Multi stem jiont");
		Hierarchy hierarchy7=new SevenLevel();
		hierarchy7.Seed("Germination of plant");
		Hierarchy hierarchy8=new EightLevel();
		hierarchy8.Soil("help for plant growing");
	}
}
