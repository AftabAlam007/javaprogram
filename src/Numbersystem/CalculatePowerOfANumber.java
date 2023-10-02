package Numbersystem;

import java.util.Scanner;

public class CalculatePowerOfANumber {

	public static void main(String[] args) {
		
		int n,p,result=1;
		
		System.out.println("Enter A Number ::---");
		
		Scanner r=new Scanner(System.in);
		
		n=r.nextInt();
		
		System.out.println("Enter A Power ::---");
		
		p=r.nextInt();
		
		
		for(int i=1; i<=p; i++) 
		{
			result=n*result;
		}
		
		System.out.println("Power ::---"+ result);

	}

}
