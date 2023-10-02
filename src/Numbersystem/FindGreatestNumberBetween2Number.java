package Numbersystem;

import java.util.Scanner;

public class FindGreatestNumberBetween2Number {

	public static void main(String[] args) {
		
		System.out.println("Enter A Number : ");
		int a , b;
		
		System.out.println("Enter Two Number :-");
		
		Scanner r= new Scanner(System.in);
		
		a=r.nextInt();
		
		b=r.nextInt();
		
		if(a>b) 
		{
			System.out.println("There is a Lowest Number"+"::"+ a ); 
		}
		else 
		{
			System.out.println("There is a Greatest Numberb "+"::"+ b); 
		}

	}

}
