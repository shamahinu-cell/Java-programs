package com.java.inheritance;

public class Students extends Person{
	private String clas;
	private float perc;
	public Students() {
		super();
		this.clas = "FY";
		this.perc = 50.00f;
		// TODO Auto-generated constructor stub
	}
	public Students(String name, String city,String clas, float perc) {
		super();
		this.clas = clas;
		this.perc = perc;
	}
	@Override
	public String toString() {
		return "Studentt [clas=" + clas + ", perc=" + perc + ", getName()=" + getName() + ", getCity()=" + getCity()
				+ "]";
	}
	
	
	

}
