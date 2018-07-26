package com.Blocks;

public class ExceptionPropagation {
	void M() {
		int a[]= {1,2,3,4};
		System.out.println(+a[7]);
	}
	void N() {
		M();
	}
	void O() {
		N();
	}
	void P() {
		try {
			O();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{System.out.println("exception propogation running");
		e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ExceptionPropagation E= new ExceptionPropagation();
		E.P();
	}
}
