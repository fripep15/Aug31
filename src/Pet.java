
public class Pet extends  Insurance{
	
	Pet(String insuranceName) {
		super(insuranceName);
		// TODO Auto-generated constructor stub
	}

	String petType;

	@Override
	public void getQuote() {
System.out.println("  method Pet ");

	}

	@Override
	void cancelInsurance() {
		System.out.println(" Pet method 2 ");
		
	}	

}
