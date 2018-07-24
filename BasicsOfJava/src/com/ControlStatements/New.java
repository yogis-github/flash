package com.ControlStatements;

public class New {

	public static void main(String[] args) {
		int rows = 6;
		int i=0,j=0,n=4,k=1;
		for(i=1; i<n+1; i++)
		{
			for(j=0; j<i; j++)
				System.out.print("* "+k++);
			System.out.println(" ");
		}
		for( i = rows; i >= 1; --i) {
			for(j = 1; j <= i; ++j) {
				System.out.print(j+"* ");
			}System.out.println(" ");
		}

	}
}


