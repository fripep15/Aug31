package PracticeCode;

import java.util.Scanner;

public class MorgageIfCond {

	public static void main(String[] args) {

/*    Create a Java program and store values of
mortgage rate and mortgage price. First, program
should check if rate is higher than 4.5 user will
not buy a house, otherwise user will consider
buying. Once user decides to buy a house, if price
of the house is larger than 200000 than user will
take a loan, otherwise user will pay cash.*/
		
		Scanner sc=new Scanner(System.in);
		System.err.println(" enter grade with one character");
		char str=sc.next().charAt(0);
		System.out.println(" your grade is=   "+str);
		
		System.out.println(" What is interest rate");
		
		double rate=sc.nextDouble();
		
		if (rate>4.5) {
			
			System.out.println(" Not Buying house , rate is high ="+rate);
			
		}else if (rate<=4.5) {
			System.out.println(" Will consider buying, rate is ="+rate);
			System.out.println(" What is the price ");
			double price=sc.nextDouble();
			if (price>200000) {
				System.out.println(" Get a loan");
				}else if (price<200000){
			System.out.println(" pay cash, price is less then 200 k	"+price);
			}
		}

	}

}
