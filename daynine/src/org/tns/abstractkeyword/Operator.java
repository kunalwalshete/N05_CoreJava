package org.tns.abstractkeyword;

public abstract class Operator {

	// abstract method
	abstract void operation();
	
	// abstract method
	// if abstract class contain more than one method, then provide implementation to all the abstract method of 
	// that class inside child class
	abstract void multiplication() ;
	abstract void multiplication(int x);
	// non-abstract method
	void print(int a, int b) {
		System.out.println(a+b);
	}
}
