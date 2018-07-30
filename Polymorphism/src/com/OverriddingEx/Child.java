package com.OverriddingEx;

class Parent {
	public void first() {
		System.out.println("inside parent class");
	}
}
public class Child extends Parent{
	public void first() {
		System.out.println("inside child class");
	}
	public static void main(String[] args) {
		Child c= new Child();
		c.first();
		Parent p= new Parent();
		p.first();
	}

}
