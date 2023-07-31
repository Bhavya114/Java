package com.xworkz.toothpaste.boot;

import com.xworkz.toothpaste.app.Company;
import com.xworkz.toothpaste.app.Ingredient;
import com.xworkz.toothpaste.app.ToothPaste;

public class ToothPasteKiller {
	public static void main(String[] args) {

		System.out.println("Running main ToothpasteRunner.....");

		String pasteName = "Dabur Red";
		String brand = "Dabur";

		Company company = new Company("Dabur", "Mohit Malhotra", "India");

		Ingredient ingredient = new Ingredient("Lavanga", 5.8f, 10);

		Ingredient ingredient1 = new Ingredient("Garlic Powder", 6.90f, 28);

		Ingredient ingredient2 = new Ingredient("Salt", 0.56f, 8);

		Ingredient ingredient3 = new Ingredient("Ginger", 8.40f, 12);

		Ingredient ingredient4 = new Ingredient("Maricha", 10.700f, 38);

		Ingredient[] ingredients = { ingredient, ingredient1, ingredient2, ingredient3, ingredient4 };

		ToothPaste toothpaste = new ToothPaste(pasteName, brand, company, ingredients);
		toothpaste.printInfo();

	}

}
