package org.tns.multidimentionalarray;

import java.util.Scanner;

// Program to demonstrate on jagged array
// row size in fixed but column size in not fixed
// i.e the outside size is fixed but inside array size is different for different outside index
public class JaggedArrayDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// Declaring a jagged array 
		// outside values is known but inside values is not known
		int arr[][] = new int [2][];
		
		// for outside array index 0, storing 3 elements 
		arr[0]= new int[3];
		// for outside array index 1, storing 2 elements 
		arr[1] = new int[2];
		
		// For initializing the jagged array elements
		System.out.println("Enter the elements of array : ");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = s.nextInt();		
				}
		}

		// Printing the jagged array elements
		System.out.println();
		System.out.println("The elemnts of jagged array are : ");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");			
				}
			System.out.println();
		}
		
		
		
		

	}

}
