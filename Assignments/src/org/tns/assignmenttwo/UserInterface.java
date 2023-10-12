package org.tns.assignmenttwo;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// object of discount class 
		Discount dis = new Discount();
		
		// inputs
		System.out.println("Enter the customer Name : ");
		String name = s.nextLine();
		
		System.out.println("Enter your phone number : ");
		long phone = s.nextLong();
		
		System.out.println("Enter your address : ");
		String address = s.nextLine();
		
		System.out.println("Enter the bero type Steel Bero or Wooden Bero : ");
		String beroType = s.nextLine();
		
		// initilising bero
		Bero bero;      // this is polymorphic behaviour of object
		
		// creating respective bero object based on bero type;
		if(beroType.equals("Steel Bero")) {
			System.out.println("Enter the color of bero : ");
			String beroColour = s.nextLine();
			System.out.println("Enter the height of bero : ");
			int beroHeight = s.nextInt();
			bero = new SteelBero(beroType,beroColour,beroHeight);     // this is polymorphic behaviour of object
			bero.calculatePrice();
			double amount = bero.price - dis.calculateDiscount(bero);
			System.out.println("Amount need to be paid is : "+amount);
			
		}
		else if(beroType.equals("Wooden Bero")) {
			System.out.println("Enter the color of bero : ");
			String beroColour = s.nextLine();
			System.out.println("Enter the wood type for bero : ");
			String woodType = s.nextLine();
			bero = new WoodenBero(beroType,beroColour,woodType);      // this is polymorphic behaviour of object
			bero.calculatePrice();
			double amount = bero.price - dis.calculateDiscount(bero);
			System.out.println("Amount need to be paid is : "+amount);
			
		}
		else {
			System.out.println(beroType + "is an invalid bero type");
		}
		
		
		
	}

}
