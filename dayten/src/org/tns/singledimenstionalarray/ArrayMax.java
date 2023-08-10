package org.tns.singledimenstionalarray;

import java.util.Arrays;
import java.util.Scanner;

// Program to demonstrate on run-time array and to find out largest element in array
public class ArrayMax {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("How many elements you want to store in array : ");
		int n = s.nextInt();
		// declaring a array of size n
		int arr[] = new int[n];
		
		// taking the user input for each element
		System.out.println("Enter the "+n+" elements of array : ");
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();		
		}
		
		// Printing an array
		System.out.println("Array elements are : ");
		for(int i:arr) {
			System.out.print(i + " ");
		}
		System.out.println();  // this line is just to jump on next line
		
		// finding the maximum element in array
		int max = arr[0];
		for(int i=0; i<n; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("The Largerst element of array is : "+ max);
		
		
		
		// Built in function for arrays
		// Arrays is a predefined class which contain many method's like Arrays.sort();
		
	    Arrays.sort(arr);
		// Printing an sorted  array
		System.out.println("The sorted array is  : ");
		for(int i:arr) {
			System.out.print(i + " ");
		}
		
		
		}

}
