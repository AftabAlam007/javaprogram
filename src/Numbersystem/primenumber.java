package Numbersystem;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		int num=1,i=2;
		
		System.out.println("Enter a value: ");
		
		Scanner r = new Scanner (System.in);
		
		num=r.nextInt();
		
		while(i<=num/2) 
		{
			
			if(num% i==0)
				
			{
			System.out.println("Not a Prime ");
		break;
	   }
	
	i++;
	
	}
		
		if(i>num/2) 
		
		{
			System.out.println("Prime Mumber :-");
			
			System.out.println(i);
		}

}
}
