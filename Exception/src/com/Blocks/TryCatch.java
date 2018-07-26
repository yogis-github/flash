package com.Blocks;

public class TryCatch {

	public static void main(String[] args) {
		try {
			int a= 10/0;
			System.out.println(a);
			System.out.println("insdie try block");
		}
		catch(ArithmeticException x) {
			System.out.println(x);
			System.out.println("exception handled");
		}
	}
}

