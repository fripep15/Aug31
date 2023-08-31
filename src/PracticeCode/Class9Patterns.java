package PracticeCode;

public class Class9Patterns {

	public static void main(String[] args) {
		/*
		 
		 Print the following pattern:
55555
4444
333
22
1 
2. Print the following pattern:
*
**
***
****
*****
****
***
**
*

		 */
		int rows = 5; // Number of rows in the pattern

        // Upper half of the pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the pattern
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
		
	}

}}
