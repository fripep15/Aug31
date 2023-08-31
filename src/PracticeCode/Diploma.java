package PracticeCode;

import java.util.Scanner;

public class Diploma {
	/*    Write a program to store a boolean value of
whether user has diploma or not. If user has a
diploma, you should say congratulations,
otherwise program should suggest to get a
degree. Then if user has a degree program should
check a gpa score. If gpa score is higher or equals
to 3.5 → output should say “You are eligible for
scholarship”, otherwise → “You should have
studied harder” .*/
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" Do u have diploma, true or False");
		boolean diploma=sc.nextBoolean();
		
		
		if (diploma==true) {
			
			System.out.println(" Congradulations for having diploma");
			System.out.println( " what is your gpa");
			double gpa=sc.nextDouble();
			
		 if( gpa>=3.5) {
			System.out.println(" You are elegible for scholarship with gpa= "+gpa);
		} if (gpa<3.5) {
			System.out.println( " you are not elegible , gpa = "+gpa);
		
		}}else {
			System.out.println( " get a degree");
		}
		
		
		} 
		}
	
/*          if (hasDiploma) {
      */


