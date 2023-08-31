package PracticeCode;

import java.util.Scanner;

public class NestedLoopIf {

	public static void main(String[] args) {
		
		/*  ask age, if age is below 60 and 1above 18 say congrates, 
		 * if age is between 18 and 16  - Driving permit
		 * if age is below 16 and above 10school and if age is >60 take taxi ,
		 * if below 10 , you are child , enjoying playing with toys */
		
		Scanner sc=new Scanner(System.in);
		
	System.out.println(" What is your age in years");
	
	double age=sc.nextDouble();
	
	if (age>= 18 && age<60) {
		System.out.println(" your age is good for DL, your age is = "+ age);
	}else if (age<18 && age>16) {
		System.out.println(" you will get a driver permit  ="+ age);
	}else if(age>=60) {
		System.out.println(" your age is high, better to Use Taxi, no driver lisence will be issued = "+age);
	}else if(age<=16 && age>10) {
		System.out.println(" your age is for school and not for DL "+ age );
	}else {
		
		System.out.println(" You are child , enjoy playing with toys");
	}
		
		
		
	}
}
