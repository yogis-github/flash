package com.Example;

public class UsingJoin extends Thread {
	public void run() {
		for(int i=1; i<=5; i++) {
			try {
				Thread.sleep(5000);
				System.out.println(Thread.currentThread().getName());
			}
			catch(Exception e){
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		UsingJoin obj= new UsingJoin();
		UsingJoin t= new UsingJoin();
		UsingJoin t1= new UsingJoin();
		obj.start();
		try{  
			obj.join(3000);  
			System.out.println("new thread joins");
		}
		catch(Exception E)
		{
			System.out.println(E);
		}  
		t.start();
		t1.start();
	}

}
