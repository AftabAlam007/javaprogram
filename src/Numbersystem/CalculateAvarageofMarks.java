package Numbersystem;

import java.util.Scanner;

public class CalculateAvarageofMarks {

	public static void main(String[] args) {
		
		
		int a,b,c,d,e;
		
		System.out.println("Enter Marks Of Five Subjects :-- ");
		
		@SuppressWarnings("resource")
		Scanner r= new Scanner(System.in);
		
		a=r.nextInt();
		b=r.nextInt();
		c=r.nextInt();
		d=r.nextInt();
		e=r.nextInt();
		
		int sum=a+b+c+d+e;
		System.out.println("Total Marks :--"+sum);
		int avg=sum/5;
		System.out.println("Average Marks :--" + avg);
		
	
	}

}
