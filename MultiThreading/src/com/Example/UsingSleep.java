package com.Example;

public class UsingSleep extends Thread{
	public void run() {
		for(int i=1; i<=5; i++) {
			try {
				Thread.sleep(2000);	
				System.out.println(Thread.currentThread().getName());
			}
			catch(Exception E){
				System.out.println(E);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		UsingSleep obj= new UsingSleep();
		obj.start();
		UsingSleep obj1= new UsingSleep();
		obj1.start();

	}

}
