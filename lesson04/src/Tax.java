
public class Tax {
	private double grossIncome; // class member variables
	private String state;
	private int dependents;
	
	static int customerCounter;
	
	// Constructor
	Tax (double gi, String st, int depen){
		grossIncome = gi; // member variable initialization
		state = st;
		dependents=depen;
		customerCounter++;
		// increment the counter by one
		System.out.println("Preparing the tax data for customer #" + customerCounter);
	}
	
	public double calcTax(){
		return (grossIncome * 0.33 - dependents * 100);
	}
	
	public static void convertToEuros(double taxUsd){
		System.out.println("Tax in Euros: " + taxUsd * 1.25);
	}
}
