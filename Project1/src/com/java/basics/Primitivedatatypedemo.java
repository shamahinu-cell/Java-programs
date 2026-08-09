package com.java.basics;

public class Primitivedatatypedemo {

	public static void main(String[] args) {
		byte byteMax = 127;
		byte byteMin = -127;
		System.out.println("Min range of byte is:" +byteMin +"\nMax range of byte is" +byteMax);
		// TODO Auto-generated method stub
		short shortMin = 32767;
		short shortMax = -32768;
		System.out.println("Minshort range of byte is:" +shortMin +"\nMaxshort range of byte is" +shortMax);
		int maxInt = 2147483647;
		int minInt = -2147483648;
		System.out.println("Minint range of byte is:" +minInt +"\nMaxint range of byte is" +maxInt);
        long maxLong = 9223372036854775807L;
        long minLong = -9223372036854775807L;
        System.out.println("Minlong range of byte is:" +minLong+"\nMaxlong range of byte is" +maxLong);
        float f = 3234.141243278345f;
        double d = 3456.1412451234567890234567891;
        System.out.println("float value is" +f +"double value is" +d);
        boolean flag = false;
        System.out.println("boolean value is"+flag);
	}

}
