/* Ask the customer's age for the time on a 24-hour clock
 * (where noon is 12:00 and 4:30 PM is 16:30). The show 
 * timing are 10:15, 13:30, 18:00, 22:00. The normal adult 
 * ticket price $8.00, however, the adult matinee  price is
 * $5.00. Adults those over 13 years. The normal childern's
 * ticket price is $4.00, however, the childern's matinee
 * price is $2.00. write a program to determines the price
 * of movie ticket.
 * 
 *  sample input 16, 10:15
 *  sample output $8.00*/
package org.tns.challenges;


import java.util.Scanner;

public class MovieTicket {
	
	// Mam's solution
//	static void ticket(int age, float time) {
//		// adult
//		if(age>13) {
//			if(time>13.30 && time<=17.59) {
//				System.out.println("The ticket price is : $5.00");
//			}
//			else {
//				System.out.println("The ticket price is : $8.00");
//			}
//		}
//		else {
//			if(time>13.30 && time<=17.59) {
//				System.out.println("The ticket price is : $2.00");
//			}
//			else {
//				System.out.println("The ticket price is : $4.00");
//			}
//		}
//	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = s.nextInt();
		System.out.println("Enter the show time : ");
		float time = s.nextFloat();
		
		// Mam's solution
		//ticket(age,time);
		
		// My solution
		
		if(age>13 && time>=00.00 && time<=24.00) {
			if(time>=12.00 && time<=16.30) {
				System.out.println("The price of movie ticket is : $5.0");
			}
			else {
				System.out.println("The price of movie ticket is : $8.0");
			}
		}
		else if(age<=13 && time>=00.00 && time<=24.00) {
			if(time>=12.00 && time<=16.30) {
				System.out.println("The price of movie ticket is : $2.0");
			}
			else {
				System.out.println("The price of movie ticket is : $4.0");
			}
		}
		else {
			System.out.println("Enter the valid age or time");
		}	
		
	}

}
