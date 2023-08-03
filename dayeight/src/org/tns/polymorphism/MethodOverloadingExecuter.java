// Program to demonstrate on compile time polymorphism  (method overloading, constrctor overloading)
// Method overloading = 2 or more method's having same name but different type of parameters or different 
// number of parameters 
// We can overload the static method
package org.tns.polymorphism;

import java.util.Scanner;

class Bollywood{
	
	String str1, str2, str3;
	
	// method having same name but 2 parameters
	static void display(String str1, String str2) {
		System.out.println(str1 + " loves "+ str2);
	}
	// method having same name but 3 parameters
	static void display(String str1, String str2, String str3) {
		System.out.println(str1 + " loves "+ str2 + " also loves "+str3);
	}
}

// driver class
public class MethodOverloadingExecuter {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your 3 strings : ");
		String str1 = s.next();
		String str2 = s.next();
		String str3 = s.next();
		
		Bollywood.display(str1,str2);
		Bollywood.display(str1,str2,str3);

	}

}
