// static keyword is used for memory allocation
/*If any variable is non-static and outside the main method and if you want to access that variable inside main
 * method then we can make that variable static*/

/* if the variable is non-static then we create a object of class to access that variable */
package org.tns.stataickeyword;

public class StaticKeywrodWithVariable {

	// int num1 = 67;   // non-static variable
	static int num = 67;
	
	public static void main(String[] args) {
		
		 // accessing non-static variable with object
//		StaticKeywrodWithVariable s = new StaticKeywrodWithVariable();
//		System.out.println(s.num1);
		
		// accessing static variable directly
		System.out.println(num);

	}

}
