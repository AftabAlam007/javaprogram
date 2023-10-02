package string_program;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		
		// There is a program we are printing  sentence that this sentence are  vowel or consonant ;
		
		char ch;
		
		System.out.println("Enter String Value :");
		
		Scanner r=new Scanner (System.in);
		
		ch=r.next().charAt(0);

	
		if(ch=='a' || ch=='e'  || ch=='i' || ch=='o' || ch=='u') 
			
//			ch==(we should use == to compression with word in charter) is a  compression with Vowel word with OR operator;
			
		{
			System.out.println("Thsi Is A vowel : ");
		}
		else 
		{
			System.out.println("Thsi Is A Consonant : ");
		}
	}

}
