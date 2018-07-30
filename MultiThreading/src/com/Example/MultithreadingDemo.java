package com.Example;

public class MultithreadingDemo extends Thread{
	public void run() {
		System.out.println("thread run using thread");
	}
	public static void main(String[] args) {
		MultithreadingDemo obj= new MultithreadingDemo();
		obj.start();
		MultithreadingDemo obj1= new MultithreadingDemo();
		obj1.start();
	}

}
