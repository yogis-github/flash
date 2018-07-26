package com.Blocks;
import java.util.Scanner;

class CartoonException extends RuntimeException{
	 CartoonException(String s) {
		super(s);
	}
}
class PogoException extends RuntimeException{
	PogoException(String s){
		super(s);
	}
}
public class MyNewException {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the age: ");
		int age= sc.nextInt();
		
		if(age>=5 && age<10) {
			throw new CartoonException("you can watch CartoonNetwork");
		}
		else if(age>=10 && age<15) {
			throw new PogoException("you can watch Pogo");
		}
		else {
			System.out.println("go to study table");
		}
	}

}
