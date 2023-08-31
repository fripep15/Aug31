package PracticeCode;

import java.util.Scanner;

public class CreditCardForLoop {

	public static void main(String[] args) {
		/*       Create a program that will be asking
user to apply for a credit card 10
times. As soon you get an “yes” from
a user program should stop asking */
		
		
		Scanner sc=new Scanner(System.in);
		for (int i=0; i<=5;i++) {
			System.out.println(" Do u need credit card");
			boolean answer=sc.nextBoolean();
			
			if (answer==true) {
				System.out.println(" Thanks , we will not ask more question");
				break;			
		
			}
				
		}}}
		
		
	


