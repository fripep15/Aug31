package PracticeCode;

import java.util.Scanner;

public class GuesSecreteNumber {

	public static void main(String[] args) {

		/*             Write a guessing game where the user has
to guess a secret number between 1 and 20. After every guess input, the program tells
the user whether their number was too large or too small. The program will keep asking the user to enter the number until he finds the correct number. When the
correct answer is found the system should display "Congratulations!!. You got it!*/
		
		double secreteNumber=15;
		
		Scanner sc=new Scanner(System.in);
		
		
		double answer=0;
		
		for (int i=0;i<=20;i++) {
			System.out.println(" Gues the Number between 0 - 20, ");
			 answer=sc.nextDouble();
		
		
		if( secreteNumber==answer) {
			
			System.out.println(" Congradulation, Your answer is right ");
			break;
		}else if (answer<secreteNumber) {
			System.out.println( " Your number is small = "+answer );
		}else if (answer>secreteNumber) {
			System.out.println(" your answer is large then the given number = +answer");
//		}else {
//			System.out.println(" Number is not in given range ");
		}
		
	}}

}
