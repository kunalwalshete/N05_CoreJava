package org.tns.multipleinheritanceusinginterface;

// Program to demonstrate on multiple inheritance using interface
// Implementable class or child class
public class Person implements ColdDrink, Alcohol{

	@Override
	public void showDrinkName() {
		System.out.println(brand+" "+alcoholname+" "+name );
		
	}

}
