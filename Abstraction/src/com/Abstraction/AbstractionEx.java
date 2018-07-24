package com.Abstraction;

abstract class Human{
	abstract void run();
	abstract void eat();
	
	void speak() {
		System.out.println("can speak language");
	}
}
public class AbstractionEx extends Human {
	void run() {
		System.out.println("can run");
	}
	void eat() {
		System.out.println("eating");
	}

	public static void main(String[] args) {
		AbstractionEx obj= new AbstractionEx();
		obj.eat();
		obj.run();
		obj.speak();
	}

}
