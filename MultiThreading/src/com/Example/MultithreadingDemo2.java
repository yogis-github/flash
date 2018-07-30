package com.Example;

public class MultithreadingDemo2 implements Runnable{
	public void run() {
		System.out.println("thread runs using runnable");
		System.out.println(Thread.currentThread().getName()); //displays currently executing thread
	}
	public static void main(String[] args) {
		MultithreadingDemo2 obj= new MultithreadingDemo2();
		Thread t= new Thread(obj);
		t.start();
		Thread t1= new Thread(obj);
		t1.start();
		
	}

}
