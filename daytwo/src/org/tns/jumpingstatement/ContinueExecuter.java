// Program to demonstrate continue statement
package org.tns.jumpingstatement;

public class ContinueExecuter {
	public static void main(String[] args) {
		int n = 10;
		for (int i=1; i<=n; i++) {
			
			if(i==5)
				continue;               // it will skip the current condition and continue on next
			else
				System.out.println(i + " ");
		}

	}

}
