import	java.util.Scanner;
public class FriendsAndFamily {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner	input=	new	Scanner(System.in);
		int i = 1;
		do {
			//System.out.printf("Attempt no. %", i);
			System.out.printf("Attempt no.%d%n", i);
			System.out.print("Enter list price: ");
			double listPrice = input.nextDouble();
			System.out.print("Enter discount %: ");
			int	discount = input.nextInt();
			System.out.printf("You'll pay only $%2.2f", listPrice - listPrice*discount/100);
			System.out.println("");
			++i;
		} while (i<=3);		

	}

}
