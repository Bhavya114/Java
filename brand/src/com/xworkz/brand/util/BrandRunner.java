package com.xworkz.brand.util;

public class BrandRunner {
	
	public static void main(String[] args) {
		System.out.println("Running main in Brand");

		LocalBrand localBrand = new LocalBrand();
		NationalBrand nationalBrand = new NationalBrand();
		InternationalBrand internationalBrand = new InternationalBrand();
		DuplicateBrand duplicateBrand = new DuplicateBrand();

		BrandUtil.run(localBrand);
		System.out.println("*****************");
		BrandUtil.run(nationalBrand);
		System.out.println("*****************");
		BrandUtil.run(internationalBrand);
		System.out.println("*****************");
		BrandUtil.run(duplicateBrand);
	}
}
