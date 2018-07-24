package com.Interface;

interface A{
	public void Add();
	public void multiply();
	public void subtract();
}
class InterfaceEx implements A {
	public void Add() {
		int a=5, b=10;
		int c= a*b;
		System.out.println("the output will be: "+c);
	}
	public void multiply() {
		int a=5, b=10;
		int c= a+b;
		System.out.println("the output will be: "+c);
	}

	public void subtract() {
		int a=20, b=10;
		int c= a-b;
		System.out.println("the output will be: "+c);
	}
	public static void main(String[] args) {
		InterfaceEx obj= new InterfaceEx();
		obj.Add();
		obj.multiply();
		obj.subtract();
	}
}
