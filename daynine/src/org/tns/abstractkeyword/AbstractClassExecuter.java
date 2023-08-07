package org.tns.abstractkeyword;

// Driver class
public class AbstractClassExecuter {

	public static void main(String[] args) {
		
		// we can't create a object for abstract class
		// Operator o = new Operator;  // error = Cannot instantiate the type Operator
		
		Addition a = new Addition();
		a.print(10, 20);
		a.operation();
		a.multiplication();
		a.multiplication(3);

	}

}
