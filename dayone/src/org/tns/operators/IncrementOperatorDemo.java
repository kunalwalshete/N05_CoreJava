// Program to demonstrate
package org.tns.operators;

public class IncrementOperatorDemo {

	public static void main(String[] args) {
		int p=11, q=2;
		
		int x = p++;         // postincrement
		int y = p + q;        // here p become 12 because of p++  so  12 + 2 = 14
		int z = ++q;         // preincrement   here q++ = q + 1  = 2 + 1 = 3
		
		System.out.println("Value of x : " + x);
		System.out.println("Value of y : " + y);
		System.out.println("Value of p : " + p);
		System.out.println("Value of z : " + z);

	}

}
