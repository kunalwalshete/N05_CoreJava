/*  A microwave oven manufacturer recommended that when you heating two item's ,
 *  add 50% of heating time to the original heating time
 * and when heating 3 item's double the heating time.
 * Heating more than 3 items at once is not recommended 
 * write a program to find out the recommended heating time
 * 
 * item = 2 and heating time = 5.0 is input
 * */

package org.tns.challenges;

import java.util.Scanner;

public class MicrowaveProblem {
	
	public static void Microwave(int item, float htime) {
		
		switch(item) {
		
		case 1:
			System.out.println(" The time for heating is : "+ htime);
			break;
		
		case 2:
			htime+=htime*0.5;
			System.out.println(" If there are 2 item's then the time for heating is : "+ htime);
			break;
			
		case 3:
			htime*=2;
			System.out.println(" If there are 3 item's then the time for heating is :"+ htime);
			break;
			
		default:
			System.out.println(" Heating more than 3 items at once is not recommended ");
		}
				
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of item's : ");
		int item = s.nextInt();
		System.out.println("Enter the original heating time : ");
		float htime = s.nextInt();
		
		Microwave(item,htime);
	}
	
}
