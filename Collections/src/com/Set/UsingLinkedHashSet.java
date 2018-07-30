package com.Set;

import java.util.LinkedHashSet;

public class UsingLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Integer> obj= new LinkedHashSet<Integer>();
		obj.add(100);
		obj.add(10);
		obj.add(20);
		obj.add(1);
		obj.add(50);
		obj.add(40);
		
		System.out.println(obj);
	}

}
