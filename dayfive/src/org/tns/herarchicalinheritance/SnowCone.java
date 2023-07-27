// Child Class 2
package org.tns.herarchicalinheritance;

public class SnowCone extends Android{
	
	private int version;

	
	// Parameterized Construcotr

	public SnowCone(String brand, String slotType, int version) {
		super(brand, slotType);
		this.version=version;
		System.out.println("Parametrized construcot of child 2");
		// TODO Auto-generated constructor stub
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
		return "SnowCone [version=" + version + ", toString()=" + super.toString() + "]";
	}

}
