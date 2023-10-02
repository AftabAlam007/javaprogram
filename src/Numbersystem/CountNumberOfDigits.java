package Numbersystem;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		
		int n,count=0;
		
		System.out.println("Enter Any Number :-");
		
		Scanner r = new Scanner (System.in);
		
		n=r.nextInt();
		
		while(n>0)
		{
			n=n/10;
			count++;
			
		}
		System.out.println("No Of Digits :-"+" "+ count);
		
		

	}

}
