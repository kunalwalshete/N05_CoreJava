package org.tns.uncheakedexception;

import java.io.IOException;

public class ThrowExecuter {

	/* Throws keyword is used to declare an exception it used with method */
	static void isEligible(int age, int weight) throws IOException 
	{
		if(age>18 && weight>50) {
			System.out.println("Elgible to Donate the Blood");
		}
		
		// throw keyword used to throw an exception explicitly ( Red Fonts )
		// catch block throw implicitly ( No Red Font )
		else {
			throw new IOException("Age and weight criteria is not fullfilled");
		}	
	}
	/* Throws keyword is used to declare an exception it used with method */

	
	public static void main(String[] args) throws IOException{
		
		ThrowExecuter.isEligible(12, 54);
	}
}

// thorw
/* Used throw exception explicitly, cheaked exception cannot be propogated, followed by instace, used withhin method
 * cannot throw multiple exception*/
// throws
 /*USed to decalre excepiton, cheaked exception can be propogaed, follwed by class, used with method signature*/