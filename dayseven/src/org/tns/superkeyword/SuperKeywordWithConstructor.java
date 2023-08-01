/* Super Keyword with constructor */
package org.tns.superkeyword;

class Nationality{
	String nationName;

	public Nationality(String nationName) {
		this.nationName = nationName;
		System.out.println(nationName);
	}	
}

class Person extends Nationality{
	
	String language;

	public Person(String nationName, String language) {
		super(nationName);                               // this will called the constructor of parent class
		this.language = language;                         // i.e Nationality and passed argument is from 
		System.out.println(language);                    // child class constructor i.e. nationName
	}
	
}

public class SuperKeywordWithConstructor {

	public static void main(String[] args) {

		Person p = new Person("India","Hindi");

	}

}
