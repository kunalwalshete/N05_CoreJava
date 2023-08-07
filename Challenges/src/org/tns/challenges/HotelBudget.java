/*  new project = coding challenge for this two challenges xyz, xyz2 
 * Write a program to calculate hotel tariff(Budget). the room rent is 20% high during 
 * peak season's (April - June) and (Nov - Dec)
 * 
 * 
 * sample input :  month = 3  (March)
 * 					rent 
 *                  day    no. of days you are leaving
 *                   rent * day = budget
 *                   but 20 % high during peak season 
 *                    */

package org.tns.challenges;

import java.util.Scanner;

public class HotelBudget {
	
	static void tariff(int month, int day, int rent) {
		
		switch (month) {
		case 4:
		case 5:
		case 6:
		case 11:
		case 12:
			rent += (rent*0.20);
			System.out.println("The budget of hotel is : "+rent*day);
			break;
		
		case 1:
		case 2:
		case 3:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("The budget of hotel is : "+rent*day);
			break;
		default:
			System.out.println("Invalid month number.");
		
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("In which month you are going to stay in hotel : ");
		int month = s.nextInt();
		System.out.println("How many day's you are going to stay in hotel : ");
		int day = s.nextInt();
		System.out.println("The rent of hotel : ");
		int rent = s.nextInt();
		tariff(month,day,rent);
		
	}

}
