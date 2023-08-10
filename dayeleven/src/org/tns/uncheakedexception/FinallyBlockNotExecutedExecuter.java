package org.tns.uncheakedexception;

// Program to demonstrate on Arithmetic Exception
import java.util.Scanner;

public class FinallyBlockNotExecutedExecuter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		
		/*Try block contains exceptional code */
		try {
			System.out.println(x/y);
			// System.exit(0);
			
			// If this line is executed then no further program is executed program will terminate form this line
			// so finally block is not executed if any exception is not occur
			// if exception is occur then program is jumped to catch block and System.exit() is not executed
			// so finally block is executed if there is no System.exit() in catch block
		}
		
		// Catch block is used to handle that exception
		catch(Exception e) {
			System.out.println("Exeception Handled "+e);
			// System.exit(0);
			
			// If this line is executed then no further program is executed program will terminate form this line
			// so finally block is not executed if any exception occur 
			// if exception is not occur and there is no System.exit() in try block then finally block is executed
			}
		
		finally {
			System.out.println(4/0);
			// When finally Block contain any exception then finally block is not executed
			System.out.println("Finally Block is always executed");
		}
		
		
		
	
	}

}
