package com.xworkz.brand.util;

public class BrandUtil {
	public static void run(Brand brand) {

		System.out.println("brand URL: " + brand.type);
		brand.produce();

		if (brand instanceof LocalBrand) {
			System.out.println("Accessing LocalBrand");
			LocalBrand brand1 = (LocalBrand) brand;

			System.out.println("Brand name: " + brand1.name);
			brand1.sell();
		}

		if (brand instanceof NationalBrand) {
			System.out.println("Accessing NationalBrand");
			NationalBrand brand2 = (NationalBrand) brand;

			System.out.println("NationalBrand location: " + brand2.location);
			brand2.qualityProduct();
		}

		if (brand instanceof InternationalBrand) {
			System.out.println("Accessing InternationalBrand");
			InternationalBrand brand3 = (InternationalBrand) brand;

			System.out.println("InternationalBrand origin: " + brand3.originCountry);
			brand3.service();
		}
		if (brand instanceof DuplicateBrand) {
			System.out.println("Accessing DuplicateBrand");
			DuplicateBrand brand4 = (DuplicateBrand) brand;

			System.out.println("DuplicateBrand company: " + brand4.capitalCost);
			brand4.cheat();
		}

	}

}
