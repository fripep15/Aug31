package PracticeCode;

import org.openqa.selenium.grid.Main;

public class RevString {
	
	// StringBuilder 
	public static String revmethod(String input) {
		
		StringBuilder sb=new StringBuilder(input);
		
		return sb.reverse().toString();
		
	}
	
	public static void main(String[] args) {
		
	String revWord=" for Reverse";
	
	String print=RevString.revmethod(revWord);
	
	System.out.println(print);
	
	// String Buffer
	
	String word1= " Word1";
	
	StringBuffer sb=new StringBuffer(word1);
	
StringBuffer print2=sb.reverse();

System.out.println(print2);

//2 . String reverse 

String str="12345";

StringBuffer strbr=new StringBuffer(str);

StringBuffer result=strbr.reverse();
System.out.println(result);
	

	}
	
	
}
