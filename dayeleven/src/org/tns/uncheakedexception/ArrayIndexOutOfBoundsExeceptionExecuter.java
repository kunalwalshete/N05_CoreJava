package org.tns.uncheakedexception;

// Program to demonstrate ArrayIndexOutOfBounds Exception, finally block, and statement outside try-catch-finally blocks
public class ArrayIndexOutOfBoundsExeceptionExecuter {

	static void print(int arr[]) {
		// Try block is always followed by catch block or finally block otherwise you will get error
		try {
			System.out.println(arr[3]);
		}
		
		catch(Exception e) {
			System.out.println("Exception handled "+e);
		}
		
		// Finally block is always executed independent on where the exception occurs or not
		// there are some condition where finally block is not executed ???
		/* 1) The death of thread
		 * 2) When exception occurs in finally block
		 * 3) System.exit()*/
		finally {
			System.out.println("Finally block is always executed");
		}
		
		System.out.println("Any statement outside try-catch-finally block is always executed");
	}
	
	public static void main(String[] args) {
		int arr[] = {12,4,5};
		ArrayIndexOutOfBoundsExeceptionExecuter.print(arr);

	}

}
