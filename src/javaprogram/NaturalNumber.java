package javaprogram;

import java.util.Scanner;

public class NaturalNumber {

	public static void main(String[] args) {
		
//		This is program of Natural Number
		int n;
		
		System.out.println("Enter Number Of Term :");
		
		@SuppressWarnings("resource")
		Scanner r= new Scanner (System.in);
		
		n=r.nextInt();
		for(int i=1; i<=n; i++) {
			
			System.out.println(i+" ");
		}

	}

}
