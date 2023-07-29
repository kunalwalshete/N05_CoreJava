// Program to demonstrate on user input

package org.tns.introduction;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);              // creating scanner object
		System.out.println("Enter the value of num : ");
		int num =  s.nextInt();                            // taking integer input form user
		System.out.println("The value num is : " + num);
//		
//		System.out.println("Enter the value of numf : ");
//		float numf =  s.nextFloat();                            // taking float input form user
//		System.out.println("The value num is : " + numf);
		
//		System.out.println("Enter the Character : ");
//		char chr =  s.next().charAt(0);                            // taking character input form user
//		System.out.println("The Character is : " + chr);
		
//		System.out.println("Enter the String for str : ");                 // Taking String as input
//		String str = s.next();                                          // s.next() Takes only first word
//		System.out.println("The string is : " + str);
		
		System.out.println("Enter the String for str2 : ");
		String str2 = s.nextLine();                                    // s.nextLine() takes whole string
		System.out.println("The complete string is : " + str2);
		
		// we can't use s.nextLine() after s.nextInt(); directly because 
		//the Scanner nextInt method does not read the newline character in your input 
		//created by hitting "Enter," and so the call to Scanner. nextLine returns after reading that newline
		
		// so first just add a line s.nextLine() and the use str2=s.nextLine() for this
	}

}
 