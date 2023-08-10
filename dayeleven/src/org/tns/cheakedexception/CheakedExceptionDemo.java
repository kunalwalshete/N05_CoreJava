package org.tns.cheakedexception;


// Program to demonstrate Cheaked exception
// cheaked exception are occured at compile time so there is a red linting where the exception occurs
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheakedExceptionDemo {

	public static void main(String[] args) {
		
		try {
			FileInputStream f = new FileInputStream("C:\\Users\\Kunal\\OneDrive\\Desktop\\Dmeo.txt");
			System.out.println("File Has Found");
		} catch (FileNotFoundException e) {
			System.out.println("FIle is not exits : "+ e);
		}

	}

}
