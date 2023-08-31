package PracticeCode;

import java.util.Scanner;

public class SwitchPractice {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		/*
		System.out.println( " Enter day number in INT format ");
		int day=sc.nextInt();
		//int day=2;
		switch(day){
			
		case 5:
				System.out.println(" number 1");
			break;
		case 4:
			System.out.println(" Day 2");
			break;
			default:
				
				System.out.println(" Number NOT vlaid");
		}
		
		*/
		
		/*    Ask user to enter their country and capture it.
Once values are captured print which language
user speaks */
		
		
		System.out.println(" Enter your country Name");
		
	String country=	sc.next();
	// country=country;
	country.equalsIgnoreCase(country);

	switch(country) {
	case "Pakistan":
		System.out.println( " Urdu");
		break;
	}
		
		
		
	}

}
