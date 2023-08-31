package PracticeCode;

import java.util.Scanner;

public class Scanner_Test {

	public static void main(String[] args) {
	
		
Scanner sc=new Scanner(System.in);

System.out.println(" What is your name ");

String name=sc.next();

System.out.println(name);

System.out.println("What is your age in years");

int age=sc.nextInt();

System.out.println(" Glade that you are "+age+" Years old" );

	}

}
