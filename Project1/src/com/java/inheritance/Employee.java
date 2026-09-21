package com.java.inheritance;

public class Employee extends Person {
	private int eId;
	private double salary;
	private int deptid;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public Employee() {
		super();
		this.deptid = 1;
		this.eId = 100;
		this.salary = 30000;
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String city, Address address,int eId, double salary, int deptid) {
		super(name, city, address);
		this.eId = eId;
		this.salary = salary;
		this.deptid = deptid;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", salary=" + salary + ", deptid=" + deptid + ", getName()=" + getName()
				+ ", getCity()=" + getCity() + ", Address= " +"Street"+ getAddress().getStreet() + "Pincode + "+getAddress().getPincode()+"]";
	}
	
	

}
