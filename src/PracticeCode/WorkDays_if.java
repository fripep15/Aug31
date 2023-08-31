package PracticeCode;

import java.util.Scanner;

/*  Write a program to ask user to enter numbers
of worked years and annual salary. If user
worked for more or equals to 5 years than user
is eligible for the bonus, otherwise he is not.
Once user is eligible and salary is larger than
50000 than bonus = 5000, otherwise
bonus=3000.*/
public class WorkDays_if {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" How many years of experience do you have in your current job ");
		double experience=sc.nextDouble();
		
		System.out.println(" What is your slary in USD ");
		Double salary=sc.nextDouble();
		double bonus=5000;
		double bonus2=3000;
		if (experience>= 5 && salary>=5000) {
			System.out.println(" your elegible for Bonus "+ bonus);
		}else if ( experience>=5 && salary<5000) {
				
		System.out.println(" your elegible for Bonus Grade B ="+bonus2);
		
	}else if( experience <5) {
		
		System.out.println(" you are not elegible, because your experience is less then 5 years, your actual expereince is = "+experience);
	}

}}
