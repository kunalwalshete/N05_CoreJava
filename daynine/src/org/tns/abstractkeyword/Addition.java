package org.tns.abstractkeyword;

// we should provide implementation to  all the abstract method from operator class in this class
// to provide implementation of any abstract method of parent class use child class
public class Addition extends Operator{

	@Override
	void operation() {
		System.out.println("Addition");
	}

	@Override
	void multiplication() {
		System.out.println("Multiplication");
		
	}
	
	void multiplication(int x) {
		System.out.println("Multiplication 2");
		
	}
	
	

}
