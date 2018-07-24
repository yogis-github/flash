package com.Abstraction;

  class Hii extends Hello{
	 void eat() {
		 System.out.println("eating");
	 }
	 void read() {
		 System.out.println("reading");
	 }

	public static void main(String[] args) {
		Hii obj= new Hii();
		obj.eat();
		obj.read();
	}

}
