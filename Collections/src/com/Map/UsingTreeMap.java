package com.Map;

import java.util.Map;
import java.util.TreeMap;

public class UsingTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> obj= new TreeMap<Integer, String>();

		obj.put(20, "vijay");
		obj.put(5, "ajay");
		obj.put(10, "hello");
		obj.put(1, "sanju");

		for(Map.Entry m: obj.entrySet()) {
			System.out.println(m.getKey()+ " "+m.getValue());
		}
	}

}
