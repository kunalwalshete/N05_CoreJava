package org.tns.overridestatic;

public class Tiger extends Animal {

	void eat() {
		System.out.println("Eat : Child");
	}
	
	static void run() {
		//super.run();
		// Is this method overriding ?
		Animal.run();
		System.out.println("Run : Child");
	}	
}
