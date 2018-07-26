package com.Blocks;
import java.io.IOException;

public class ThrowThrows {
	void A() throws IOException  {
		System.out.println("using throws");
			throw new IOException();
	}
	
	public static void main(String[] args) throws IOException  {
		ThrowThrows obj= new ThrowThrows();
			obj.A();
	}
}
