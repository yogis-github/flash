package com.Compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Emp{
	int id;
	int age;
	String name;
	Emp(int id, int age, String name){ 
		this.id= id;
		this.age=age;
		this.name=name;
	}
}
class AgeComparator implements Comparator<Emp>{
	@Override
	public int compare(Emp a1, Emp a2) {
		if (a1.age== a2.age)
			return 0;
		else if(a1.age>a2.age)
			return 1;
		else
			return -1;
	}
}
class NameComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp a1, Emp a2) {
		return a1.name.compareTo(a2.name);
	}
	
	}

public class UsingCompratorEx {
	public static void main(String[] args) {
		ArrayList<Emp> al= new ArrayList<Emp>();
		al.add(new Emp(100, 30, "raju"));
		al.add(new Emp(109, 25, "arjun"));
		al.add(new Emp(200, 20, "manoj"));
		al.add(new Emp(107, 40, "xender"));

		System.out.println("sorting by name");
		Collections.sort(al, new NameComparator());
		for (Emp e: al) {
			System.out.println("emp id is: "+e.id+"|||"+"Age of emp is: "+e.age+"|||"+"Emp name is: "+e.name);
		}
		
		System.out.println("sorting by age");
		Collections.sort(al, new AgeComparator());
		for (Emp e1: al) {
			System.out.println("emp id is: "+e1.id+"|||"+"Age of emp is: "+e1.age+"|||"+"Emp name is: "+e1.name);
		}
	}
}
