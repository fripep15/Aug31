
public class Health  extends  Insurance{

	Health(String insuranceName) {
		super(insuranceName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getQuote() {
System.out.println(" heatlth method ");

	}

	@Override
	void cancelInsurance() {
		System.out.println(" health method 2 ");
		
	}
}
