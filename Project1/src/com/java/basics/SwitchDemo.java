package com.java.basics;

public class SwitchDemo {
	public static void main(String[] args) {
		char x = 'I';
		switch(x)
		{
		case 'I':
		case 'L':
			System.out.println(x+ "is a Letter");
			break;
		case 'd':
		case 'D':
			System.out.println(x+"is a Digit");
			break;
		case 'w':
		case 'W':
			System.out.println(x+"is a White Space");
		case 's':
		case 'S':
			System.out.println(x+"ia Special Symbol");
			default:
				System.out.println(x+" is other than letter, digit, space or special symbol");
				break;
		
		}
		
	}

}
