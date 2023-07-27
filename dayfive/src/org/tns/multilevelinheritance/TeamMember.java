// this is out Child class
package org.tns.multilevelinheritance;

public class TeamMember extends TeamLead 
{
	
	int size;
	int duration;
	
	
	// Parameterized constructor
	public TeamMember(String deptName, String name, int empid, String leadName, int empID2, String projectName,
			            int size, int duration) {
		super(deptName, name, empid, leadName, empID2, projectName);
		this.size=size;
		this.duration=duration;
		System.out.println("THis is parameterized construtor of Teammember class (Child) ");
	}

	// Getter's and Setter's Method
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	// toString Method
	@Override
	public String toString() {
		return "TeamMember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
