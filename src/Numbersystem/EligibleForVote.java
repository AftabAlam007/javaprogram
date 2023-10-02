package Numbersystem;

import java.util.Scanner;

public class EligibleForVote {

	public static void main(String[] args) {
		
		
		int age;
		
		System.out.println("Enter A valid Age :-->"+"  ");
		
		Scanner r = new Scanner(System.in);
		age=r.nextInt();
		
		if(age>18) 
		{
			System.out.println(" Eligible For Vote :--->");
		}
		else 
		{
			System.out.println("Hello Studen "+"  :---> Not Eligible For Vote");
		}
		

	}

}
