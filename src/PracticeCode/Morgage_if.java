package PracticeCode;

public class Morgage_if {

	public static void main(String[] args) {
		
		/*Create a Java program and store values of
mortgage rate and mortgage price. First, program
should check if rate is higher than 4.5 user will
not buy a house, otherwise user will consider
buying. Once user decides to buy a house, if price
of the house is larger than 200000 than user will
take a loan, otherwise user will pay cash.*/
		
		double morgage =4.0;
	double	price =5000.00;
		if (morgage>=4.5) {
			System.out.println(" rate is high then 4.5, NOT buying home");
		}else {
			
			System.out.println(" Rate is good, will BUY home");
		}if (price>200000) {
			System.out.println(" Price is high , not buying home");
		}else {
			
			System.out.println(" Good interest rate and good Price, will BUY it ");
		}
		
		
		
		
	}

}
