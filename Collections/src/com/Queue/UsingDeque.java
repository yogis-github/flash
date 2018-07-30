package com.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class UsingDeque {

	public static void main(String[] args) {
		Deque<String> obj= new ArrayDeque<String>();
		obj.add("Sanju");
		obj.add("Viru");
		obj.add("jai");
		
		obj.offerFirst("hello");
		obj.offerLast("bye");
		
		
		System.out.println(obj);
	}

}
