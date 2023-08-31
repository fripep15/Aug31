package PracticeCode;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		
		/*   Write a program that will print whether it is a
weekend or weekday. If any day from 1-5 →
output “It is a weekday”, anyday from 6-7 →
output “It is a weekend”, any other day →
output “Invalid day”
*/
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println( " Enter Day in Integer from 1 to 7 ");
		int day=sc.nextInt();
		
		if (day==1||day==2||day==3||day==4|day==5) {
			
			System.out.println( " Week day "+ day);
		}else if (day==6||day==7) {
			System.out.println( "Weekend b/c "+day);
		}else {
			
			System.out.println( " Enter nunber in given range , n/a ");
		}

	}

}
