package PracticeCode;

import java.util.Scanner;

public class Scanner_Temperature {

	public static void main(String[] args) {
/*   Create a Java program that will ask user to
input city and temperature. Your program
should convert Fahrenheit into celsius and
print “The temperature is the city __ is __”*/
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println( " What is your City name ");
		
		
	String city=	sc.next();
	System.out.println(" what is the temperature in C ");
	double temp_C=	sc.nextDouble();
	
	double temp_F= (temp_C*9/5)+32;
	
	// (0°C × 9/5) + 32 = 32°F

	System.out.println(" Your City is = "+ city +" and Temperature in F is  = "+ temp_F );
	
		
	}

}
