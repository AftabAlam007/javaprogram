package javaprogram;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter Any Number : ");
		@SuppressWarnings("resource")
		Scanner r= new Scanner(System.in);
		n=r.nextInt();

		if(n%2==0) 
		{
			System.out.println("Even Number ");
		}
		else 
		{
			System.out.println("Odd Number ");
		}
		
	}

}
