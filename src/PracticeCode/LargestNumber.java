package PracticeCode;

import java.util.Scanner;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LargestNumber {

	public static void main(String[] args) {
/*    . Write a program to find largest of three double values using if-else..if and logical operators provided by a
user (numbers must be distinct)



    */
		
		double num1=-10;
		double num2=-20;
		double num3=-30;
		
		if (num1>num2 && num1>num3) {
			System.out.println( " num1 is the largest , number ="+num1);
		}else if(num2>num1 && num2>num3) {
			System.out.println(" number2 is largest , number = "+num2);
		}else if (num3>num2 && num3>num1) {
			System.out.println( "num3 is largest , number = "+num3);
		}
		// 2. Program to find largest number among three numbers using nested if provided by a user (numbers must be
		//distinct)
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" give me your first number in double ");
		double number1=sc.nextDouble();
		
		System.out.println(" give me your second number in double ");
		double number2=sc.nextDouble();
		
		System.out.println(" give me your third number in double ");
		double number3=sc.nextDouble();
		
		if (number1>number2 && number1>number3) {
			System.out.println( " num1 is the largest , number ="+num1);
		}else if(number2>number1 && number2>number3) {
			System.out.println(" number2 is largest , number = "+num2);
		}else if (number3>number1 && number3>number2) {
			System.out.println( "num3 is largest , number = "+num3);
		
		}
		
	}

}
