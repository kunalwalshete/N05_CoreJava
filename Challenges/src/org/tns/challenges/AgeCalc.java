/* Question 3 :  Ask a user for their birth year encoded as 2 digit ( like "62" ) and for the current 
 *              year,  also encoded as 2 digit (like "99") write a program to find the user's current
 *              age in year's 
 *       
 *      Input:  Current year  
 *                 Birth Year   */

package org.tns.challenges;

import java.util.Scanner;

public class AgeCalc {
	
	static int ageCaluculator(int cYear, int bYear) {
		if(cYear<bYear) {
			return cYear+(100-bYear);
		}
		else {
			return cYear-bYear;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value of Current Year : ");
		int cYear = s.nextInt();
		System.out.println("Enter the value of Birth Year : ");
		int bYear = s.nextInt();
		System.out.println("Your age is : "+ageCaluculator(cYear,bYear));
		
		

	}

}
