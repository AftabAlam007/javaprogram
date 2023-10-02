package javaprogram;

import java.util.Scanner;

public class Inputvalue {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int a;
		
		Scanner obj = new Scanner (System.in);
		
		System.out.println("Enter Value ");
		a=obj.nextInt();
		
		System.out.println(a);
		

	}

}
