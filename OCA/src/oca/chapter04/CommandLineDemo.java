package oca.chapter04;

public class CommandLineDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The command line has "
                + args.length + " arguments");
        for (int i = 0; i < args.length; i++) {
            System.out.println("\tArgument Number " + i + ": " + args[i]);
        }
	}

}
