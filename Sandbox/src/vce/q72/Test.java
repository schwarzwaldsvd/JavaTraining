package vce.q72;

import static java.lang.System.out;
public class Test {

	/**
	 * @param args
	 */
	int z;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test myScope = new Test();
		int z = 6;
		out.println(z);
		myScope.doStuff();
		out.println(z);
		out.println(myScope.z);
	}
	void doStuff(){
		int z = 5;
		doStuff2();
		out.println(z);
	}
	void doStuff2(){
		z = 4;
	}
}
