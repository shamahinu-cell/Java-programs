package com.java.Exception;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo s1=new StudentInfo();
		s1.setRollNo(110);
		s1.setName("Uzma");
		s1.setPerc(12);
		s1.show();
		
		VoterInfo v=new VoterInfo();
		v.setName("David");
		v.setAge(19);
		System.out.println(v);

	}

}
