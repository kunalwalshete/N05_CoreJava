package org.tns.customexception;

import java.util.Scanner;

public class CustomExceptionExecuter {

	public static void main(String[] args)  {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an emailId and Password");
		String email = s.nextLine();
		String password = s.nextLine();
		
		// == is case sensitive and 
		//.equals is not case sensitive
		
		try {
			if(email.equals("kunal") && password.equals("Pass@123")){
				System.out.println("Credentitials Matched");
			}
			else {
				throw new LoginCredentials("Invalid Credentials");
			}
		}
		
		// Custom Exception LoginCredentials which we are declared in LoginCredentials class
		catch(LoginCredentials e){
			System.out.println(e);
		}
		
	}

}
