import java.util.ArrayList;
import java.util.Iterator;

 public class Insurance_Main {
	
	public static void main(String[] args) {
		
		Car car=new Car("New ");
		Pet pet =new Pet("Old ");
		Health health=new Health("Medium");
		
		ArrayList ar=new ArrayList();
		
		ar.add(health);
		ar.add(pet);
		ar.add(car);
		
		

		 car.cancelInsurance();
		 car.getQuote();
		  health.cancelInsurance();
		  health.getQuote();
		  
		Iterator it= ar.iterator()	;
		
		while (it.hasNext()) {
			
		 Object str =(Insurance) it.next();
		 
		 

		}
		

		
	}
	

}
