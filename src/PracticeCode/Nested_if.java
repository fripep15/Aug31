package PracticeCode;

public class Nested_if {
	
	/*Write a program to store a boolean value of
whether user has diploma or not. If user has a
diploma, you should say congratulations,
otherwise program should suggest to get a
degree. Then if user has a degree program should
check a gpa score. If gpa score is higher or equals
to 3.5 → output should say “You are eligible for
scholarship”, otherwise → “You should have
studied harder” .*/
	
	public static void main(String[] args) {
		
		boolean diploma=true;
		double gpa=3.05;
		if (diploma==true) {
			
			System.err.println("Congradulation U have Diploma");
		}else {
			
			System.out.println(" b/c u don't have diploma, better to GET ONE");
		} if (gpa>=3.5	) {
			
			System.out.println(" U r approved for Scholarship");
		}else {
			System.out.println("Gpa less then 3.5, work hard to get scholarship");
		}
		
		
		
	}

}
