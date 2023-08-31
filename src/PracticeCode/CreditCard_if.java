package PracticeCode;

import java.util.Scanner;

public class CreditCard_if {
	
	/*   Create a Java program that will ask if user has a
credit card or not. If you user does not have a
credit card then offer them. If they do have one
ask what is balance on the card? If balance of
the card is larger than 1000, tell them to pay off
immediately, otherwise you can tell them that
they can spend more.*/
	
	// import cnt+shit a+ O
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Do you have Credit card , Yes or No");
		String creditcard=sc.nextLine();
		
		
		double credit=sc.nextDouble();	
		if (creditcard.equalsIgnoreCase("yes")) {		
			System.out.println(" Good , that you have the card");		
			System.out.println(" what is you current credit in USD");	
	
		} else if(credit>=1000 ) {
			System.out.println(" spend your money becuause u have high balance = "+credit);
		 
	
	
		
	}else if (credit<1000){
		System.out.println(" spend more ");
	}
	}
	}


