// Program to demonstrate Runtime polymorphism ( Method Overriding )
// Method overriding = 2 or more method's from different class that inherits having same name same type and number
// of parameters is called method overriding

// we cant use super keyword inside static method because super keyword is non-static
// we cant override the static method
package org.tns.polymorphism;

import java.util.Scanner;

class Laptop{
	String generation;
	String generation2;
	
	void specification(String generation, String generation2) {
		System.out.println("Generation of laptop : "+generation2);
	}
}

class Asus extends Laptop{
	String generation;
	String generation2;
	
	
	void specification(String generation, String generation2) {
		super.specification(generation,generation2);
		System.out.println("Generation for asus laptop : "+generation);
	}
}


public class MethodOverridingExecuter {

	public static void main(String[] args) {
		Asus a= new Asus();
		Scanner s= new Scanner(System.in);
		String generation2 = s.nextLine();
		String generation = s.nextLine();
		a.specification(generation,generation2);
		
		

	}

}
