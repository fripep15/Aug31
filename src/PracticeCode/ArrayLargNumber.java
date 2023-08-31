package PracticeCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayLargNumber {

	public static void main(String[] args) {
	
		/*     Write a java program to find the second largest number in the array? Maximum
and minimum number in the array?*/
		
		
		double [] num=new double[6];
		num[0]=-50;
		num[1]=502;
		num[2]=60;
	num[3]=-66;
	num[4]=122;
	num[5]=70;
		
	// 1. sort array method - larest -1, second largest -2, thirdLargest -3 
	 Arrays.sort(num);
	 System.out.println(" Second largest is = "+num[num.length-3]);
	 
	 // Largest number , smallest number 
	 // Arrays.sort(num) - on zero the smallest and highest number the highest
	 
	 double smallest= num[0];
	 double maximum=num[5];
	 
	 System.err.println(" largest number ="+ maximum +" , smallest in Array is = "+smallest);
	 
	
		// using for loop method
//		for (int i=0;i<=num.length-1;i++) {
//			
//			if (num[0]>num[1] &&num[0]>num[2] ) {
//			
//				System.out.println("Largest Number is = "+num[0]);
//				break;
////			System.out.println(num[i]);  // prit all numbers 
//		}else if (num[1]>num[2]&& num[1]>num[3]) {
//			System.out.println("Largest Number is = "+num[1]);
//			break;
//		}else {
//			System.out.println( " Your number is large "+ num[2]);
//		break;
//		}
//			
//		}
		
		// using Enhanuced Loop method 
		
		for (double num1:num) {
			
			if (num[0]>num[1] &&num[0]>num[2] ) {
				
				System.out.println("Largest Number is = "+num[0]);
				break;
//			System.out.println(num[i]);  // prit all numbers 
		}else if (num[1]>num[2]&& num[1]>num[3]) {
			System.out.println("Largest Number is = "+num[1]);
			break;
		}else {
			System.out.println( " Your number is large "+ num[2]);
			break;
		}
			
	//	}	
			
			
		}
		

	}

}
