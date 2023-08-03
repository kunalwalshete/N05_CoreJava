package org.tns.overridestatic;

public class Animal {

	void eat() {
		System.out.println("Eat : parent");
	}
	
	static void run() {
		System.out.println("Run : Parent");
	}
}
