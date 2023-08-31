package PracticeCode;

public class FlipNumberString {

	public static void main(String[] args) {

	// Flip number
		
		int num=50;
		int num1=55;
		
		num=num+num1;
		
		num1=num-num1;
		num=num-num1;
		
		System.out.println( " num = "+ num + "num1 = "+num1);
		// flip String
		
		String str, str1;
		
		str="Welcome  ";
		str1=" Home ";
		str=str+str1;  // Welcome Home
		
		str1=str.substring(0, (str).length()-str1.length());
		System.out.println(str1);
		
		str=str.substring(str1.length());
		
		System.out.println(" str ="+ str);
		
		System.out.println(str + str1);
	
	
	}
	}
	

