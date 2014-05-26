
public class Tax {
	double grossIncome;
	String state;
	int numberOfDependents;
	
	Tax(double gi, String s, int nod){
		grossIncome = gi;
		state = s;
		numberOfDependents = nod;
	}
	
	public double calcTax(){
		if(grossIncome < 50000){
			return grossIncome * 0.06;
		} else {
			return grossIncome * 0.08;
		}
	}
}