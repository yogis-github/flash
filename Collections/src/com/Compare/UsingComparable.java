package com.Compare;
import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee> {
	int id;
	String name;
	int age;
	
	 Employee(int id, String name, int age){
		this.id= id;
		this.name= name;
		this.age= age;	
	}
	 
	@Override
	public int compareTo(Employee e) {
		if(age == e.age)
		return 0;
		else if(age > e.age)
			return 1;
		else
			return -1;
	}
}

 class UsingComparable{
	 public static void main(String[] args) {
		 
		ArrayList<Employee> obj= new ArrayList<Employee>();
		obj.add(new Employee(1, "jai", 30));
		obj.add(new Employee(3, "sanju", 20));
		obj.add(new Employee(10, "manoj", 19));
		obj.add(new Employee(5, "saroj", 50));
		
		Collections.sort(obj);  
		for(Employee s:obj){  
		System.out.println(s.id+" "+s.name+" "+s.age);  
		}  
	}
 }