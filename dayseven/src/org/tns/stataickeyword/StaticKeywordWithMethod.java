/* If any method outside the main method and if you want to access that method inside main method we have to 
 * make that method as a static*/
package org.tns.stataickeyword;

public class StaticKeywordWithMethod {

	// non-static variable
	int x = 2;
	// static variable
	static String collegeName = "MET";
	
	// static method
	public static void Print() {
		System.out.println(collegeName);
		//System.out.println(x);                // we can not use any non-static variable inside any static method
	}
	public static void main(String[] args) {

		// when method is static no need of object creation
		Print();

	}

}
