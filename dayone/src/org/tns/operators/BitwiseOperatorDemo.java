// Program to demonstrate Bitwise operator  ( Here we use the binary form of numbers and PA formulas table  for and or xor)
/* Types = 
 * 1).& (Bitwise and) , 
 * 2) | (Bitwise or) , 
 * 3) ^ (Bitwise XOR) , 
 * 4) << (Bitwise Leftshift),  if a >> b  then   formula = a x 2^b
 * 5) >> (Bitwise Rightshift) */
package org.tns.operators;

public class BitwiseOperatorDemo {

	public static void main(String[] args) {
		int x = 15, y = 3;
		
		System.out.println(x&y);
		System.out.println(x|y);
		System.out.println(x^y);
		System.out.println(8>>1);   // right shift
		System.out.println(8<<1);   // left shift

	}

}
