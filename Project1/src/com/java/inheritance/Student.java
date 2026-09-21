package com.java.inheritance;

public class Student extends Citizen {
	private int rollNo;
	private String clgname;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getClgname() {
		return clgname;
	}
	public void setClgname(String clgname) {
		this.clgname = clgname;
	}
	public Student() {
		super();
		System.out.println("In student class");
		// TODO Auto-generated constructor stub
	}
	public Student(String name, long adharNumber, String address, long phNo,int rollNo, String clgname) {
		super(name, adharNumber, address, phNo);
		this.rollNo = rollNo;
		this.clgname = clgname;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", clgname=" + clgname + ", Name=" + getName()
				+ ", AdharNumber" + getAdharNumber() + ", Address=" + getAddress() + ", PhNo=" + getPhNo()
				+ "]";
	}

	
	
	

}
