package PracticeCode;

import java.util.Scanner;

public class SwitchP {
	
	public static void main(String[] args) {
		
		// Switch :  Country / Language   --
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println( " Give me a country Name, will give you the Language for it");
		
		//String country=sc.nextLin();
		byte grade=55;
		
		switch(grade) {
	
		case 'a':
			
			System.out.println( " Pashto");
		
		break;
	case 'b':
			
			System.out.println( " Persian");
		
		break;
		default:
			
			System.out.println(" country not in our List");
		
		
		}
	}

}
