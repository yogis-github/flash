package com.Set;

import java.util.HashSet;

public class UsingHashSet {

	public static void main(String[] args) {
		HashSet<String> obj= new HashSet<String>();
		HashSet<Integer> obj1= new HashSet<Integer>();

		obj.add("Raj");
		obj.add("Sanju");
		obj.add("Raj");
		obj.add("Sams");
		obj.add("Vijay");
		obj.add("Vinod");
		
		obj1.add(10);
		obj1.add(12);
		obj1.add(30);
		obj1.add(20);
		obj1.add(12);
		
		for(String s:obj) {
			System.out.println(s);
		}
		for(Integer i:obj1) {
			System.out.println(i);
		}
	}
}
