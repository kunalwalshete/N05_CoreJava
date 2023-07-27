package org.tns.singleinheritance;
// Base Class (Parent Class)
public class Citizen {

	private String city;
	private int pincode;
	private long adhaarNo;
	private long contactNo;
	
	
	// Default Constructor
	public Citizen() {
		System.out.println("Default Constructor of Parent Class");
	}

	// Parameterized constructor
	public Citizen(String city, int pincode, long adhaarNo, long contactNo) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.adhaarNo = adhaarNo;
		this.contactNo = contactNo;
		System.out.println("Parameterized constructor of parent (Cittizen Class)");
	}
	
	
	// Getter's and setter's method
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public long getAdhaarNo() {
		return adhaarNo;
	}
	public void setAdhaarNo(long adhaarNo) {
		this.adhaarNo = adhaarNo;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Citizen [city=" + city + ", pincode=" + pincode + ", adhaarNo=" + adhaarNo + ", contactNo=" + contactNo
				+ "]";
	}
	
	
	
	
	
	
	
	
}
