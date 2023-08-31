package PracticeCode;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		/*  HomeWork: Using scanner class create
calculator. Allow user to enter 2 numbers and
operator(+,-,*,/). Based on operator provide the
result to user.*/
			
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" Enter your first number");
		
		double firstNumber=sc.nextDouble();
		
System.out.println(" Enter your second number");

		
		double secondNumber=sc.nextDouble();
		
		System.out.println(" Enter your preffered action from *, +, - and /");
		
		char action=sc.next().charAt(0);
		double multiply=firstNumber*secondNumber;
		double addition=firstNumber+secondNumber;
	double devision=	firstNumber/secondNumber;
	double subtraction=firstNumber*secondNumber;
	
	switch (action){
	

	case '+':
		//System.out.println(addition);
		System.out.println(firstNumber+secondNumber);
		break;
case '_':
		
		System.out.println(subtraction);
		break;
case '*':
	
	System.out.println(multiply);
	break;
case '/':
	
	System.out.println(devision);
	break;
	default:
		
		System.out.println(" Action not recognized ");
		
	}
			
	}

}
