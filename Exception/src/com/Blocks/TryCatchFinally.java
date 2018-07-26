package com.Blocks;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			//int a[] = {1,2,3,4,5};
			int a[]= new int[5];
	         System.out.println("Access element three :" + a[7]);
		}
		catch(NullPointerException a) {   //using multiple catch
			System.out.println(a);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(a);
			System.out.println("inside catch block");
		}
		catch(ArithmeticException a) {
			System.out.println(a);
		}
		catch(Exception a) {
			System.out.println(a);
		}
		
		finally {
			System.out.println("inside finally block");
		}
		
	}

}
