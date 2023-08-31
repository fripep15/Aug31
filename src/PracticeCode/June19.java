package PracticeCode;

public class June19 {
	
	
	// Flip String 
	
	public static void main(String[] args) {
		
	
	
	String str1= " First Word ";
	String str2 = " Second Word";
	
 str1=str1+str2;
 
 str2= str1.substring(0, str1.length()-str2.length());
 
 str1=str1.substring(str2.length());
 System.out.println(str2  + " , - value of str1 is  = "+ str1);
	
	}

}
