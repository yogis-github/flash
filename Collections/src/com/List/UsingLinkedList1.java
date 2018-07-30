package com.List;
import java.util.LinkedList;

public class UsingLinkedList1 {

	public static void main(String[] args) {
		LinkedList<String> obj= new LinkedList<String>();
		obj.add("jhon");
		obj.add("jordan");
		obj.add("james");
		obj.add("tom");
		
		LinkedList<String> obj1= new LinkedList<String>();
		obj1.add("jerry");
		obj1.add("jack");
		obj.addAll(obj1);
		
		for(String o: obj)
			System.out.println(o);	
	}
}
