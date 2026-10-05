package com.java.interfaces.implementinginterfaces;

public class BankApplication {
	public static void main(String[] args) {
		Bank b=new BankImp();
		Account a=new Account(101,"Uzma",80000,b);
		
		b.deposit(a, 20000);
		System.out.println(a);
		b.withdraw(a, 10000);
		System.out.println(a);
		b.withdraw(a, 90000);
	}


}
