package string_program;

import java.util.Scanner;

public class AsciiValueOfCharacter {

	public static void main(String[] args) {

		//This  is  program for ASCII Value with character
		
		char ch;
		
		System.out.println("Enter A Character : ");
		
		Scanner r=new Scanner(System.in);
		
		ch=r.next().charAt(0);
		
		int a = ch;
		
		System.out.println("Ascii Value Of   "+ ch +"  "+ "is" +" : "+a);
	}

}
