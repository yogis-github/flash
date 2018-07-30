package com.OverloadingEx;

public class A {
	
	public void hello(int a) {
		System.out.println("hello world");
	}
	
	public void hello(char b) {
		System.out.println("hii");
	}

	public static void main(String[] args) {
		A a= new A();
		a.hello(2);
		a.hello('a');
	}

}
