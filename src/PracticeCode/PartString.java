package PracticeCode;

public class PartString {

	public static void main(String[] args) {
		
		
		int age=55;
		int number=255;
		double number1=55.5;
		 double mult= age+number;
		 System.out.println(" *****************************");
		 System.out.println(mult);
		char character='A';
		
		String address="=        =jdkljdlkfjdkljlk44333366********";
		System.out.println(address + "   "+number);
		
		
		
String str=" Hello Afghanistan";

str.substring(0);

System.out.println();



String sentence="AAxAAabcd1234)(*&^%$#@!";

// remove the alphabits

String removedAlpa= sentence.replaceAll("[a-zA-z]", " ");
System.out.println(removedAlpa);

// remove number and special characters

String removedChar=sentence.replaceAll("[^a-z]", " ");

System.out.println(removedChar +"       this is char");

String one1=sentence.toLowerCase();
char two=sentence.charAt(2);
 
sentence.substring(5);

//sentence.substring('x');

// reverse a string 


	}

}
