package com.Examples;

public class TRyBlocks {
	public static void main(String[] args) {
	try {
		int a= 10/2;
		System.out.println(a);
	}
	catch (ArithmeticException e) {
		System.out.println("exception handled");
	}
	finally {
		System.out.println("inside finally block");
	}
	}
}
