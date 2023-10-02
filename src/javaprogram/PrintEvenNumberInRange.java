package javaprogram;

import java.util.Scanner;

public class PrintEvenNumberInRange {

	public static void main(String[] args) {
		
//   Even number mean divide is zero means given no reminder 
		int n;
		
		System.out.println("Enter Number Of Range : ");
		
		Scanner r=new Scanner(System.in);
		
		n=r.nextInt();
		
		for(int i=0; i<=n; i=i+2) 
			
		{
			System.out.print(i+"     ");
			
			
		}
	}

}
