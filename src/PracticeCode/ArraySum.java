package PracticeCode;

public class ArraySum {

	public static void main(String[] args) {

		/*   Create an array on integers and calculate
the sum of all elements in an array.


*/
		
		int [] num= {5,6,6,8,3,2};
	int sum=0;
		for (int i=0;i<=num.length-1;i++) {
			
			sum +=num[i];
			
	
		}
		
		System.out.println(sum);
			
		
	}

}
