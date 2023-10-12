// Program to define student entity
package org.tns.jdbcmvc;

public class Student {
	private int rollno;
	private String sname;
	private float per;
	
	// Default Constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	// Parameterized Constructor
	public Student(int rollno, String sname, float per) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.per = per;
	}
	
	// getter and setter methods

	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}


	// tpSting method
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", per=" + per + "]";
	}
	
}
