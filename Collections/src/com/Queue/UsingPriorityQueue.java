package com.Queue;
import java.util.PriorityQueue;

public class UsingPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> obj= new PriorityQueue<Integer>();
		obj.add(10);
		obj.add(20);
		obj.add(7);
		obj.add(50);
		obj.add(5);
		obj.add(15);
		obj.add(100);

		System.out.println(obj);
		System.out.println("**************");

		obj.poll();
		System.out.println(obj);

		System.out.println("**************");
		obj.peek();
		System.out.println(obj);

		System.out.println("**************");

	}

}
