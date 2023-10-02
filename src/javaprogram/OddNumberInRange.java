package javaprogram;

import java.util.Scanner;

public class OddNumberInRange {

	public static void main(String[] args) {
		
		int n;
		
//		here we taken a n value for odd number  value range
		
		System.out.println("Enter Number Of Range :");
		
		Scanner r=new Scanner(System.in);
		
		n=r.nextInt();
		
			
		for(int i=1; i<=n; i=i+2)
			
//			here we can increment i with 2 , i+2 = when ewe take 3  then 3 +2 = 5
			
		{   
			System.out.print(i+"     ");
		}

	}

}
