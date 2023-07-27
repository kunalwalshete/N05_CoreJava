// Child class 1
package org.tns.herarchicalinheritance;

public class Teramisu extends Android{

	private int version;

	
	// Parameterized Constructor
	public Teramisu(String brand, String slotType, int version) {
		super(brand, slotType);
		this.version=version;
		System.out.println("Default Constructor of Child 1");
	}

	// Getter's and Setter's methods
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	
	// to string method and also inherits the to string method of android
	@Override
	public String toString() {
		return "Teramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
