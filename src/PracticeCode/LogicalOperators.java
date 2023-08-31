package PracticeCode;

import java.util.Scanner;

public class LogicalOperators {
	
	/*  Write a program that will print whether it is a
weekend or weekday. If any day from 1-5 →
output “It is a weekday”, anyday from 6-7 →
output “It is a weekend”, any other day →
output “Invalid day”*/
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" What is the week days, give the number 1 to 5 for weekdays and Weekened is 6 , 7 ");
		
		int day=sc.nextInt();
		 
		if (day==1 || day==2||day==3||day==4||day==5) {
			System.out.println( " Week Day , becuase your number is = "+ day);
		}else if ( day==6|| day==7) {
			System.out.println(" Weekend because your given number is = "+day);
		}else {
			System.out.println(" Invalid number, please enter number 1 to 7 ");
		}
		
		
		
		
	}

}
