// Program to demonstrate break statement
package org.tns.jumpingstatement;

public class BreakExecuter {

	public static void main(String[] args) {
		int n = 10;
		for (int i=1; i<=n; i++) {
			
			if(i==5)
				break;         // break the code from that line and no further code is executed
			else
				System.out.println(i + " ");
		}

	}

}
