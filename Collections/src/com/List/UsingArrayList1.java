package com.List;
import java.util.ArrayList;

public class UsingArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> obj= new ArrayList<String>();
		obj.add("hello");
		obj.add("welcome");
		obj.add("to");
		obj.add("collections");
		
		ArrayList<Integer> obj1= new ArrayList<Integer>();
		obj1.add(10);
		obj1.add(20);
		obj1.add(30);
		
		for(String s: obj)  //using for each loop
			System.out.println(s);
		for(Integer i: obj1)
			System.out.println(i);
		
	}

}
