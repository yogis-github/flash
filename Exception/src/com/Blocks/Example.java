package com.Blocks;

class Example
{
	void a() throws Exception  {
		throw new Exception("Hello");
	}
	public static void main(String[] args) throws Exception {
		Example e= new Example();
		e.a();
	}
}