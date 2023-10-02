package javaprogram;

import java.util.Scanner;

public class Sumof2number {

	public static void main(String[] args) {
		int a,b,sum;
		System.out.println("Enter Two Number");
		@SuppressWarnings("resource")
		Scanner r= new Scanner (System.in);
//		we take value of a,b  50 & 80 
//		a=50;
//		b=80;
		
		a=r.nextInt();
		b=r.nextInt();
		
	    sum = a + b;
//		sum of two no a+b=130
	    
		System.out.println("Addition Of Two Number : "+ sum);
		
//		sum occupied space to a+b value 130
	}
}
