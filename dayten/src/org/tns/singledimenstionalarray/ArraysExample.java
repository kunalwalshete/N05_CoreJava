package org.tns.singledimenstionalarray;

// Program to demonstrate on array using compile time input values
public class ArraysExample {

	public static void main(String[] args) {
		
		// declaration and initialization of an array at compile time
		int arr[] = {44,56,2,32,28};
		// int[] arr = {44,56,2,32,28};   // you can do this way also
		
		System.out.println("The element of 2nd index is : "+arr[2]);
		
		
		// Printing all the values of array using enhance for loop
		// when you use enhance for loop we have to use i instead of arr[i]
		for(int i: arr) {
			System.out.print(i+", ");
		}

		

	}

}
