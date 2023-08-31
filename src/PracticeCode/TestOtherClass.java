package PracticeCode;

public class TestOtherClass {
	
	
		public static String nameRev(String name) {
			
			StringBuilder sb=new StringBuilder(name);
			
			
			return sb.reverse().toString();
		}
		
		public static void main(String[] args) {
			
			String rev="Junaid";
			String print=TestOtherClass.nameRev(rev);
			
			System.out.println(print);
			
			
			// flip the number
			
			int a=10;
			int b=20;
			
			a=a+b;
			b=a-b;
			a=a-b;
			
			System.out.println(a   +  " b = "+b);
			
			
		}
		
	}


