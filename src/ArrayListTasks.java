import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTasks {

	public static void main(String[] args) {

		
		/*    	 
		 Create an arrayList of drinks. If any drink has 
letter “a” or “e” replace it with water. 

*/
		
//		ArrayList <String> ar =new ArrayList<String>();
//		
//		ar.add("Cola");
//		ar.add("Sodae ");
//		ar.add("Pepsi");
//		ar.add("monochrom");
//		 
//	 for (int i = 0; i < ar.size(); i++) {
//         String str = ar.get(i);
//         if (str.contains("a") || str.contains("e")) {
//ar.set(i, "water")	;	    		
//         }  }
//        System.out.println(ar);

		/*
4. Create an arrayList of even numbers from 1 
to 50. Using Iterator remove any number that 
is divisible by 5 from that arrayList.
Tas
		 
		 */
        
        ArrayList ar2=new ArrayList<Integer>();
        
        
        for (int a=1;a<=50;a++) {
        	
        	if ( a%2==0 ) {
        		
        		ar2.add(a);
        		
        	} }
        
       int size= ar2.size();
       System.out.println(size);
       System.out.println(ar2);
        
     	   
    		 
    		   // %5
       
Iterator <Integer> it	= ar2.iterator();

while (it.hasNext()) {
	
	int number=it.next();
	
	if ( number%5==0) {
		it.remove();
	}	
}
		
		System.out.println(ar2 + " removed % 5");
		
	}

}
