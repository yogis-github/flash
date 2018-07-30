package com.OverloadingEx;

public class Sum {
	
	public void Add(int a, int b) {
		System.out.println("the sum of the nos: "+(a+b));
		
	}
	public void Add(int a, int b, int c) {
		System.out.println("the sum of the nos: "+(a+b+c));
	}

	public static void main(String[] args) {
		Sum s= new Sum();
		s.Add(10, 20);
		s.Add(12, 5, 9);
	}
}
