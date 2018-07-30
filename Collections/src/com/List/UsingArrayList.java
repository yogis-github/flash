package com.List;
import java.util.ArrayList;
import java.util.Iterator;

public class UsingArrayList {

	public static void main(String[] args) {
		ArrayList<String> obj= new ArrayList<String>();
		obj.add("hello");
		obj.add("welcome");
		obj.add("to");
		obj.add("collections");

		Iterator itr= obj.iterator();  //using iterator
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
