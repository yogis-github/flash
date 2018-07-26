package com.Blocks;

public class UsingThrows {
	void A() throws Exception {
		throw new Exception("new exception");
	}
	void B() {
			try {
				A();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static void main(String[] args)  {
		UsingThrows obj= new UsingThrows();
		try {
			obj.B();
			obj.A();
		} catch (Exception e) {
			System.out.println("exception handled");
		}		
	}

}
