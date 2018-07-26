package com.Examples;

public class ThrowEx {
	void a() throws Exception {
		int x= 20/0;
		throw new Exception("using throw block");
	}
	void b() throws Exception {
		a();
	}
	void c() throws Exception {
		b();
	}
	public static void main(String[] args) {
		ThrowEx obj = new ThrowEx();
		try {
			obj.c();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
