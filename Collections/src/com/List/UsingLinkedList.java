package com.List;
import java.util.LinkedList;

public class UsingLinkedList {

	public static void main(String[] args) {
		LinkedList<String> obj= new LinkedList<String>();
		LinkedList<Integer> obj1= new LinkedList<>();
		obj.add("hello");
		obj.add("inside");
		obj.add("Linked list");
		obj1.add(1);
		obj1.add(2);
		obj.add("Collections");
		obj1.add(4);
		
		for(String o: obj)
			System.out.println(o);
		for(Integer i: obj1)
			System.out.println(i);
	}

}
