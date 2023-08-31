
public class Worktest {
	
	
	
	public static String stringRe(String input) {
		
		StringBuilder strB	=new StringBuilder(input);
		
		
		
		return strB.reverse().toString();
	}
	
	
	public static void main(String[] args) {
		
	String reverse="Junaid";
	String print=Worktest.stringRe(reverse);
	System.out.println(print);

}
}