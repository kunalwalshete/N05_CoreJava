package org.tns.customexceptiontwo;

public class MyException extends Exception {

	// variables
	private static int accno[] = {101,102,103,104};
	private static String name[] = {"Teja","Neha","Tim","Robby"};
	private static double bal[] = {10000.00,1200.00,2348.97,480.88};
	
	
	// constructors
	public MyException() {
		
	}
	
	public MyException(String str) {
		super(str);
	}
	
	
	public static void main(String[] args) {
		
		try {
			System.out.println("Accno"+"\tName"+"\tBalanceNo");
			for(int i=0; i<4;i++) {
				System.out.println(accno[i]+"\t"+name[i]+"\t"+bal[i]);
				
				if(bal[i]<1000) {
					MyException e = new MyException("Balance is less than 1000 for Account no : " +accno[i]);
					throw e;
				}
			}
			
			
		}
		catch(MyException e) {
			e.printStackTrace();;
		}
	}
	
	
	
}
