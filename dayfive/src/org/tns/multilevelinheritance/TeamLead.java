// Child class of Manager and parent class ( Father) 
package org.tns.multilevelinheritance;

public class TeamLead extends Manager
{ 
	// Private data members
	private String leadName;
	private int empID;
	private String projectName;
	
	
	// parameterized constructor
	public TeamLead(String deptName, String name, int empid, String leadName, int empID, String projectName) {
		super(deptName, name, empid);
		this.leadName= leadName;
		this.empID= empID;
		this.projectName = projectName;
		System.out.println("Parameterized constructor for Teamlead Class (Father) ");
	}
	
	
	// Getter's and Setter's
	public String getLeadName() {
		return leadName;
	}
	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	// to string method and it also inherits the tostring method of manager class
	@Override
	public String toString() {
		return "TeamLead [leadName=" + leadName + ", empID=" + empID + ", projectName=" + projectName + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	

}
