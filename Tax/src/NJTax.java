
public class NJTax extends Tax {
	NJTax(double gi, String s, int nod) {
		super(gi, s, nod);
	}
	public double adjustForStudents(double tax){
		return tax - 500;
	}
	public double calcTax(){
		if(grossIncome < 50000){
			return grossIncome * 0.10;
		} else {
			return grossIncome * 0.13;
		}
	}
}
