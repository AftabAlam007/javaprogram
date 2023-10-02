package string_program;

import java.util.Scanner;

public class PrintCharacterInJava {

	public static void main(String[] args) {
		
		char ch;
		
		System.out.println("Enter character Please :");
		
		Scanner r=new Scanner (System.in);
		
		ch=r.next().charAt(0);
		
//		charAt(0) for first number position assigned;
		
//		next()  require to char input and charAt also need to char value assign; 
		
		System.out.println(ch);

	}

}
