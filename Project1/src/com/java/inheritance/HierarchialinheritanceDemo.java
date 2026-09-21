package com.java.inheritance;

import java.util.Scanner;


public class HierarchialinheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p;
		//Loose coupling
		//p=new Employee();
     // System.out.println(p);
      Address ad=new Address("vtu road","Mysore","Karnataka",570029);
      System.out.println(ad);
     p=new Employee("Uzma","Mysore",ad,200,50000,1);
      System.out.println(p);
      //Data taken dynamically
     

	}

}
