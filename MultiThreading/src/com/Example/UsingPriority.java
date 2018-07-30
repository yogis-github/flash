package com.Example;

public class UsingPriority extends Thread {
	public void run(){  
		System.out.println("thread name: "+Thread.currentThread().getName());  
		System.out.println("thread priority: "+Thread.currentThread().getPriority());  

	} 
	public static void main(String[] args) { 
		UsingPriority p1=new UsingPriority(); 
		UsingPriority p2=new UsingPriority();
		UsingPriority p3= new UsingPriority();
		p1.setPriority(MAX_PRIORITY);
		p2.setPriority(NORM_PRIORITY);
		p3.setPriority(MIN_PRIORITY);
		p1.start();
		p2.start();
		p3.start();
	}

}
