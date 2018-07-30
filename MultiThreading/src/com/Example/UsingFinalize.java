package com.Example;

public class UsingFinalize {
	public void finalize() {
		System.out.println("garbage collected using finilize");
	}
	public static void main(String[] args) {
		UsingFinalize g= new UsingFinalize();
		g= null;// unreferenced value
		System.gc();
	}

}
