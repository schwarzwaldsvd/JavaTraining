import java.util.Scanner;
public class TestTax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner	input=	new	Scanner(System.in);
//		Tax t = new Tax();
		NJTax t = new NJTax(804000, "NY", 2);
		
//		System.out.print("Enter your gross income: ");
//		t.grossIncome = input.nextDouble();
//		System.out.print("Enter your state: ");
//		t.state = input.next();
//		System.out.print("Enter number of dependents: ");
//		t.numberOfDependents = input.nextInt();
		
		double yourTax = t.adjustForStudents(t.calcTax());
		
		System.out.println("Your tax is: "+ yourTax);

	}

}
