package oca.chapter01;

import java.util.Locale;
import java.math.BigDecimal;

public class CustomerDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Define a reference and creates a new Customer object
        Customer customer;
        //customer = new Customer("Andrew White", 781513, Locale.UK, new BigDecimal("0"));
        customer = new Customer();
        //customer.balance = new BigDecimal(12506.45f);                
        customer.setBalance(12506.45f);
        System.out.println(customer.toString());
        
//        java.util.Properties properties = System.getProperties();
//        properties.list(System.out);
	}

}
