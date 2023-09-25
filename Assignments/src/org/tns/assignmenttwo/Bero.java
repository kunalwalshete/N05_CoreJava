package org.tns.assignmenttwo;

public abstract class Bero {

	protected String beroType;
	protected String beroColour;
	protected double price;
	
	// abstract method
	public abstract void calculatePrice();
	
	// constructor
	public Bero(String beroType, String beroColour) {
		super();
		this.beroType = beroType;
		this.beroColour = beroColour;
	}
	

	// getter setter methods
	public String getBeroType() {
		return beroType;
	}

	public void setBeroType(String beroType) {
		this.beroType = beroType;
	}

	public String getBeroColour() {
		return beroColour;
	}

	public void setBeroColour(String beroColour) {
		this.beroColour = beroColour;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
