
public class Car extends Insurance {
	
	Car(String insuranceName) {
		super(insuranceName);
		// TODO Auto-generated constructor stub
	}

	String carModel;

	@Override
	public void getQuote() {
System.out.println(" Car method ");

	}

	@Override
	void cancelInsurance() {
		System.out.println(" Car method 2 ");
		
	}
	
	
	

}
