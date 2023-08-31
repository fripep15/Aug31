package PracticeCode;

import java.util.Scanner;

public class SumEvenOdd {

	public static void main(String[] args) {

/*   
  Write a program that reads a range of 
integers (start and end point), provided by a 
user and then from that range prints the 
sum of the even and odd integers.

 */
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println( " Give me two nunbers to print the INT between these numbers ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		for (int i=a; i<=b;i++) {
			
			if (i%2==0) {
				
				int result2=i+i;
				System.out.println(i);
		
			}
			System.out.print(i+",");
		}
		
		
		

	}

}
