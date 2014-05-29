package oca.chapter02;

public class CustomerDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer;			// defines a reference to a Customer
        customer = new Customer();	// Creates a new Customer object		customer.setBalance(12506.45f);
        System.out.println(customer.toString());
	}

}
