// Parent Class
package org.tns.herarchicalinheritance;

public class Android {

	private String brand;
	private String slotType;
	
	
	// Default Constructor
	public Android() {
		super();
		System.out.println("Default Constructor of Parent");
	}

	// Parameterized Constructor
	public Android(String brand, String slotType) {
		super();
		this.brand = brand;
		this.slotType = slotType;
		System.out.println("Parameterized Constructor of Parent");
	}

	// Getter's and Setter's method
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSlotType() {
		return slotType;
	}

	public void setSlotType(String slotType) {
		this.slotType = slotType;
	}

	
	// tostring method
	@Override
	public String toString() {
		return "Android [brand=" + brand + ", slotType=" + slotType + "]";
	}
	
	
	
	
	
	
}
