package org.tns.uncheakedexception;

// Program to demonstrate on Arithmetic Exception
import java.util.Scanner;

public class ArithmeticExeceptionExecuter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		
		/*Try block contains exceptional code */
		try {
			System.out.println(x/y);
		}
		

		
		// Catch block is used to handle that exception
		// we can use pipe operator to give more than one exception in single catch block
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Exeception Handled ");
		}
		
		// If you declare any specific exception then and it occur then that catch block will execute
		// if the exception occur is not match to that specific exception then 2nd catch block is executed
		// which is universal and can handle any exception
				
		catch(Exception e) {
			System.out.println("Exeception Handled "+e);
		}
		
	
	}

}
