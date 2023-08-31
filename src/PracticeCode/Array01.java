package PracticeCode;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
		
		/*         
	Create an array of chars and store grades into
it: A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array).

2. Create an array of names and store all names of your group. Then print your name from
that array. (use 2 different ways of creating an array).

3. Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using elements of array: “Saturday is Java coding
Day”*/
	
		String [] words= {"Java", "Satureday","day", "coding","is"};

		int num=words.length;
		System.out.println(num);
		
		String str0=words.toString();
		System.out.println(str0 );
	//	String str3=Arrays.toString(words);
		
		//Arrays.toString(words);
		//System.out.println(str3 + "   =String method print");
		
		System.out.print(words[1]+" "+words[4]+" "+words[0]+" "+words[2]);
		
		for (String words2:words) {
			
			
		}
		
		
		
		
		
		// array of Name
		
//		String[] name=new String[3];
//		name[0]="Ali";
//		name[1]="Aslam";
//		name[2]="Khan";
//		
//		
////		String name1=Arrays.toString(name);
////		System.out.println(name1);
//		
//		for (String name3:name) {
//			
//			if (name3.equalsIgnoreCase("ali")|| name3.equalsIgnoreCase("Khan")){ 
//				
//				System.out.print(name3 +" , ");
//			}
//		}
		
		
		
//		char [] charArray=new char[5];
//		
//		char array1 []=new char[5];
//		char [] array2= {'a','b','c','d','e'};
//		charArray [0]='a';
//		charArray[1]='b';
//		
//		//String str=Arrays.toString(array2);
//		//char grade=str.charAt(3);
//		
//		
//	System.out.println(array2[1]);
		
	}

}
