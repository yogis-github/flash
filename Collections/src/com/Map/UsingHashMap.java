package com.Map;
import java.util.HashMap;
import java.util.Map;

public class UsingHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> obj= new HashMap<Integer, String>();
		obj.put(3, "saroj");
		obj.put(10, "nitin");
		obj.put(20, "jack");
		obj.put(5, "ashok");
		obj.put(11, "manoj");
		obj.put(9, "james");
		obj.put(19, "amit");

		for(Map.Entry m: obj.entrySet()) {
			System.out.println(m.getKey()+ " "+m.getValue());
		}
	}
}
