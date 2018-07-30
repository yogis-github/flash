package com.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class UsingLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> obj= new LinkedHashMap<Integer, String>();
		
		obj.put(3, "raju");
		obj.put(10, "mahesh");
		obj.put(11, "chandu");
		obj.put(9, "satish");
		
		for(Map.Entry m: obj.entrySet()) {
			System.out.println(m.getKey()+ " "+m.getValue());
	}
	}
}
