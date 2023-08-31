import java.lang.reflect.Array;

public class NewTest {
	
	
	// 1234abcd
	// output d1c2b3a4
	
	
	public static void main(String[] args) {
		
		
		
		
	

	
	// Flip the int 
	
	int a=10;
	
	int b=20;
	
	 a=a+b;
	 b=a-b;
	 a=a-b;
	 
	 System.out.println(a +"  value of new a" + " , Value of b "+  b);
	 
	 
	 // Flip String 
	 
	 String str1="Muhammad";
	 String str2="Junaid";
	 
	 str1= str1+str2;
	 
	 str2= str1.substring(0,8);
	 
	 str1=str1.substring(8, 14);
	 
	 System.out.println("Str1 is = "+ str1 +" ,  Str2 is ="+str2);
	 
	 // Reverse String 
	 
	 String name="Junaid";
	 
StringBuilder reverse=new StringBuilder(name).reverse();

System.out.println(reverse.toString());

 
}	

}
