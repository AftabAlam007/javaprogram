package javaprogram;

import java.util.Scanner;

public class PrintSumOfOddOrEven {

	public static void main(String[] args) {
		
		int n,sum = 0; // sum need 0 value assign;
		
		System.out.println("Enter Number Of Range : ");
		
		Scanner r=new Scanner (System.in);
		
		n=r.nextInt();
		
		if(n%2==0) 
			
		{
			for(int i=0; i<=n; i=i+2)    // For Even number we get a value increment i= i+2
			{
				sum=sum+i;
			}
			System.out.println("Sum Of Even Number :" + sum);
		}
		else	
		{
			for(int i=1; i<=n; i=i+2) // For Odd number we get a value increment i=i+2
			{
				sum=sum+i; // For   continuous value print
			}
			System.out.println("Sum Of Odd Number :" + sum);
		}
			
	
	}

}
